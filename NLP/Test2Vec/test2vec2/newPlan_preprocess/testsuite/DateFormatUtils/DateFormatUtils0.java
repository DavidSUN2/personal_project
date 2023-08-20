package DateFormatUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateFormatUtils0 {

    public static boolean debug = false;

    @Test
    public void DateFormatUtils001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils001");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils002");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 100, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils003");
        java.util.Calendar calendar0 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils004");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils005");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils006");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 1, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils007");
        java.util.Date date0 = null;
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(date0, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils008");
        java.util.Calendar calendar0 = null;
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils009");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils010");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(date0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils011");
        java.util.Calendar calendar0 = null;
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils012");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(100L, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils013");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((-1L), "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils014");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils015");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '4', "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils016");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 'a', "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils017");
        java.util.Date date0 = null;
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(date0, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils018");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(0L, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils019");
        java.util.Date date0 = null;
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(date0, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils020");
        java.util.Date date0 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(date0, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils021");
        java.util.Date date0 = null;
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(date0, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils022");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (-1), "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils023");
        java.util.Date date0 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(date0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils024");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils025");
        java.util.Calendar calendar0 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils026");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 'a', "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils027");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils028");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.DateFormatUtils.ISO_DATE_FORMAT;
        java.lang.Class<?> wildcardClass1 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils029");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(100L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils030");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.DateFormatUtils.ISO_TIME_NO_T_FORMAT;
        java.lang.Class<?> wildcardClass1 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils031");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils032");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils033");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 100, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils034");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((-1L), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils035");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '#', "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils036");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) ' ', "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils037");
        java.util.Date date0 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(date0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils038");
        java.util.Calendar calendar0 = null;
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils039");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(date0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils040");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) ' ', "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils041");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 100, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils042");
        java.util.Date date0 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(date0, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils043");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(date0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils044");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(1L, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils045");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.DateFormatUtils.ISO_TIME_NO_T_TIME_ZONE_FORMAT;
        java.lang.Class<?> wildcardClass1 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils046");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(date0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils047");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((-1L), "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils048");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(10L, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils049");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(100L, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils050");
        java.util.Calendar calendar0 = null;
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(calendar0, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils051");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils052");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '#', "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils053");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(0L, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils054");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 100, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils055");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils056");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 0, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils057");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(0L, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils058");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils059");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.DateFormatUtils.SMTP_DATETIME_FORMAT;
        java.lang.Class<?> wildcardClass1 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils060");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT;
        java.lang.Class<?> wildcardClass1 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils061");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) ' ', "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils062");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 'a', "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils063");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(0L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils064");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils065");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils066");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(10L, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils067");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils068");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(0L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils069");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.DateFormatUtils.ISO_DATE_TIME_ZONE_FORMAT;
        java.lang.Class<?> wildcardClass1 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils070");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils071");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils072");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(10L, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils073");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils074");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils075");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 0, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils076");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils077");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils078");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) -1, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils079");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.DateFormatUtils.ISO_DATETIME_FORMAT;
        java.lang.Class<?> wildcardClass1 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils080");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(1L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils081");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 0, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils082");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils083");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(10L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils084");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 10, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils085");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils086");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 1, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils087");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 'a', "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils088");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils089");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 100, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils090");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils091");
        org.apache.commons.lang3.time.DateFormatUtils dateFormatUtils0 = new org.apache.commons.lang3.time.DateFormatUtils();
        java.lang.Class<?> wildcardClass1 = dateFormatUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils092");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 10, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils093");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 10, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils094");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 'a', "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils095");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(1L, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils096");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils097");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 100, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils098");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils099");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 10, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils100");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils101");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 10, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils102");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils103");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) -1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils104");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) '#', "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils105");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(0L, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils106");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(0L, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils107");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(0L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils108");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((-1L), "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils109");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(100L, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils110");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 0, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils111");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 1, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils112");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (-1), "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils113");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((-1L), "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils114");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils115");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 10, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils116");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils117");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(100L, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils118");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 1, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils119");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 100, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils120");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 0, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils121");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) -1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils122");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 10, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils123");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '4', "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils124");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(0L, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils125");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 0, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils126");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils127");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.DateFormatUtils.ISO_TIME_FORMAT;
        java.lang.Class<?> wildcardClass1 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils128");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils129");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils130");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils131");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 100, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils132");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) '4', "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils133");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) -1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils134");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) -1, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils135");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils136");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 0, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils137");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '4', "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils138");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils139");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 10, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils140");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(0L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils141");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(0L, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils142");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(10L, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils143");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 0, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils144");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils145");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 10, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils146");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils147");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) -1, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils148");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 1, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils149");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(1L, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils150");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 1, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils151");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils152");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 100, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils153");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '4', "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils154");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils155");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '4', "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils156");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) -1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils157");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) -1, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils158");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils159");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 10, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils160");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils161");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils162");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils163");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (-1), "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils164");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(10L, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils165");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils166");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils167");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(0L, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils168");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((-1L), "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils169");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) '#', "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils170");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils171");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((-1L), "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils172");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils173");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils174");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (-1), "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils175");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 0, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils176");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 1, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils177");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils178");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils179");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(1L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils180");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 10, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils181");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) ' ', "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils182");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils183");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 1, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils184");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.DateFormatUtils.ISO_TIME_TIME_ZONE_FORMAT;
        java.lang.Class<?> wildcardClass1 = fastDateFormat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DateFormatUtils185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils185");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 0, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils186");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 1, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils187");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils188");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils189");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils190");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 0, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils191");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils192");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils193");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(10L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils194");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 100, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils195");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(10L, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils196");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) -1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils197");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils198");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '#', "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils199");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 100, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils200");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils201");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 10, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils202");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 0, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils203");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) -1, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils204");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) -1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils205");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 0, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils206");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 0, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils207");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils208");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((-1L), "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils209");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 10, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils210");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils211");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 10, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils212");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 10, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils213");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 100, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils214");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils215");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(1L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils216");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 100, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils217");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 1, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils218");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 0, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils219");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 0, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils220");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils221");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(100L, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils222");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 0, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils223");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 100, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils224");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(10L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils225");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '#', "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils226");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils227");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '#', "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils228");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 10, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils229");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 1, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils230");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils231");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (-1), "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils232");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(1L, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils233");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils234");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils235");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils236");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils237");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) ' ', "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils238");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 1, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils239");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils240");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils241");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 10, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils242");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) -1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils243");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(100L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils244");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 100, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils245");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 100, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils246");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 10, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils247");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 10, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils248");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils249");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((-1L), "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils250");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(10L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils251");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils252");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 10, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils253");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(100L, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils254");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 10, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils255");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 100, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils256");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 'a', "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils257");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) '4', "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils258");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils259");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils260");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '4', "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils261");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 100, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils262");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(10L, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils263");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 100, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils264");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 'a', "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils265");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) -1, "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils266");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils267");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) -1, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils268");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils269");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) ' ', "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils270");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((-1L), "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils271");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(1L, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils272");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(10L, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils273");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format(1L, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils274");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 100, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils275");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils276");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils277");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(1L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils278");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(100L, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils279");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format(100L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils280");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils281");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 100, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils282");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils283");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) -1, "", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils284");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(1L, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils285");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils286");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils287");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 100, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils288");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) ' ', "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils289");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 100, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils290");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (-1), "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils291");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) '#', "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils292");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) -1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils293");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (-1), "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils294");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) ' ', "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils295");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils296");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(1L, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils297");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (-1), "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils298");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils299");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((-1L), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils300");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 10, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils301");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 10, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils302");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 0, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils303");
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 100, "hi!", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils304");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 0, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils305");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((-1L), "", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils306");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils307");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils308");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format(100L, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils309");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils310");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils311");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils312");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) 'a', "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils313");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC(100L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils314");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 1, "hi!", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils315");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils316");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (byte) 10, "hi!", timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils317");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) (short) 1, "", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils318");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.formatUTC((long) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void DateFormatUtils319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DateFormatUtils0.DateFormatUtils319");
        // The following exception was thrown during execution in DateFormatUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.time.DateFormatUtils.format((long) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

