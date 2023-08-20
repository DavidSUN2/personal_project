
package DateFormatUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateFormatUtils0 {

    public static boolean debug = false;

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test001");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test002");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 100, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test003");
        java.util.Calendar calendar0 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test004");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test005");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test006");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 1, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test007");
        java.util.Date date0 = null;
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(date0, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test008");
        java.util.Calendar calendar0 = null;
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test009");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test010");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(date0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test011");
        java.util.Calendar calendar0 = null;
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test012");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(100L, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test013");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((-1L), "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test015");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '4', "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test016");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 'a', "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test017");
        java.util.Date date0 = null;
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(date0, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test018");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(0L, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test019");
        java.util.Date date0 = null;
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(date0, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test020");
        java.util.Date date0 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(date0, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test021");
        java.util.Date date0 = null;
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(date0, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test022");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (-1), "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test023");
        java.util.Date date0 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(date0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test024");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test025");
        java.util.Calendar calendar0 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test026");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 'a', "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test027");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test028");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.DateFormatUtils.ISO_DATE_FORMAT;
        java.lang.Class<?> wildcardClass1 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test029");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(100L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test030");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.DateFormatUtils.ISO_TIME_NO_T_FORMAT;
        java.lang.Class<?> wildcardClass1 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test031");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test032");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test033");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 100, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test034");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((-1L), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test035");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '#', "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test036");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) ' ', "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test037");
        java.util.Date date0 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(date0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test038");
        java.util.Calendar calendar0 = null;
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test039");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(date0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test040");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) ' ', "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test041");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 100, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test042");
        java.util.Date date0 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(date0, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test043");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(date0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test044");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(1L, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test045");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.DateFormatUtils.ISO_TIME_NO_T_TIME_ZONE_FORMAT;
        java.lang.Class<?> wildcardClass1 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test046");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(date0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test047");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((-1L), "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test048");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(10L, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test049");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(100L, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test050");
        java.util.Calendar calendar0 = null;
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test051");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test052");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '#', "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test053");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(0L, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test054");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 100, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test056");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 0, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test057");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(0L, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test058");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test059");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.DateFormatUtils.SMTP_DATETIME_FORMAT;
        java.lang.Class<?> wildcardClass1 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test060");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT;
        java.lang.Class<?> wildcardClass1 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test061");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) ' ', "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test062");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 'a', "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test063");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(0L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test064");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test065");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test066");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(10L, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test067");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(0L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test069");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.DateFormatUtils.ISO_DATE_TIME_ZONE_FORMAT;
        java.lang.Class<?> wildcardClass1 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test070");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test071");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test072");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(10L, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test073");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test074");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test075");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 0, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test076");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test077");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test078");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) -1, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test079");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.DateFormatUtils.ISO_DATETIME_FORMAT;
        java.lang.Class<?> wildcardClass1 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test080");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(1L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test081");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 0, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test083");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(10L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test084");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 10, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test085");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test086");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 1, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test087");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 'a', "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test088");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test089");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 100, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test090");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test091");
        org.apache.commons.lang3.time.DateFormatUtils dateFormatUtils0 = new org.apache.commons.lang3.time.DateFormatUtils();
        java.lang.Class<?> wildcardClass1 = dateFormatUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test092");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 10, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test093");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 10, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test094");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 'a', "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test095");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(1L, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test096");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test097");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 100, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test098");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test099");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 10, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test101");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 10, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test102");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test103");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) -1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test104");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) '#', "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test105");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(0L, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test106");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(0L, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test107");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(0L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test108");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((-1L), "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test109");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(100L, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test110");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 0, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test111");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 1, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test112");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (-1), "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test113");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((-1L), "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test114");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test115");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 10, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test116");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test117");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(100L, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test118");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 1, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test119");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 100, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test120");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 0, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test121");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) -1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test122");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 10, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test123");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '4', "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test124");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(0L, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test125");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 0, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test126");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test127");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.DateFormatUtils.ISO_TIME_FORMAT;
        java.lang.Class<?> wildcardClass1 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test129");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test130");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test131");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 100, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test132");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) '4', "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test133");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) -1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test134");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) -1, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test135");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test136");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 0, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test137");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '4', "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test138");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test139");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 10, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test140");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(0L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test141");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(0L, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test142");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(10L, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test143");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 0, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test144");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test145");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 10, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test146");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test147");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) -1, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test148");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 1, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test149");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(1L, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test150");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 1, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test151");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test152");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 100, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test153");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '4', "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test154");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test155");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '4', "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test156");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) -1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test157");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) -1, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test158");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test159");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 10, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test160");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test161");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test162");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test163");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (-1), "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test164");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(10L, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test165");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test166");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test167");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(0L, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test168");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((-1L), "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test169");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) '#', "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test171");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((-1L), "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test172");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test173");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test174");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (-1), "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test175");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 0, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test176");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 1, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test177");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test178");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test179");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(1L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test180");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 10, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test181");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) ' ', "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test182");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test183");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 1, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test184");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.DateFormatUtils.ISO_TIME_TIME_ZONE_FORMAT;
        java.lang.Class<?> wildcardClass1 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test185");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 0, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test186");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 1, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test187");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test188");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test189");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test190");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 0, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test191");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test192");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test193");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(10L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test194");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 100, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test195");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(10L, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test196");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) -1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test197");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test198");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '#', "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test199");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 100, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test200");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test201");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 10, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test202");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 0, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test203");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) -1, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test204");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) -1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test205");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 0, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test206");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 0, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test207");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test208");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((-1L), "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test209");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 10, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test211");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 10, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test212");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 10, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test213");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 100, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test214");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test215");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(1L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test216");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 100, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test217");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 1, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test218");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 0, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test219");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 0, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test220");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test221");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(100L, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test222");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 0, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test223");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 100, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test224");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(10L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test225");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '#', "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test226");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test227");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '#', "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test228");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 10, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test229");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 1, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test230");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test231");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (-1), "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test232");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(1L, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test233");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test234");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test235");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test236");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test237");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) ' ', "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test238");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 1, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test239");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test240");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test241");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 10, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test242");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) -1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test243");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(100L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test244");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 100, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test245");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 100, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test246");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 10, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test247");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 10, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test248");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test249");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((-1L), "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test250");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(10L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test251");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test252");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 10, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test253");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(100L, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test254");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 10, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test255");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 100, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test256");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 'a', "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test257");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) '4', "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test258");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test259");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test260");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '4', "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test261");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 100, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test262");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(10L, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test263");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 100, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test264");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 'a', "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test265");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) -1, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test266");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test267");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) -1, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test268");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test269");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) ' ', "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test270");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((-1L), "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test271");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(1L, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test272");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(10L, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test273");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(1L, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test274");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 100, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test275");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test276");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test277");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(1L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test278");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(100L, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test279");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(100L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test280");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test281");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 100, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test282");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test283");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) -1, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test284");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(1L, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test285");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test286");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test287");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 100, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test288");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) ' ', "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test289");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 100, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test290");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (-1), "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test291");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '#', "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test292");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) -1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test293");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (-1), "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test294");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) ' ', "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test295");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test296");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(1L, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test297");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (-1), "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test298");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test299");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((-1L), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test300");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 10, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test301");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 10, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test302");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test303");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 100, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test304");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 0, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test305");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((-1L), "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test306");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test307");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test308");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(100L, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test309");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test310");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test311");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test312");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 'a', "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test313");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(100L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test314");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test315");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test316");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 10, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test317");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test318");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.test319");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

