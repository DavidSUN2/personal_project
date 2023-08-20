
package FastDateFormat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FastDateFormat2 {

    public static boolean debug = false;

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1001");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat2.format((long) (short) -1, stringBuffer7);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1002");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) 'a', timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1003");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = fastDateFormat2.parse("FastDateFormat[h:mm:ss a,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"FastDateFormat[h:mm:ss a,en_US,America/Denver]\" does not match (\\QWednesday\\E|\\QSaturday\\E|\\QThursday\\E|\\QTuesday\\E|\\QFriday\\E|\\QMonday\\E|\\QSunday\\E|\\QFri\\E|\\QMon\\E|\\QSat\\E|\\QSun\\E|\\QThu\\E|\\QTue\\E|\\QWed\\E)\\Q, \\E(\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
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
            System.out.format("%n%s%n", "FastDateFormat2.test1004");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2, locale3);
        java.lang.String str6 = fastDateFormat4.format((long) 100);
        java.lang.String str7 = fastDateFormat4.getPattern();
        java.util.Locale locale8 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) '#', locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1005");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        int int4 = fastDateFormat3.getMaxLengthEstimate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = fastDateFormat3.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1006");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
        int int5 = fastDateFormat0.getMaxLengthEstimate();
        java.util.Locale locale6 = fastDateFormat0.getLocale();
        java.lang.String str8 = fastDateFormat0.format((long) (short) 10);
        java.lang.Object obj9 = fastDateFormat0.clone();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "12/31/69 5:00 PM" + "'", str8.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1007");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(20, timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 20");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1008");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone4);
        java.lang.String str7 = fastDateFormat5.format((long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "5:00:00 PM MST" + "'", str7.equals("5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1009");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(14, locale5);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1010");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.Object obj6 = fastDateFormat3.clone();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone2, locale7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1011");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1012");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str6 = fastDateFormat3.format((long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "5:00:00 PM MST" + "'", str6.equals("5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1013");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale4);
        java.lang.String str7 = fastDateFormat5.format((long) (byte) 1);
        java.lang.Object obj8 = fastDateFormat5.clone();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1014");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
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
            System.out.format("%n%s%n", "FastDateFormat2.test1015");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        java.lang.String str7 = fastDateFormat3.toString();
        java.util.TimeZone timeZone8 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1016");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale1);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1017");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str3 = fastDateFormat1.format(1L);
        java.lang.Object obj5 = fastDateFormat1.parseObject("Wednesday, December 31, 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wednesday, December 31, 1969" + "'", str3.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "Wed Dec 31 00:00:00 MST 1969");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1018");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 2);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = fastDateFormat2.parse("FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]", parsePosition5);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1019");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 3);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(20, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 20");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1020");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.lang.String str6 = fastDateFormat2.getPattern();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        java.lang.String str9 = fastDateFormat2.format((long) 1);
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "12/31/69 5:00 PM" + "'", str9.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1021");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1022");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fastDateFormat2.parseObject("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1023");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str3 = fastDateFormat1.format((long) (short) 0);
        java.lang.Object obj4 = fastDateFormat1.clone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = fastDateFormat1.formatToCharacterIterator((java.lang.Object) fastDateFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1024");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale6);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 10, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1025");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 10, (int) 'a', timeZone6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1026");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1027");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone1, locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = fastDateFormat7.parse("MMMM d, yyyy h:mm:ss a");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"MMMM d, yyyy h:mm:ss a\" does not match (\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
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
            System.out.format("%n%s%n", "FastDateFormat2.test1028");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(14, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1029");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.lang.Object obj6 = fastDateFormat2.clone();
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
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1030");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1031");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.lang.Object obj6 = fastDateFormat4.clone();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 10, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1032");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy h:mm:ss a z");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1033");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1034");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.lang.String str6 = fastDateFormat2.getPattern();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        int int8 = fastDateFormat2.getMaxLengthEstimate();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1035");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.lang.Class<?> wildcardClass6 = locale5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1036");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.Object obj5 = fastDateFormat0.clone();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fastDateFormat0.parseObject("Dec 31, 1969 5:00:00 PM MST", parsePosition7);
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1037");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1038");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(14, (int) '#', locale6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1039");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy");
        java.util.Date date8 = fastDateFormat6.parse("December 31, 1969");
        java.lang.String str9 = fastDateFormat2.format(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str3.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 00:00:00 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Wednesday, December 31, 1969" + "'", str9.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1040");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str5 = fastDateFormat3.format((long) (short) 1);
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        boolean boolean7 = fastDateFormat1.equals((java.lang.Object) fastDateFormat3);
        java.lang.Object obj8 = fastDateFormat3.clone();
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
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1041");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        int int6 = fastDateFormat2.getMaxLengthEstimate();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1042");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1043");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1044");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(21, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1045");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) -1, 10, timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1046");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) -1, (int) (byte) 1, timeZone4);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1047");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.lang.Object obj4 = fastDateFormat3.clone();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.lang.String str8 = fastDateFormat3.format((long) (byte) 1);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str6.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Wednesday, December 31, 1969" + "'", str8.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1048");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone1, locale2);
        java.lang.Object obj4 = fastDateFormat3.clone();
        java.lang.Object obj5 = fastDateFormat3.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1049");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1);
        java.lang.String str4 = fastDateFormat2.format((long) 3);
        java.lang.String str6 = fastDateFormat2.format((long) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Dec 31, 1969 5:00:00 PM MST" + "'", str4.equals("Dec 31, 1969 5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Dec 31, 1969 5:00:00 PM MST" + "'", str6.equals("Dec 31, 1969 5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1050");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("4:59:59 PM MST", timeZone4);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1051");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1052");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2);
        java.lang.String str3 = fastDateFormat1.format((long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4:59:59 PM" + "'", str3.equals("4:59:59 PM"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1053");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.util.Locale locale6 = fastDateFormat2.getLocale();
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
            System.out.format("%n%s%n", "FastDateFormat2.test1054");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        java.lang.Object obj2 = fastDateFormat1.clone();
        java.lang.String str3 = fastDateFormat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1055");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale1);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.String str4 = fastDateFormat2.toString();
        java.lang.Class<?> wildcardClass5 = fastDateFormat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[MMM d, yyyy,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[MMM d, yyyy,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1056");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str4 = fastDateFormat2.format(0L);
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        int int6 = fastDateFormat2.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "5:00:00 PM MST" + "'", str4.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 17 + "'", int6 == 17);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1057");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 3);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        java.lang.Object obj7 = fastDateFormat6.clone();
        java.util.Locale locale8 = fastDateFormat6.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone4, locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1058");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(31, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 31");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1059");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1060");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(13, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1061");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str5 = fastDateFormat3.format((long) 0);
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale6);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale8);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1062");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean2 = fastDateFormat0.equals((java.lang.Object) (-1));
        int int3 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.Object obj4 = fastDateFormat0.clone();
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
            System.out.format("%n%s%n", "FastDateFormat2.test1063");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        boolean boolean4 = fastDateFormat0.equals((java.lang.Object) "M/d/yy h:mm a");
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fastDateFormat0.parseObject("FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]", parsePosition6);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1064");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1065");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.lang.Object obj3 = fastDateFormat2.clone();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1066");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "M/d/yy h:mm a" + "'", str4.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1067");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        int int6 = fastDateFormat2.getMaxLengthEstimate();
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
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 14 + "'", int6 == 14);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1068");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.lang.Object obj7 = fastDateFormat3.clone();
        java.lang.Object obj8 = fastDateFormat3.clone();
        java.lang.String str9 = fastDateFormat3.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str9.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1069");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        int int8 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.Object obj9 = fastDateFormat2.clone();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 17 + "'", int8 == 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1070");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1071");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 100, locale4);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1072");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 100, timeZone4);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1073");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        java.lang.Object obj2 = fastDateFormat1.clone();
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale4);
        java.util.Date date7 = fastDateFormat5.parse("Wednesday, December 31, 1969");
        java.lang.String str8 = fastDateFormat1.format(date7);
        java.lang.Class<?> wildcardClass9 = date7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1074");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone3);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat4.format((long) 31, stringBuffer6);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1075");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str3 = fastDateFormat1.format((long) (short) 1);
        java.util.TimeZone timeZone4 = fastDateFormat1.getTimeZone();
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat1.format(calendar5, stringBuffer6);
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1076");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("December 31, 1969 4:59:59 PM MST", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1077");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.lang.String str6 = fastDateFormat2.getPattern();
        java.lang.Object obj7 = fastDateFormat2.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = fastDateFormat2.parse("MMM d, yyyy");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"MMM d, yyyy\" does not match (\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h:mm:ss a z" + "'", str6.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1078");
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 100, 32, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1079");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone6);
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
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1080");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat1.format((java.lang.Object) "FastDateFormat[MMMM d, yyyy,en_US,America/Denver]", stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "M/d/yy h:mm a" + "'", str2.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1081");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm:ss a z");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1082");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 12:00 AM", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: A");
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
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1083");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) '#', (int) (byte) -1, timeZone4, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1084");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.lang.Object obj2 = fastDateFormat1.clone();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = fastDateFormat1.parse("MMMM d, yyyy h:mm:ss a z", parsePosition4);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1085");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat0.getTimeZone();
        java.lang.String str6 = fastDateFormat0.getPattern();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
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
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1086");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        int int6 = fastDateFormat2.getMaxLengthEstimate();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1087");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy");
        java.util.Date date7 = fastDateFormat5.parse("December 31, 1969");
        java.lang.String str8 = fastDateFormat2.format(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str3.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date7.toString(), "Wed Dec 31 00:00:00 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Wednesday, December 31, 1969" + "'", str8.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1088");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.util.TimeZone timeZone5 = fastDateFormat0.getTimeZone();
        java.util.TimeZone timeZone6 = fastDateFormat0.getTimeZone();
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
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1089");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        java.util.Locale locale7 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 1, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) -1, locale7);
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
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1090");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        java.lang.Object obj2 = fastDateFormat1.clone();
        java.util.Locale locale3 = fastDateFormat1.getLocale();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat1.parseObject("MMM d, yyyy", parsePosition5);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1091");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, locale7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale7);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1092");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.lang.Object obj7 = fastDateFormat2.clone();
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
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1093");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.lang.String str5 = fastDateFormat3.toString();
        java.lang.String str6 = fastDateFormat3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1094");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) 'a', timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1095");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str4.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1096");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.String str5 = fastDateFormat2.format((long) 2);
        java.lang.String str6 = fastDateFormat2.toString();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat2.format((long) (short) 10, stringBuffer8);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1097");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.String str5 = fastDateFormat2.getPattern();
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.lang.Object obj7 = fastDateFormat2.clone();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1098");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
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
            System.out.format("%n%s%n", "FastDateFormat2.test1099");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        int int2 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.String str4 = fastDateFormat1.format((-1L));
        java.lang.String str5 = fastDateFormat1.getPattern();
        java.util.TimeZone timeZone6 = fastDateFormat1.getTimeZone();
        java.lang.String str7 = fastDateFormat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Wednesday, December 31, 1969" + "'", str4.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str5.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str7.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1100");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str5 = fastDateFormat3.getPattern();
        java.lang.Object obj6 = fastDateFormat3.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str4.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str5.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1101");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("Dec 31, 1969 4:59:59 PM MST", timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1102");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = fastDateFormat6.parse("FastDateFormat[h:mm:ss a z,en_US,America/Denver]", parsePosition8);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1103");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.String str4 = fastDateFormat1.toString();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale5);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = fastDateFormat6.equals(obj7);
        java.lang.Object obj9 = fastDateFormat6.clone();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1104");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fastDateFormat2.parseObject("December 31, 1969 5:00:00 PM MST", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1105");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer4 = fastDateFormat1.format((long) 14, stringBuffer3);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1106");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        java.lang.Object obj6 = fastDateFormat3.clone();
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str4.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1107");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(31, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1108");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone2);
        java.lang.Object obj4 = fastDateFormat3.clone();
        java.lang.String str5 = fastDateFormat3.toString();
        java.lang.String str7 = fastDateFormat3.format((long) 1);
        java.util.TimeZone timeZone8 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(17, timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1109");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.lang.Class<?> wildcardClass4 = fastDateFormat2.getClass();
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1110");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.String str5 = fastDateFormat3.toString();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale6);
        java.lang.String str8 = fastDateFormat7.toString();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FastDateFormat[h:mm:ss a z,en_US,America/Denver]" + "'", str8.equals("FastDateFormat[h:mm:ss a z,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1111");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.lang.Object obj2 = fastDateFormat1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = fastDateFormat1.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"hi!\" does not match (\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
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
            System.out.format("%n%s%n", "FastDateFormat2.test1112");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1);
        int int2 = fastDateFormat1.getMaxLengthEstimate();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = fastDateFormat1.parse("EEEE, MMMM d, yyyy h:mm:ss a z", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1113");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.String str5 = fastDateFormat2.toString();
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.util.TimeZone timeZone7 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 10, (int) (short) -1, timeZone7);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1114");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str4 = fastDateFormat2.format((long) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "12/31/69 5:00 PM" + "'", str4.equals("12/31/69 5:00 PM"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1115");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(20, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 20");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1116");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str5 = fastDateFormat3.format((long) 0);
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) ' ', (int) (short) 10, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1117");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        java.util.Locale locale7 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 1, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "FastDateFormat2.test1118");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 100, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1119");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0);
        java.lang.String str3 = fastDateFormat1.format(0L);
        java.lang.String str5 = fastDateFormat1.format((long) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "5:00:00 PM MST" + "'", str3.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5:00:00 PM MST" + "'", str5.equals("5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1120");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.lang.Object obj4 = fastDateFormat3.clone();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1121");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1122");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(21, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 21");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1123");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat4.parse("FastDateFormat[MMM d, yyyy,en_US,America/Denver]", parsePosition6);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1124");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, locale5);
        int int7 = fastDateFormat6.getMaxLengthEstimate();
        java.lang.Object obj9 = fastDateFormat6.parseObject("4:59:59 PM MST");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 17 + "'", int7 == 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "Thu Jan 01 16:59:59 MST 1970");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1125");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1126");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str6 = fastDateFormat3.format(0L);
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        java.util.Locale locale8 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[h:mm:ss a z,en_US,America/Denver]", locale8);
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
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1127");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(21, timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 21");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1128");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, locale5);
        java.lang.String str7 = fastDateFormat6.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "M/d/yy" + "'", str7.equals("M/d/yy"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1129");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) 'a', (int) (byte) 1, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1130");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale6);
        java.lang.Class<?> wildcardClass8 = locale6.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1131");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.util.TimeZone timeZone4 = fastDateFormat0.getTimeZone();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat0.parse("MMM d, yyyy h:mm:ss a z", parsePosition6);
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1132");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.util.TimeZone timeZone3 = fastDateFormat1.getTimeZone();
        java.lang.String str4 = fastDateFormat1.getPattern();
        java.util.TimeZone timeZone5 = fastDateFormat1.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat1.parse("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]\" does not match (\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MMM d, yyyy" + "'", str2.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMM d, yyyy" + "'", str4.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1133");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, (int) (short) 0);
        java.lang.Object obj3 = fastDateFormat2.clone();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("Wednesday, December 31, 1969", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1134");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, 1, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = fastDateFormat3.parse("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]", parsePosition5);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1135");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 1, locale6);
        java.lang.String str8 = fastDateFormat7.toString();
        java.util.Locale locale9 = fastDateFormat7.getLocale();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]" + "'", str8.equals("FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1136");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 10, timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1137");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) ' ', 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1138");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
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
            System.out.format("%n%s%n", "FastDateFormat2.test1139");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        boolean boolean7 = fastDateFormat2.equals((java.lang.Object) "MMMM d, yyyy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = fastDateFormat2.parse("Dec 31, 1969 5:00:00 PM MST");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"Dec 31, 1969 5:00:00 PM MST\" does not match (\\QWednesday\\E|\\QSaturday\\E|\\QThursday\\E|\\QTuesday\\E|\\QFriday\\E|\\QMonday\\E|\\QSunday\\E|\\QFri\\E|\\QMon\\E|\\QSat\\E|\\QSun\\E|\\QThu\\E|\\QTue\\E|\\QWed\\E)\\Q, \\E(\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
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
            System.out.format("%n%s%n", "FastDateFormat2.test1140");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale6);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1141");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone7);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1142");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(17, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1143");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z");
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("December 31, 1969 5:00:00 PM MST", timeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1144");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format((long) (short) 0);
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = fastDateFormat2.format(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str3.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wednesday, December 31, 1969" + "'", str5.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1145");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.TimeZone timeZone5 = fastDateFormat1.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(32, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1146");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        int int4 = fastDateFormat3.getMaxLengthEstimate();
        java.lang.String str6 = fastDateFormat3.format((-1L));
        java.lang.String str7 = fastDateFormat3.getPattern();
        java.util.TimeZone timeZone8 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(14, 21, timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Wednesday, December 31, 1969" + "'", str6.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str7.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1147");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.lang.String str2 = fastDateFormat1.toString();
        java.lang.String str4 = fastDateFormat1.format(10L);
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat1.format(calendar5, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "FastDateFormat[MMMM d, yyyy,en_US,America/Denver]" + "'", str2.equals("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "December 31, 1969" + "'", str4.equals("December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1148");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        java.lang.String str8 = fastDateFormat6.toString();
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
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FastDateFormat[h:mm:ss a z,en_US,America/Denver]" + "'", str8.equals("FastDateFormat[h:mm:ss a z,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1149");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1150");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 31");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1151");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.lang.String str6 = fastDateFormat2.getPattern();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = fastDateFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"hi!\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1152");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.lang.Object obj6 = fastDateFormat4.clone();
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (-1), locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str5.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1153");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean2 = fastDateFormat0.equals((java.lang.Object) (-1));
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fastDateFormat0.parseObject("4:59:59 PM MST", parsePosition4);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1154");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        java.lang.String str3 = fastDateFormat1.format((long) 14);
        java.lang.String str4 = fastDateFormat1.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "12/31/69 5:00 PM" + "'", str3.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "M/d/yy h:mm a" + "'", str4.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1155");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.util.TimeZone timeZone3 = fastDateFormat1.getTimeZone();
        java.lang.String str4 = fastDateFormat1.getPattern();
        int int5 = fastDateFormat1.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MMM d, yyyy" + "'", str2.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMM d, yyyy" + "'", str4.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 14 + "'", int5 == 14);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1156");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str3 = fastDateFormat1.format((long) 0);
        java.lang.String str4 = fastDateFormat1.getPattern();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "5:00:00 PM MST" + "'", str3.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1157");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        java.lang.Object obj6 = fastDateFormat3.clone();
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1158");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale5);
        java.lang.String str7 = fastDateFormat6.toString();
        java.util.TimeZone timeZone8 = fastDateFormat6.getTimeZone();
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
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1159");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        java.lang.Object obj4 = fastDateFormat3.clone();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a", locale5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(31, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 31");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1160");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.lang.String str6 = fastDateFormat2.getPattern();
        java.lang.Object obj7 = fastDateFormat2.clone();
        java.lang.String str9 = fastDateFormat2.format((long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5:00:00 PM MST" + "'", str5.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h:mm:ss a z" + "'", str6.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4:59:59 PM MST" + "'", str9.equals("4:59:59 PM MST"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1161");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat2.format((long) (short) 1, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str3.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1162");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fastDateFormat2.parseObject("EEEE, MMMM d, yyyy h:mm:ss a z");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str3.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wednesday, December 31, 1969" + "'", str5.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1163");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        boolean boolean7 = fastDateFormat3.equals((java.lang.Object) (short) 1);
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str4.equals("MMMM d, yyyy h:mm:ss a z"));
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
            System.out.format("%n%s%n", "FastDateFormat2.test1164");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, 1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 17);
        java.lang.String str6 = fastDateFormat3.getPattern();
        int int7 = fastDateFormat3.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Dec 31, 1969 5:00:00 PM MST" + "'", str5.equals("Dec 31, 1969 5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MMM d, yyyy h:mm:ss a z" + "'", str6.equals("MMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1165");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(14, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 14");
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
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1166");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1167");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat2.parse("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]", parsePosition6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1168");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1169");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy");
        java.lang.String str4 = fastDateFormat2.format(100L);
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) ' ', timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Wednesday, December 31, 1969" + "'", str4.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1170");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy");
        java.util.Date date3 = fastDateFormat1.parse("December 31, 1969");
        java.lang.String str4 = fastDateFormat1.getPattern();
        java.lang.String str6 = fastDateFormat1.format((long) 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date3.toString(), "Wed Dec 31 00:00:00 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMM d, yyyy" + "'", str4.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Dec 31, 1969" + "'", str6.equals("Dec 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1171");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str5 = fastDateFormat2.format(100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fastDateFormat2.parseObject("MMMM d, yyyy h:mm:ss a z");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[h:mm:ss a z,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[h:mm:ss a z,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5:00:00 PM MST" + "'", str5.equals("5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1172");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 12:00 AM", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: A");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1173");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.util.TimeZone timeZone3 = fastDateFormat1.getTimeZone();
        java.lang.String str4 = fastDateFormat1.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat1.parseObject("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MMM d, yyyy" + "'", str2.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMM d, yyyy" + "'", str4.equals("MMM d, yyyy"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1174");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.lang.String str4 = fastDateFormat2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1175");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.String str6 = fastDateFormat3.toString();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, 1, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((-1), locale7);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1176");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy");
        java.lang.String str3 = fastDateFormat1.format(100L);
        int int4 = fastDateFormat1.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat1.getTimeZone();
        java.util.TimeZone timeZone6 = fastDateFormat1.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat1.parse("M/d/yy h:mm a");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"M/d/yy h:mm a\" does not match (\\QWednesday\\E|\\QSaturday\\E|\\QThursday\\E|\\QTuesday\\E|\\QFriday\\E|\\QMonday\\E|\\QSunday\\E|\\QFri\\E|\\QMon\\E|\\QSat\\E|\\QSun\\E|\\QThu\\E|\\QTue\\E|\\QWed\\E)\\Q, \\E(\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wednesday, December 31, 1969" + "'", str3.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1177");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone6);
        java.lang.String str8 = fastDateFormat7.getPattern();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "h:mm:ss a z" + "'", str8.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1178");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fastDateFormat2.parseObject("5:00:00 PM MST");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1179");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2, locale3);
        java.lang.String str6 = fastDateFormat4.format((long) 100);
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) ' ', timeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "12/31/69 5:00 PM" + "'", str6.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1180");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str2 = fastDateFormat1.getPattern();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1);
        boolean boolean6 = fastDateFormat1.equals((java.lang.Object) fastDateFormat5);
        int int7 = fastDateFormat1.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MMM d, yyyy" + "'", str2.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 14 + "'", int7 == 14);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1181");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        int int7 = fastDateFormat3.getMaxLengthEstimate();
        java.lang.String str8 = fastDateFormat3.toString();
        java.lang.String str9 = fastDateFormat3.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str9.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1182");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.lang.Object obj3 = fastDateFormat2.clone();
        java.lang.String str4 = fastDateFormat2.toString();
        java.lang.String str6 = fastDateFormat2.format((long) 1);
        java.util.TimeZone timeZone7 = fastDateFormat2.getTimeZone();
        java.lang.String str8 = fastDateFormat2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Wednesday, December 31, 1969" + "'", str6.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str8.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1183");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.util.Locale locale7 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 100, 32, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1184");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, locale6);
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
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
            System.out.format("%n%s%n", "FastDateFormat2.test1185");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1186");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("4:59:59 PM", timeZone4);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1187");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale5);
        java.lang.String str7 = fastDateFormat6.toString();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = fastDateFormat6.format(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str7.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1188");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = fastDateFormat0.equals(obj2);
        java.lang.String str5 = fastDateFormat0.format((long) (byte) 0);
        java.lang.String str6 = fastDateFormat0.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str1.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1189");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
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
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1190");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.TimeZone timeZone5 = fastDateFormat1.getTimeZone();
        java.util.Locale locale6 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 100, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1191");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.String str5 = fastDateFormat2.format((-1L));
        java.lang.String str6 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone7 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wednesday, December 31, 1969" + "'", str5.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str6.equals("EEEE, MMMM d, yyyy"));
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
            System.out.format("%n%s%n", "FastDateFormat2.test1192");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
        java.util.TimeZone timeZone2 = fastDateFormat1.getTimeZone();
        java.lang.String str4 = fastDateFormat1.format((long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "December 31, 1969" + "'", str4.equals("December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1193");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("5:00:00 PM MST", timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1194");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1195");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        boolean boolean5 = fastDateFormat2.equals((java.lang.Object) str4);
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '#', locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1196");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        boolean boolean4 = fastDateFormat0.equals((java.lang.Object) "M/d/yy h:mm a");
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat0.parse("12/31/69 12:00 AM", parsePosition6);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1197");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1198");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 2);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fastDateFormat2.parseObject("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]", parsePosition4);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1199");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        java.lang.Class<?> wildcardClass8 = fastDateFormat3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1200");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.Object obj4 = fastDateFormat2.clone();
        int int5 = fastDateFormat2.getMaxLengthEstimate();
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
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1201");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 38");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1202");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1203");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2, locale3);
        java.lang.String str6 = fastDateFormat4.format((long) 100);
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 10, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "12/31/69 5:00 PM" + "'", str6.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1204");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.String str4 = fastDateFormat2.getPattern();
        java.lang.String str6 = fastDateFormat2.format((long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str4.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Wednesday, December 31, 1969" + "'", str6.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1205");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        java.lang.Object obj2 = fastDateFormat1.clone();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = fastDateFormat1.format((long) 1, stringBuffer4);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1206");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 5:00 PM", timeZone4);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1207");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) '4', timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1208");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fastDateFormat2.parseObject("4:59:59 PM");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1209");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3);
        int int2 = fastDateFormat1.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1210");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1211");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 0);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fastDateFormat2.parseObject("12/31/69 5:00 PM", parsePosition4);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1212");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.String str4 = fastDateFormat2.getPattern();
        java.lang.String str6 = fastDateFormat2.format((long) 14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str4.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Wednesday, December 31, 1969" + "'", str6.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1213");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5:00:00 PM MST" + "'", str5.equals("5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1214");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fastDateFormat6.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1215");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(38, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 38");
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
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1216");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0);
        java.lang.String str3 = fastDateFormat1.format((long) 31);
        java.lang.String str5 = fastDateFormat1.format((long) 17);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0);
        java.lang.Object obj8 = fastDateFormat7.clone();
        boolean boolean9 = fastDateFormat1.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Wednesday, December 31, 1969" + "'", str3.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wednesday, December 31, 1969" + "'", str5.equals("Wednesday, December 31, 1969"));
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
            System.out.format("%n%s%n", "FastDateFormat2.test1217");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, locale6);
        int int8 = fastDateFormat7.getMaxLengthEstimate();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1218");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
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
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1219");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = fastDateFormat2.parse("EEEE, MMMM d, yyyy", parsePosition5);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1220");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str2 = fastDateFormat1.getPattern();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1);
        boolean boolean6 = fastDateFormat1.equals((java.lang.Object) fastDateFormat5);
        int int7 = fastDateFormat5.getMaxLengthEstimate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = fastDateFormat5.parse("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"FastDateFormat[MMMM d, yyyy,en_US,America/Denver]\" does not match (\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
        } catch (java.text.ParseException e) {
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1221");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.Object obj4 = fastDateFormat2.clone();
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat2.parse("Wednesday, December 31, 1969", parsePosition7);
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
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1222");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.lang.Object obj5 = fastDateFormat2.clone();
        int int6 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat2.format(0L, stringBuffer8);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1223");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, (int) (short) 0, locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(17, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1224");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("4:59:59 PM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1225");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.lang.Object obj7 = fastDateFormat3.clone();
        java.lang.Object obj8 = fastDateFormat3.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1226");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.String str5 = fastDateFormat3.toString();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        java.lang.String str7 = fastDateFormat3.getPattern();
        java.util.Locale locale8 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) 'a', locale8);
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
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "M/d/yy h:mm a" + "'", str7.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1227");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 100, timeZone6);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1228");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        java.lang.String str2 = fastDateFormat1.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "h:mm:ss a z" + "'", str2.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1229");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        boolean boolean7 = fastDateFormat2.equals((java.lang.Object) "MMMM d, yyyy");
        java.lang.Object obj8 = fastDateFormat2.clone();
        java.lang.String str9 = fastDateFormat2.getPattern();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str9.equals("EEEE, MMMM d, yyyy"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1230");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str5 = fastDateFormat3.format((long) 0);
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale6);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) ' ', locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1231");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.lang.String str5 = fastDateFormat2.toString();
        java.lang.Object obj6 = fastDateFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
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
            System.out.format("%n%s%n", "FastDateFormat2.test1232");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale1);
        java.lang.String str3 = fastDateFormat2.toString();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone7);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
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
            System.out.format("%n%s%n", "FastDateFormat2.test1233");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1234");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str5 = fastDateFormat3.getPattern();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 100, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "h:mm:ss a z" + "'", str5.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1235");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean2 = fastDateFormat0.equals((java.lang.Object) (-1));
        int int3 = fastDateFormat0.getMaxLengthEstimate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fastDateFormat0.parseObject("EEEE, MMMM d, yyyy h:mm:ss a z");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1236");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat2.parse("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]", parsePosition7);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1237");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]", locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1238");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.lang.String str5 = fastDateFormat2.toString();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat2.parse("MMMM d, yyyy h:mm:ss a", parsePosition7);
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1239");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.lang.Object obj4 = fastDateFormat3.clone();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat3.parse("December 31, 1969 4:59:59 PM MST");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"December 31, 1969 4:59:59 PM MST\" does not match (\\QWednesday\\E|\\QSaturday\\E|\\QThursday\\E|\\QTuesday\\E|\\QFriday\\E|\\QMonday\\E|\\QSunday\\E|\\QFri\\E|\\QMon\\E|\\QSat\\E|\\QSun\\E|\\QThu\\E|\\QTue\\E|\\QWed\\E)\\Q, \\E(\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
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
            System.out.format("%n%s%n", "FastDateFormat2.test1240");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 3);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(31, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 31");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1241");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat3.format((-1L), stringBuffer5);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1242");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.lang.Class<?> wildcardClass6 = fastDateFormat2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1243");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy h:mm:ss a z", timeZone5);
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1244");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[h:mm:ss a z,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[h:mm:ss a z,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1245");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.util.TimeZone timeZone4 = fastDateFormat0.getTimeZone();
        java.lang.String str5 = fastDateFormat0.toString();
        java.lang.String str6 = fastDateFormat0.toString();
        boolean boolean8 = fastDateFormat0.equals((java.lang.Object) "MMMM d, yyyy h:mm:ss a");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str6.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1246");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = fastDateFormat2.parse("12/31/69 4:59 PM");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"12/31/69 4:59 PM\" does not match (\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[h:mm:ss a z,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[h:mm:ss a z,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1247");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        boolean boolean4 = fastDateFormat0.equals((java.lang.Object) "M/d/yy h:mm a");
        java.util.Date date5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat0.format(date5, stringBuffer6);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1248");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.String str4 = fastDateFormat1.toString();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat6.parse("Wednesday, December 31, 1969");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"Wednesday, December 31, 1969\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1249");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str3 = fastDateFormat1.format((long) (short) 0);
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.lang.Object obj5 = fastDateFormat1.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Dec 31, 1969" + "'", str3.equals("Dec 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[MMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[MMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1250");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 0);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("MMMM d, yyyy h:mm:ss a", parsePosition5);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1251");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.TimeZone timeZone5 = fastDateFormat1.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 10, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1252");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone4);
        java.lang.String str6 = fastDateFormat5.getPattern();
        boolean boolean7 = fastDateFormat1.equals((java.lang.Object) fastDateFormat5);
        java.lang.Object obj9 = fastDateFormat1.parseObject("Wednesday, December 31, 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str6.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "Wed Dec 31 00:00:00 MST 1969");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1253");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.toString();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1);
        boolean boolean5 = fastDateFormat0.equals((java.lang.Object) fastDateFormat4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fastDateFormat4.parseObject("M/d/yy");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
            System.out.format("%n%s%n", "FastDateFormat2.test1254");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.lang.String str5 = fastDateFormat2.toString();
        int int6 = fastDateFormat2.getMaxLengthEstimate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat2.parse("Dec 31, 1969");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"Dec 31, 1969\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1255");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale6);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1256");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z");
        java.util.TimeZone timeZone2 = fastDateFormat1.getTimeZone();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fastDateFormat1.parseObject("MMM d, yyyy", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1257");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fastDateFormat3.parseObject("MMM d, yyyy");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1258");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone4);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1259");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.lang.String str4 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str4.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1260");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str5 = fastDateFormat3.toString();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "M/d/yy h:mm a" + "'", str4.equals("M/d/yy h:mm a"));
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
            System.out.format("%n%s%n", "FastDateFormat2.test1261");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        int int6 = fastDateFormat3.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1262");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) str2);
        java.lang.Object obj4 = fastDateFormat0.clone();
        java.util.Locale locale5 = fastDateFormat0.getLocale();
        java.lang.String str6 = fastDateFormat0.getPattern();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1263");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(31, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 31");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1264");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.lang.String str5 = fastDateFormat2.toString();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0);
        java.lang.Object obj8 = fastDateFormat7.clone();
        boolean boolean9 = fastDateFormat2.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
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
            System.out.format("%n%s%n", "FastDateFormat2.test1265");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat2.parse("Wednesday, December 31, 1969", parsePosition6);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1266");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]", timeZone3, locale4);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1267");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("4:59:59 PM", timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1268");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.String str4 = fastDateFormat2.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str4.equals("EEEE, MMMM d, yyyy"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1269");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.Object obj6 = fastDateFormat4.clone();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone7);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1270");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (short) 1);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale5);
        java.lang.String str7 = fastDateFormat6.toString();
        java.lang.Object obj8 = fastDateFormat6.clone();
        boolean boolean9 = fastDateFormat2.equals((java.lang.Object) fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 38 + "'", int3 == 38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str7.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1271");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, (int) (short) 0);
        java.lang.Object obj3 = fastDateFormat2.clone();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat2.format((long) (-1), stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1272");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 100);
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        java.lang.Object obj7 = fastDateFormat3.clone();
        java.util.TimeZone timeZone8 = fastDateFormat3.getTimeZone();
        java.lang.String str9 = fastDateFormat3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12/31/69 5:00 PM" + "'", str5.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str9.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1273");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone5);
        java.util.Locale locale7 = fastDateFormat6.getLocale();
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
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1274");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        java.lang.String str7 = fastDateFormat2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Byte");
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
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str7.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1275");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str6 = fastDateFormat3.format(0L);
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale7);
        java.lang.Object obj9 = fastDateFormat8.clone();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1276");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        boolean boolean4 = fastDateFormat1.equals((java.lang.Object) str3);
        java.lang.Object obj5 = fastDateFormat1.clone();
        java.util.Locale locale6 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(10, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1277");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.lang.Object obj6 = fastDateFormat4.clone();
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        java.util.TimeZone timeZone8 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 100, (int) ' ', timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str5.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1278");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1279");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1280");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0);
        java.lang.String str3 = fastDateFormat1.format((long) '#');
        java.util.Locale locale4 = fastDateFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "5:00:00 PM MST" + "'", str3.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1281");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str4 = fastDateFormat2.format((long) 0);
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale5);
        java.util.Locale locale7 = fastDateFormat6.getLocale();
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
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1282");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone1);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1283");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy h:mm:ss a z", locale1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1284");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone2, locale3);
        java.lang.Object obj5 = fastDateFormat4.clone();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a", locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1285");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.lang.Object obj4 = fastDateFormat3.clone();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        java.lang.String str6 = fastDateFormat3.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fastDateFormat3.parseObject("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str6.equals("EEEE, MMMM d, yyyy"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1286");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0);
        java.lang.String str3 = fastDateFormat1.format((long) '#');
        java.lang.Class<?> wildcardClass4 = fastDateFormat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "5:00:00 PM MST" + "'", str3.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1287");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(31, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 31");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1288");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        boolean boolean7 = fastDateFormat2.equals((java.lang.Object) "MMMM d, yyyy");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fastDateFormat2.parseObject("FastDateFormat[MMMM d, yyyy,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
            System.out.format("%n%s%n", "FastDateFormat2.test1289");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
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
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1290");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((-1), locale6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1291");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(20, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 20");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1292");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.lang.String str5 = fastDateFormat3.toString();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        java.lang.String str7 = fastDateFormat3.getPattern();
        java.util.Locale locale8 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a", locale8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "M/d/yy h:mm a" + "'", str7.equals("M/d/yy h:mm a"));
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
            System.out.format("%n%s%n", "FastDateFormat2.test1293");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone6);
        java.lang.String str9 = fastDateFormat8.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str9.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1294");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 10, locale7);
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
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1295");
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone4);
        java.lang.String str6 = fastDateFormat5.getPattern();
        java.util.Locale locale7 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(20, 14, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str6.equals("EEEE, MMMM d, yyyy"));
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
            System.out.format("%n%s%n", "FastDateFormat2.test1296");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.lang.Object obj2 = fastDateFormat1.clone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str6 = fastDateFormat4.format((long) 0);
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = fastDateFormat1.formatToCharacterIterator((java.lang.Object) locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1297");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.TimeZone timeZone5 = fastDateFormat1.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]", timeZone5);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1298");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = fastDateFormat1.parse("M/d/yy", parsePosition3);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1299");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.util.TimeZone timeZone3 = fastDateFormat1.getTimeZone();
        java.lang.String str4 = fastDateFormat1.getPattern();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat1.parse("4:59:59 PM MST");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"4:59:59 PM MST\" does not match (\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MMM d, yyyy" + "'", str2.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMM d, yyyy" + "'", str4.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1300");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone4, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("4:59:59 PM", timeZone4);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1301");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale5);
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str4.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1302");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone2, locale3);
        java.lang.Object obj5 = fastDateFormat4.clone();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
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
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1303");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 4:59 PM", timeZone4);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1304");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str4.equals("EEEE, MMMM d, yyyy"));
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
            System.out.format("%n%s%n", "FastDateFormat2.test1305");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.String str4 = fastDateFormat2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1306");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1307");
        java.util.TimeZone timeZone1 = null;
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 10, timeZone1, locale7);
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
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1308");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = fastDateFormat1.format((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1309");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.util.Locale locale4 = fastDateFormat0.getLocale();
        java.lang.String str5 = fastDateFormat0.getPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fastDateFormat0.parseObject("12/31/69 4:59 PM", parsePosition7);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1310");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        java.lang.Object obj6 = fastDateFormat4.clone();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 0, timeZone7);
        java.lang.String str9 = fastDateFormat8.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]" + "'", str9.equals("FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1311");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.lang.Object obj4 = fastDateFormat3.clone();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        java.lang.String str6 = fastDateFormat3.getPattern();
        int int7 = fastDateFormat3.getMaxLengthEstimate();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str6.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1312");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.lang.String str6 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone7 = fastDateFormat2.getTimeZone();
        java.lang.Class<?> wildcardClass8 = timeZone7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5:00:00 PM MST" + "'", str5.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h:mm:ss a z" + "'", str6.equals("h:mm:ss a z"));
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
            System.out.format("%n%s%n", "FastDateFormat2.test1313");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone4);
        boolean boolean6 = fastDateFormat0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = fastDateFormat0.clone();
        java.lang.String str8 = fastDateFormat0.toString();
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
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str8.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1314");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, (int) (short) 0);
        java.lang.Object obj3 = fastDateFormat2.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fastDateFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1315");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 2);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = fastDateFormat2.parse("12/31/69 5:00 PM", parsePosition4);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1316");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.lang.String str5 = fastDateFormat2.toString();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fastDateFormat2.parseObject("12/31/69 5:00 PM", parsePosition7);
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str5.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1317");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0);
        java.lang.String str3 = fastDateFormat1.format((long) '#');
        java.lang.String str4 = fastDateFormat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "5:00:00 PM MST" + "'", str3.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[h:mm:ss a z,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[h:mm:ss a z,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1318");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        java.lang.Object obj7 = fastDateFormat3.parseObject("Dec 31, 1969 4:59:59 PM MST");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str4.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "Wed Dec 31 16:59:59 MST 1969");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1319");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1320");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone3);
        java.lang.String str5 = fastDateFormat4.toString();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 100, timeZone7);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1321");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        java.lang.Object obj6 = fastDateFormat5.clone();
        java.lang.Class<?> wildcardClass7 = fastDateFormat5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1322");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.Object obj5 = fastDateFormat0.clone();
        java.util.TimeZone timeZone6 = fastDateFormat0.getTimeZone();
        java.util.Locale locale7 = fastDateFormat0.getLocale();
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
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1323");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str4 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.lang.Class<?> wildcardClass6 = timeZone5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1324");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69 12:00 AM", timeZone1, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: A");
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
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1325");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
        int int5 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str7 = fastDateFormat0.format(10L);
        java.lang.String str8 = fastDateFormat0.getPattern();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "12/31/69 5:00 PM" + "'", str7.equals("12/31/69 5:00 PM"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "M/d/yy h:mm a" + "'", str8.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1326");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.lang.Object obj5 = fastDateFormat3.clone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1);
        boolean boolean8 = fastDateFormat3.equals((java.lang.Object) fastDateFormat7);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1327");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        int int6 = fastDateFormat2.getMaxLengthEstimate();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1328");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[h:mm:ss a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[h:mm:ss a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1329");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("December 31, 1969 5:00:00 PM MST");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1330");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1331");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.lang.String str6 = fastDateFormat2.getPattern();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1332");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, (int) (short) 0, locale5);
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat6.format(calendar7, stringBuffer8);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1333");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        java.lang.Object obj7 = fastDateFormat2.clone();
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1334");
        java.util.TimeZone timeZone1 = null;
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone3, locale4);
        java.lang.Object obj6 = fastDateFormat5.clone();
        java.util.Locale locale7 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("4:59:59 PM MST", timeZone1, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
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
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1335");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) 'a', (int) ' ', timeZone5);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1336");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0);
        java.lang.String str3 = fastDateFormat1.format((long) '#');
        java.lang.String str5 = fastDateFormat1.format((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat1.parse("FastDateFormat[h:mm:ss a,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"FastDateFormat[h:mm:ss a,en_US,America/Denver]\" does not match (\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "5:00:00 PM MST" + "'", str3.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "5:00:00 PM MST" + "'", str5.equals("5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1337");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, timeZone2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = fastDateFormat3.parse("EEEE, MMMM d, yyyy h:mm:ss a z");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"EEEE, MMMM d, yyyy h:mm:ss a z\" does not match (\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1338");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String str5 = fastDateFormat2.format(0L);
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        java.lang.Object obj8 = fastDateFormat2.clone();
        java.lang.String str9 = fastDateFormat2.toString();
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
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FastDateFormat[h:mm:ss a z,en_US,America/Denver]" + "'", str9.equals("FastDateFormat[h:mm:ss a z,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1339");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.lang.String str6 = fastDateFormat2.toString();
        java.lang.String str7 = fastDateFormat2.toString();
        java.util.TimeZone timeZone8 = fastDateFormat2.getTimeZone();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str7.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1340");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale5);
        boolean boolean7 = fastDateFormat3.equals((java.lang.Object) locale5);
        java.util.TimeZone timeZone8 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[h:mm:ss a,en_US,America/Denver]", timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1341");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        java.util.Locale locale4 = fastDateFormat0.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str6 = fastDateFormat5.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = fastDateFormat0.formatToCharacterIterator((java.lang.Object) str6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.String");
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
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1342");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.lang.Object obj3 = fastDateFormat0.clone();
        java.lang.String str4 = fastDateFormat0.toString();
        java.util.TimeZone timeZone5 = fastDateFormat0.getTimeZone();
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
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1343");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.lang.Object obj3 = fastDateFormat1.clone();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale5);
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fastDateFormat6.parseObject("MMM d, yyyy");
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
        org.junit.Assert.assertNotNull(locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1344");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fastDateFormat5.parseObject("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1345");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone5);
        int int7 = fastDateFormat6.getMaxLengthEstimate();
        java.util.Locale locale8 = fastDateFormat6.getLocale();
        java.lang.Class<?> wildcardClass9 = locale8.getClass();
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
            System.out.format("%n%s%n", "FastDateFormat2.test1346");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, 1, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 17);
        int int6 = fastDateFormat3.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Dec 31, 1969 5:00:00 PM MST" + "'", str5.equals("Dec 31, 1969 5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1347");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        int int2 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.String str4 = fastDateFormat1.format((long) (short) 10);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fastDateFormat1.parseObject("5:00:00 PM MST", parsePosition6);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1348");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(17, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1349");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[h:mm:ss a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[h:mm:ss a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1350");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy", locale1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1351");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str3 = fastDateFormat1.format((long) 0);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = fastDateFormat1.parse("Dec 31, 1969 4:59:59 PM MST", parsePosition5);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1352");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        java.lang.Object obj6 = fastDateFormat3.clone();
        int int7 = fastDateFormat3.getMaxLengthEstimate();
        java.util.Locale locale8 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, locale8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str4.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1353");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat0.getTimeZone();
        java.lang.String str6 = fastDateFormat0.getPattern();
        java.lang.String str8 = fastDateFormat0.format((long) (-1));
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
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "12/31/69 4:59 PM" + "'", str8.equals("12/31/69 4:59 PM"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1354");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.Object obj5 = fastDateFormat0.clone();
        java.util.TimeZone timeZone6 = fastDateFormat0.getTimeZone();
        java.util.TimeZone timeZone7 = fastDateFormat0.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = fastDateFormat0.parse("MMMM d, yyyy h:mm:ss a");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"MMMM d, yyyy h:mm:ss a\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
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
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1355");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.String str6 = fastDateFormat3.toString();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, 1, locale7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy", locale7);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1356");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(21, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1357");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.util.Locale locale2 = fastDateFormat1.getLocale();
        java.util.Locale locale3 = fastDateFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1358");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = fastDateFormat2.parse("December 31, 1969 4:59:59 PM MST", parsePosition8);
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
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1359");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", timeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(13, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 13");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str5.equals("EEEE, MMMM d, yyyy"));
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
            System.out.format("%n%s%n", "FastDateFormat2.test1360");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) -1, 20, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 20");
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1361");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        java.lang.String str7 = fastDateFormat2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = fastDateFormat2.parse("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str7.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1362");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.lang.String str3 = fastDateFormat1.format((long) (short) 1);
        java.util.TimeZone timeZone4 = fastDateFormat1.getTimeZone();
        java.lang.Class<?> wildcardClass5 = fastDateFormat1.getClass();
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
            System.out.format("%n%s%n", "FastDateFormat2.test1363");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.String str5 = fastDateFormat3.getPattern();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone6, locale7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "h:mm:ss a z" + "'", str5.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1364");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, (int) (short) 0);
        java.lang.Object obj3 = fastDateFormat2.clone();
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
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[M/d/yy h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1365");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.lang.String str3 = fastDateFormat1.format((long) 0);
        java.util.Locale locale4 = fastDateFormat1.getLocale();
        java.lang.String str6 = fastDateFormat1.format((long) (byte) 100);
        int int7 = fastDateFormat1.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "5:00:00 PM MST" + "'", str3.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "5:00:00 PM MST" + "'", str6.equals("5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 17 + "'", int7 == 17);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1366");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.toString();
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.Date date6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat2.format(date6, stringBuffer7);
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
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1367");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.String str5 = fastDateFormat2.format((long) 2);
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Wednesday, December 31, 1969" + "'", str5.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1368");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        int int4 = fastDateFormat3.getMaxLengthEstimate();
        java.lang.String str6 = fastDateFormat3.format((-1L));
        java.lang.String str7 = fastDateFormat3.getPattern();
        java.util.TimeZone timeZone8 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 100, (int) (short) 100, timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Wednesday, December 31, 1969" + "'", str6.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str7.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1369");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.String str6 = fastDateFormat2.format((long) (short) -1);
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "12/31/69 4:59 PM" + "'", str6.equals("12/31/69 4:59 PM"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1370");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str3 = fastDateFormat1.format((long) (short) 0);
        java.util.TimeZone timeZone4 = fastDateFormat1.getTimeZone();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat1.parse("FastDateFormat[h:mm:ss a z,en_US,America/Denver]", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Dec 31, 1969" + "'", str3.equals("Dec 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1371");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        int int1 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str2 = fastDateFormat0.getPattern();
        java.lang.Object obj3 = fastDateFormat0.clone();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = fastDateFormat0.format(calendar5);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1372");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        java.lang.String str5 = fastDateFormat2.getPattern();
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = fastDateFormat2.parse("MMMM d, yyyy h:mm:ss a", parsePosition8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MMMM d, yyyy h:mm:ss a z" + "'", str5.equals("MMMM d, yyyy h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[MMMM d, yyyy h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1373");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.lang.Object obj3 = fastDateFormat2.clone();
        java.lang.String str4 = fastDateFormat2.toString();
        java.lang.String str5 = fastDateFormat2.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]" + "'", str4.equals("FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str5.equals("EEEE, MMMM d, yyyy"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1374");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (short) 0, timeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[MMM d, yyyy,en_US,America/Denver]", timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1375");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        java.lang.Object obj2 = fastDateFormat1.clone();
        java.util.Locale locale3 = fastDateFormat1.getLocale();
        int int4 = fastDateFormat1.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a,en_US,America/Denver]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1376");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) '#', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1377");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        int int2 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.String str4 = fastDateFormat1.format((-1L));
        java.lang.String str5 = fastDateFormat1.getPattern();
        java.lang.String str7 = fastDateFormat1.format((long) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Wednesday, December 31, 1969" + "'", str4.equals("Wednesday, December 31, 1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str5.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Wednesday, December 31, 1969" + "'", str7.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1378");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat3.parseObject("EEEE, MMMM d, yyyy h:mm:ss a z");
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
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1379");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        int int4 = fastDateFormat3.getMaxLengthEstimate();
        java.lang.String str5 = fastDateFormat3.getPattern();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "M/d/yy h:mm a" + "'", str5.equals("M/d/yy h:mm a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1380");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.lang.Object obj4 = fastDateFormat2.clone();
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
        org.junit.Assert.assertNotNull(locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[EEEE, MMMM d, yyyy,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1381");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale4);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat5.format((long) '4', stringBuffer7);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1382");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        boolean boolean5 = fastDateFormat2.equals((java.lang.Object) str4);
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(13, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 13");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1383");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1384");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.String str4 = fastDateFormat2.getPattern();
        java.lang.String str6 = fastDateFormat2.format((long) 32);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat2.parse("MMMM d, yyyy h:mm:ss a z");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"MMMM d, yyyy h:mm:ss a z\" does not match (\\QWednesday\\E|\\QSaturday\\E|\\QThursday\\E|\\QTuesday\\E|\\QFriday\\E|\\QMonday\\E|\\QSunday\\E|\\QFri\\E|\\QMon\\E|\\QSat\\E|\\QSun\\E|\\QThu\\E|\\QTue\\E|\\QWed\\E)\\Q, \\E(\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str4.equals("EEEE, MMMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Wednesday, December 31, 1969" + "'", str6.equals("Wednesday, December 31, 1969"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1385");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.lang.String str6 = fastDateFormat3.toString();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("December 31, 1969", timeZone1, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1386");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale4);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1387");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Object obj5 = fastDateFormat3.clone();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, locale6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1388");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(17, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1389");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) 'a', timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1390");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = fastDateFormat1.parse("EEEE, MMMM d, yyyy h:mm:ss a z");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"EEEE, MMMM d, yyyy h:mm:ss a z\" does not match (\\QWednesday\\E|\\QSaturday\\E|\\QThursday\\E|\\QTuesday\\E|\\QFriday\\E|\\QMonday\\E|\\QSunday\\E|\\QFri\\E|\\QMon\\E|\\QSat\\E|\\QSun\\E|\\QThu\\E|\\QTue\\E|\\QWed\\E)\\Q, \\E(\\QSeptember\\E|\\QDecember\\E|\\QFebruary\\E|\\QNovember\\E|\\QJanuary\\E|\\QOctober\\E|\\QAugust\\E|\\QApril\\E|\\QMarch\\E|\\QJuly\\E|\\QJune\\E|\\QApr\\E|\\QAug\\E|\\QDec\\E|\\QFeb\\E|\\QJan\\E|\\QJul\\E|\\QJun\\E|\\QMar\\E|\\QMay\\E|\\QNov\\E|\\QOct\\E|\\QSep\\E)\\Q \\E(\\p{IsNd}++)\\Q, \\E(\\p{IsNd}++)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1391");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale2);
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, locale5);
        boolean boolean7 = fastDateFormat3.equals((java.lang.Object) locale5);
        java.util.TimeZone timeZone8 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[MMM d, yyyy,en_US,America/Denver]", timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1392");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy");
        java.util.Date date3 = fastDateFormat1.parse("December 31, 1969");
        java.lang.String str4 = fastDateFormat1.getPattern();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(date3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(date3.toString(), "Wed Dec 31 00:00:00 MST 1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MMM d, yyyy" + "'", str4.equals("MMM d, yyyy"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1393");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1394");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fastDateFormat6.parseObject("December 31, 1969 4:59:59 PM MST");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1395");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str1 = fastDateFormat0.getPattern();
        java.lang.Object obj2 = fastDateFormat0.clone();
        java.lang.String str3 = fastDateFormat0.toString();
        int int4 = fastDateFormat0.getMaxLengthEstimate();
        java.util.TimeZone timeZone5 = fastDateFormat0.getTimeZone();
        java.lang.String str6 = fastDateFormat0.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat0.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
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
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6.equals("M/d/yy h:mm a"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1396");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a");
        java.lang.Object obj3 = fastDateFormat2.clone();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
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
            System.out.format("%n%s%n", "FastDateFormat2.test1397");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1398");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.Locale locale6 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '#', locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
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
            System.out.format("%n%s%n", "FastDateFormat2.test1399");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z");
        java.util.TimeZone timeZone2 = fastDateFormat1.getTimeZone();
        java.lang.String str4 = fastDateFormat1.format((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat1.parseObject("Dec 31, 1969");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "December 31, 1969 5:00:00 PM MST" + "'", str4.equals("December 31, 1969 5:00:00 PM MST"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1400");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1);
        java.lang.String str4 = fastDateFormat2.format((long) 3);
        java.lang.Object obj5 = fastDateFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Dec 31, 1969 5:00:00 PM MST" + "'", str4.equals("Dec 31, 1969 5:00:00 PM MST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[MMM d, yyyy h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat2.test1401");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone1, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.lang.String str6 = fastDateFormat3.format((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat3.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"\" does not match (\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q/\\E(\\p{IsNd}++)\\Q \\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "12/31/69 5:00 PM" + "'", str6.equals("12/31/69 5:00 PM"));
    }
}

