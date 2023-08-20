package FormattableUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FormattableUtils0 {

    public static boolean debug = false;

    @Test
    public void FormattableUtils0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0001");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) '4', (int) '4', charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0002");
        java.util.Formattable formattable0 = null;
        java.lang.String str1 = org.apache.commons.lang3.text.FormattableUtils.toString(formattable0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
    }

    @Test
    public void FormattableUtils0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0003");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, 0, 100, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0004");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) 100, (int) (short) 0, (int) '#', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0005");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (byte) 0, (int) 'a', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0006");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0007");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FormattableUtils0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0008");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0009");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0010");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) ' ', (int) 'a', ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0011");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', (int) (short) 0, (int) (byte) 100, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0012");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, 0, (int) (byte) 100, charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0013");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (int) (short) 0, (int) 'a', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0014");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (byte) 100, (int) ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0015");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) 'a', (int) (byte) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0016");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (-1), (int) (byte) 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0017");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0018");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) (short) 1, (int) '#', ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0019");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, 0, (int) (byte) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0020");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) (short) 100, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0021");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (byte) 100, 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0022");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) (byte) -1, 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0023");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) -1, (int) (byte) 0, (int) (byte) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0024");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) 'a', (-1), 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0025");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, 1, (int) 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0026");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0027");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) ' ', (int) (short) 100, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0028");
        org.apache.commons.lang3.text.FormattableUtils formattableUtils0 = new org.apache.commons.lang3.text.FormattableUtils();
        java.lang.Class<?> wildcardClass1 = formattableUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FormattableUtils0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0029");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) (byte) -1, (int) (short) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0030");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0031");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, 100, (int) (short) 0, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0032");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) 'a', (int) '4', '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0033");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) '4', (int) (short) -1, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0034");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, 10, (int) (short) 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0035");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) '#', 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0036");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, 10, (int) (short) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0037");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 0, (int) (byte) 1, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0038");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) -1, (int) ' ', (int) '#', '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0039");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (short) -1, (int) (byte) 1, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0040");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (short) 100, (int) (byte) 100, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0041");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) ' ', (int) (short) 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0042");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) ' ', (int) (byte) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0043");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (short) 1, (int) (short) -1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0044");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (short) 10, (int) 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0045");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) (byte) 10, (int) (short) -1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0046");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, 10, (int) (short) 100, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0047");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, 100, (int) '4', '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0048");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) -1, (int) '#', (int) '#', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0049");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0050");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) (short) -1, 100, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0051");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (int) (byte) 10, (int) (short) 100, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0052");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) -1, (int) (short) 1, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0053");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), 0, 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0054");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, 100, (int) ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0055");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0056");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) 'a', (int) '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0057");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, 10, (int) ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0058");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, (-1), (int) ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0059");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) (byte) 0, (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0060");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (short) -1, (int) (short) 100, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0061");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (byte) 0, (int) (byte) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0062");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (byte) 1, (int) ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0063");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0064");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) (byte) 0, (int) (byte) 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0065");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0066");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) '4', (int) (short) 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0067");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0068");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', 10, (int) 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0069");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) ' ', (int) (short) 1, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0070");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', 0, (int) 'a', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0071");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, (int) (short) -1, 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0072");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) 'a', (int) (short) 100, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0073");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0074");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) (byte) 0, (int) (byte) 10, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0075");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0076");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0077");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (byte) 10, (int) ' ', '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0078");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (byte) 10, (int) (byte) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0079");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, 1, (int) (short) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0080");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (short) -1, (int) '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0081");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, (int) (short) 10, 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0082");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, 100, 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0083");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (int) '4', (int) '4', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0084");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) (short) -1, 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0085");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0086");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, 10, (int) '4', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0087");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0088");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0089");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', 0, 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0090");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) (byte) 1, 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0091");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0092");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0093");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, 10, (int) (byte) 10, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0094");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) (byte) -1, (int) (short) -1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0095");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) (byte) 10, (int) '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0096");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) (byte) 1, (int) ' ', 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0097");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0098");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (int) (short) 1, 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0099");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (short) 10, (int) (byte) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0100");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, 1, (int) (byte) 100, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0101");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0102");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) (short) 1, (int) (byte) 10, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0103");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, 0, (int) (byte) 100, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0104");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) 100, (int) (byte) 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0105");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (short) 1, (int) (short) 1, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0106");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) (short) -1, (int) (byte) 0, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0107");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0108");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0109");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (-1), (int) (short) 10, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0110");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) (byte) 10, (int) (byte) 1, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0111");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) '#', (int) (short) 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0112");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) '#', (int) (short) 100, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0113");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0114");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) ' ', (int) ' ', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0115");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (short) -1, 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0116");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) '#', (int) '#', '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0117");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 0, (int) '4', '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0118");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (-1), (int) (short) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0119");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) (byte) -1, (int) (short) 1, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0120");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', 10, (int) 'a', 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0121");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (-1), (-1), (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0122");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) (short) 10, 100, 'a', charSequence6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0123");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 0, 0, (int) (byte) 0, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0124");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, 0, 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0125");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (short) 10, (int) ' ', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0126");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, 100, (int) (byte) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0127");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, 0, (int) '#', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0128");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, (int) '4', (int) (short) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0129");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0130");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0131");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', 1, 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0132");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0133");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) 'a', (int) (byte) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0134");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, (int) (short) 1, (int) (short) -1, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0135");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, 0, (int) '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0136");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', 1, 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0137");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (int) (short) -1, (-1), 'a', charSequence6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0138");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) 100, (int) 'a', (int) (byte) 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0139");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (-1), (int) '#', '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0140");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0141");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0142");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) '#', (int) ' ', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0143");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, 100, 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0144");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (byte) 10, 0, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0145");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, (int) (byte) -1, (-1), (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0146");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) (byte) -1, (-1), (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0147");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, (int) 'a', 0, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0148");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (int) (short) 100, (-1), 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0149");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, (int) (byte) 0, (int) (byte) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0150");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) (byte) 10, 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0151");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) (short) 10, (int) (byte) 10, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0152");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) (byte) 1, (int) (short) 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0153");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (byte) -1, (-1), '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0154");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0155");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (byte) 0, (int) '#', ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0156");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0157");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) 10, (int) (short) 10, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0158");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, 0, (int) (short) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0159");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) '#', (int) '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0160");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, 10, (int) (short) 100, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0161");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0162");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, 0, (int) (byte) 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0163");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, 1, 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0164");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) 1, (int) (short) 0, 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0165");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, 1, (int) (byte) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0166");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) (byte) -1, (int) (byte) 0, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0167");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0168");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (-1), (int) '#', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0169");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0170");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0171");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) ' ', 10, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0172");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) 10, 0, 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0173");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0174");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) (short) 10, 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0175");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0176");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, 1, (int) '#', 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0177");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) (short) 0, (int) (byte) 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0178");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) (byte) 1, (-1), (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0179");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (int) (short) 0, 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0180");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) '4', (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0181");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, 10, (int) (byte) 1, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0182");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, 1, (int) ' ', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0183");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (byte) 1, 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0184");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), (int) (short) -1, 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0185");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, 10, (int) (byte) 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0186");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) '4', (int) '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0187");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (short) 1, (int) (short) 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0188");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, (int) (byte) 0, (int) (byte) 0, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0189");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) 1, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0190");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, 0, (int) (byte) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0191");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) (short) 1, (int) (short) 10, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0192");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, 0, 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0193");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (-1), 1, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0194");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, 100, (int) (byte) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0195");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) (short) 0, (int) (short) 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0196");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (byte) 100, (int) (byte) 10, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0197");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) 'a', (int) (byte) -1, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0198");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0199");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0200");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), 10, (int) (short) 10, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0201");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0202");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) (short) 1, (int) (byte) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0203");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0204");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (byte) 10, (int) (byte) 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0205");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) (short) 1, (int) (byte) 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0206");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (short) 1, (int) (byte) -1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0207");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0208");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, 100, (int) '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0209");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0210");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) -1, (int) '4', (int) (short) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0211");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) '4', (int) (short) 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0212");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) ' ', (int) '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0213");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) '4', (int) (byte) 1, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0214");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) (byte) 10, (int) (short) 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0215");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, 1, (int) (short) 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0216");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0217");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) (byte) 0, 100, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0218");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) ' ', (int) (short) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0219");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0220");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, (int) (byte) 1, (-1), (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0221");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) 10, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0222");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) '#', (int) (byte) 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0223");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (-1), (int) (byte) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0224");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (byte) 10, (int) (short) 100, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0225");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, (int) (short) -1, (int) (short) 0, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0226");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0227");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, (int) (short) 1, (int) (byte) 100, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0228");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) (byte) 1, 100, ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0229");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (short) 1, (int) (byte) -1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0230");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) '4', 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0231");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, 1, (int) 'a', ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0232");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (short) -1, (int) '#', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0233");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (-1), (int) (short) 0, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0234");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (byte) 1, (int) 'a', '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0235");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, 0, (int) 'a', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0236");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0237");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, 100, (int) '#', 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0238");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (int) '#', (int) ' ', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0239");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) (byte) 10, 100, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0240");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0241");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 0, (-1), '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0242");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) '#', (int) (short) 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0243");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) '4', (int) (byte) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0244");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (byte) 1, 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0245");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0246");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, 10, (int) (byte) 0, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0247");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0248");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0249");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (short) 1, (int) (short) 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0250");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (-1), (int) (byte) 100, charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0251");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, 100, (int) 'a', '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0252");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) (short) -1, (-1), (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0253");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 100, (int) (byte) -1, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0254");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) (short) 10, (int) (byte) 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0255");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (short) -1, 0, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0256");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) (byte) 10, 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0257");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0258");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) -1, (int) ' ', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0259");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0260");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) 'a', 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0261");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (-1), (int) '#', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0262");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, 10, (int) 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0263");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) '#', 0, charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0264");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, 0, (int) (short) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0265");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) 100, (int) '#', (int) '#', 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0266");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) (short) 0, (int) '4', '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0267");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0268");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (byte) 1, (int) 'a', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0269");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) (short) 0, (-1), '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0270");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, 10, (int) '#', ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0271");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0272");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) '4', 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0273");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0274");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (-1), (int) (byte) 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0275");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (byte) -1, 10, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0276");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) (short) 1, (int) 'a', '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0277");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0278");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) (byte) -1, (int) (byte) 100, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0279");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, 100, (int) '4', '4', charSequence6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0280");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, 0, (int) (byte) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0281");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (short) 1, 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0282");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (byte) -1, (int) '#', charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0283");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (byte) 10, (int) (short) 10, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0284");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) '#', (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0285");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, 10, 0, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0286");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (byte) 0, (int) (byte) 100, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0287");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 100, (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0288");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (-1), (int) (short) 1, ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0289");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (short) 100, (int) (byte) 100, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0290");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (int) '4', (int) (byte) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0291");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0292");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', 1, (int) (short) 0, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0293");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) ' ', (int) '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0294");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (int) (short) 100, (int) (byte) 100, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0295");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) '#', (int) (short) 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0296");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (byte) 100, (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0297");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) (short) 10, (int) (byte) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0298");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0299");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, 0, (int) (byte) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0300");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (byte) 10, (int) (byte) 10, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0301");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 100, (int) (short) 10, 0, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0302");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 100, (int) (byte) -1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0303");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) 0, (int) (short) 100, (int) (short) 100, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0304");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0305");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) (short) 10, (int) (byte) -1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0306");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0307");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, 0, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0308");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, 10, 0, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0309");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, 0, (int) (byte) 10, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0310");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) 'a', (int) '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0311");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) -1, (int) (short) 100, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0312");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0313");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) '#', (int) (byte) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0314");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, 100, 0, charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0315");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0316");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 0, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0317");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0318");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) ' ', 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0319");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) ' ', (int) (short) 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0320");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0321");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (int) (byte) 0, 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0322");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) (short) 10, 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0323");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0324");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) 'a', (int) (short) 10, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0325");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0326");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0327");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) ' ', (int) (short) 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0328");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) (short) 10, 0, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0329");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0330");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) '#', (int) '#', 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0331");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (int) (byte) 10, (int) (byte) 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0332");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) 1, (int) (short) 100, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0333");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (-1), (int) '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0334");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) '#', (int) (short) 100, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0335");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0336");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0337");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, 10, 0, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0338");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), (int) (short) 100, 0, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0339");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (-1), 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0340");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, 0, (int) (byte) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0341");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) (short) 0, (int) '#', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0342");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (-1), (int) (byte) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0343");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (-1), (int) '4', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0344");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), 100, (int) 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0345");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0346");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', 0, (int) (short) 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0347");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0348");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0349");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) ' ', (int) ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0350");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) (short) 1, (int) (byte) 10, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0351");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0352");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) 1, (int) (byte) 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0353");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 0, (int) ' ', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0354");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0355");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, 0, 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0356");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (short) 10, (-1), 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0357");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) (byte) 10, (int) '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0358");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) '#', (int) '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0359");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, 1, (int) (short) 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0360");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (short) -1, (int) (short) 0, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0361");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) (byte) -1, (int) (byte) -1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0362");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, 100, (int) '#', '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0363");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0364");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, 10, (int) (short) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0365");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', 100, 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0366");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, 10, (int) (short) 1, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0367");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', 0, 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0368");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) '4', (int) (byte) 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0369");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 10, 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0370");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0371");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, (int) '4', (int) 'a', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0372");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) ' ', (int) ' ', '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0373");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) '4', (int) ' ', '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0374");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) (byte) 10, (int) (byte) 0, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0375");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (byte) 1, (int) (short) 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0376");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0377");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (byte) 0, (int) (byte) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0378");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, (int) (byte) 1, (int) (short) 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0379");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (-1), 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0380");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (short) -1, (int) (short) -1, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0381");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, (int) (byte) -1, (int) (short) 0, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0382");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) (short) 10, (int) (short) -1, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0383");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) '4', 10, (-1), ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0384");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0385");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, (int) (short) 100, (int) ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0386");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) (short) 10, (-1), (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0387");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 100, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0388");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) (short) 1, (int) (short) -1, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0389");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', 100, (int) '#', '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0390");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0391");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0392");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) (short) 10, 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0393");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', 1, 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0394");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0395");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) (byte) 10, 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0396");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0397");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0398");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) (short) 0, (int) (byte) 100, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0399");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, (int) (byte) -1, 10, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0400");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0401");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0402");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) ' ', (int) ' ', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0403");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (byte) -1, 10, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0404");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) -1, (int) (byte) 0, (int) (byte) 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0405");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) (short) 1, (int) (short) 0, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0406");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, (int) (byte) -1, (int) (short) 100, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0407");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) (short) 1, (-1), '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0408");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', 10, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0409");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0410");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) (short) 10, 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0411");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', 1, (int) (short) 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0412");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (byte) 10, (int) (short) 100, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0413");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, 0, (int) (short) 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0414");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, 0, (int) (short) 100, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0415");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) '#', (int) (short) 100, (int) (short) 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0416");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0417");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, (int) (byte) 0, 0, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0418");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (-1), (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0419");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (byte) 10, 10, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0420");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (short) 100, (-1), '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0421");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) 0, 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0422");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) (byte) 1, 0, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0423");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, (int) (byte) 1, (int) (short) -1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0424");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, 1, 100, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0425");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, 100, (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0426");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0427");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (-1), (int) (short) 10, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0428");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) 'a', (int) '#', '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0429");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (byte) 1, 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0430");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, 100, (int) (byte) 1, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0431");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0432");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) (short) 0, 0, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0433");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0434");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, (int) '#', 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0435");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (byte) 10, 0, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0436");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (byte) 1, (int) (short) -1, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0437");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, 10, (int) (short) -1, ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0438");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0439");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0440");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) (byte) 100, 100, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0441");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0442");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, 10, (int) (byte) 10, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0443");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (byte) 0, 1, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0444");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) (short) -1, (int) '#', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0445");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', 100, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0446");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (-1), 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0447");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, 10, 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0448");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) (byte) 1, (int) (short) 0, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0449");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, 10, 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0450");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (-1), (int) (byte) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0451");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, 10, (int) (short) 10, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0452");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) (short) -1, 0, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0453");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0454");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 1, 100, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0455");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0456");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', (int) (short) 100, 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0457");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 0, (int) '4', (int) ' ', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0458");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) (byte) 1, (int) ' ', '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0459");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (-1), 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0460");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) 'a', (int) (byte) -1, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0461");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, 100, (int) (byte) 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0462");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', 1, (int) (short) 0, ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0463");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0464");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (short) 1, (int) '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0465");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) -1, (int) (byte) -1, '4', charSequence6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0466");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, 100, 0, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0467");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) (byte) 1, (-1), '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0468");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), 0, 1, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0469");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, (int) (byte) 10, (int) 'a', 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0470");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0471");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, (int) (short) -1, 100, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0472");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0473");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) (short) 1, (int) (short) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0474");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) '4', 0, (int) (short) -1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0475");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (int) (byte) 10, (int) (byte) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0476");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) 'a', 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0477");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (short) 10, (int) (byte) 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0478");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0479");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (byte) 0, (int) ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0480");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, 10, 10, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0481");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0482");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0483");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 10, (int) (short) 100, (int) '#', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0484");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, 100, (int) (byte) -1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0485");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (short) -1, (int) '4', '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0486");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, 0, (int) (byte) -1, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0487");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, (int) 'a', (int) 'a', 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0488");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, 100, 0, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0489");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0490");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, 10, (int) (byte) 100, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0491");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, (int) '#', (int) '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0492");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0493");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) '#', 100, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0494");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (-1), (int) (byte) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0495");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (int) (byte) 0, (int) '4', '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0496");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0497");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) ' ', (int) '4', charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0498");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0499");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) (byte) -1, (-1), '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.FormattableUtils0500");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', (int) '4', 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

