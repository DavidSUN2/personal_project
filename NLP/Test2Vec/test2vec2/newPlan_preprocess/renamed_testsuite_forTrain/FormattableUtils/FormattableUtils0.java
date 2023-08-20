
package FormattableUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FormattableUtils0 {

    public static boolean debug = false;

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0001");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) '4', (int) '4', charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0002");
        java.util.Formattable formattable0 = null;
        java.lang.String str1 = org.apache.commons.lang3.text.FormattableUtils.toString(formattable0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0003");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, 0, 100, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0004");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) 100, (int) (short) 0, (int) '#', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0005");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (byte) 0, (int) 'a', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0006");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0007");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0008");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0009");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0010");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) ' ', (int) 'a', ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0011");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', (int) (short) 0, (int) (byte) 100, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0012");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, 0, (int) (byte) 100, charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0013");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (int) (short) 0, (int) 'a', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0014");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (byte) 100, (int) ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0015");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) 'a', (int) (byte) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0016");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (-1), (int) (byte) 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0017");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0018");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) (short) 1, (int) '#', ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0019");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, 0, (int) (byte) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0020");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) (short) 100, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0021");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (byte) 100, 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0022");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) (byte) -1, 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0023");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) -1, (int) (byte) 0, (int) (byte) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0024");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) 'a', (-1), 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0025");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, 1, (int) 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0026");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0027");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) ' ', (int) (short) 100, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0028");
        org.apache.commons.lang3.text.FormattableUtils formattableUtils0 = new org.apache.commons.lang3.text.FormattableUtils();
        java.lang.Class<?> wildcardClass1 = formattableUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0029");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) (byte) -1, (int) (short) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0030");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0031");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, 100, (int) (short) 0, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0032");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) 'a', (int) '4', '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0033");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) '4', (int) (short) -1, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0034");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, 10, (int) (short) 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0035");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) '#', 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0036");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, 10, (int) (short) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0037");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 0, (int) (byte) 1, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0038");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) -1, (int) ' ', (int) '#', '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0039");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (short) -1, (int) (byte) 1, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0040");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (short) 100, (int) (byte) 100, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0041");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) ' ', (int) (short) 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0042");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) ' ', (int) (byte) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0043");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (short) 1, (int) (short) -1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0044");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (short) 10, (int) 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0045");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) (byte) 10, (int) (short) -1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0046");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, 10, (int) (short) 100, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0047");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, 100, (int) '4', '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0048");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) -1, (int) '#', (int) '#', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0049");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0050");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) (short) -1, 100, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0051");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (int) (byte) 10, (int) (short) 100, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0052");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) -1, (int) (short) 1, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0053");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), 0, 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0054");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, 100, (int) ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0055");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0056");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) 'a', (int) '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0057");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, 10, (int) ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0058");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, (-1), (int) ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0059");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) (byte) 0, (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0060");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (short) -1, (int) (short) 100, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0061");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (byte) 0, (int) (byte) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0062");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (byte) 1, (int) ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0063");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0064");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) (byte) 0, (int) (byte) 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0065");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0066");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) '4', (int) (short) 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0067");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0068");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', 10, (int) 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0069");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) ' ', (int) (short) 1, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0070");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', 0, (int) 'a', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0071");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, (int) (short) -1, 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0072");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) 'a', (int) (short) 100, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0073");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0074");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) (byte) 0, (int) (byte) 10, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0075");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0076");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0077");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (byte) 10, (int) ' ', '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0078");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (byte) 10, (int) (byte) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0079");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, 1, (int) (short) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0080");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (short) -1, (int) '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0081");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, (int) (short) 10, 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0082");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, 100, 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0083");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (int) '4', (int) '4', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0084");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) (short) -1, 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0085");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0086");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, 10, (int) '4', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0087");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0088");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0089");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', 0, 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0090");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) (byte) 1, 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0091");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0092");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0093");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, 10, (int) (byte) 10, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0094");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) (byte) -1, (int) (short) -1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0095");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) (byte) 10, (int) '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0096");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) (byte) 1, (int) ' ', 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0097");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0098");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (int) (short) 1, 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0099");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (short) 10, (int) (byte) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0100");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, 1, (int) (byte) 100, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0101");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0102");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) (short) 1, (int) (byte) 10, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0103");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, 0, (int) (byte) 100, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0104");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) 100, (int) (byte) 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0105");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (short) 1, (int) (short) 1, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0106");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) (short) -1, (int) (byte) 0, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0107");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0108");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0109");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (-1), (int) (short) 10, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0110");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) (byte) 10, (int) (byte) 1, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0111");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) '#', (int) (short) 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0112");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) '#', (int) (short) 100, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0113");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0114");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) ' ', (int) ' ', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0115");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (short) -1, 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0116");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) '#', (int) '#', '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0117");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 0, (int) '4', '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0118");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (-1), (int) (short) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0119");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) (byte) -1, (int) (short) 1, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0120");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', 10, (int) 'a', 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0121");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (-1), (-1), (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0122");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) (short) 10, 100, 'a', charSequence6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0123");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 0, 0, (int) (byte) 0, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0124");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, 0, 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0125");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (short) 10, (int) ' ', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0126");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, 100, (int) (byte) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0127");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, 0, (int) '#', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0128");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, (int) '4', (int) (short) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0129");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0130");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0131");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', 1, 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0132");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0133");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) 'a', (int) (byte) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0134");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, (int) (short) 1, (int) (short) -1, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0135");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, 0, (int) '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0136");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', 1, 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0137");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (int) (short) -1, (-1), 'a', charSequence6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0138");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) 100, (int) 'a', (int) (byte) 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0139");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (-1), (int) '#', '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0140");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0141");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0142");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) '#', (int) ' ', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0143");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, 100, 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0144");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (byte) 10, 0, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0145");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, (int) (byte) -1, (-1), (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0146");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) (byte) -1, (-1), (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0147");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, (int) 'a', 0, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0148");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (int) (short) 100, (-1), 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0149");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, (int) (byte) 0, (int) (byte) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0150");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) (byte) 10, 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0151");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) (short) 10, (int) (byte) 10, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0152");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) (byte) 1, (int) (short) 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0153");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (byte) -1, (-1), '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0154");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0155");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (byte) 0, (int) '#', ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0156");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0157");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) 10, (int) (short) 10, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0158");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, 0, (int) (short) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0159");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) '#', (int) '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0160");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, 10, (int) (short) 100, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0161");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0162");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, 0, (int) (byte) 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0163");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, 1, 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0164");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) 1, (int) (short) 0, 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0165");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, 1, (int) (byte) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0166");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) (byte) -1, (int) (byte) 0, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0167");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0168");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (-1), (int) '#', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0169");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0170");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0171");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) ' ', 10, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0172");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) 10, 0, 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0173");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0174");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) (short) 10, 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0175");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0176");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, 1, (int) '#', 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0177");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) (short) 0, (int) (byte) 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0178");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) (byte) 1, (-1), (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0179");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (int) (short) 0, 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0180");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) '4', (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0181");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, 10, (int) (byte) 1, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0182");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, 1, (int) ' ', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0183");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (byte) 1, 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0184");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), (int) (short) -1, 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0185");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, 10, (int) (byte) 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0186");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) '4', (int) '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0187");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (short) 1, (int) (short) 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0188");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, (int) (byte) 0, (int) (byte) 0, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0189");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) 1, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0190");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, 0, (int) (byte) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0191");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) (short) 1, (int) (short) 10, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0192");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, 0, 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0193");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (-1), 1, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0194");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, 100, (int) (byte) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0195");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) (short) 0, (int) (short) 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0196");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (byte) 100, (int) (byte) 10, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0197");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) 'a', (int) (byte) -1, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0198");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0199");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0200");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), 10, (int) (short) 10, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0201");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0202");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) (short) 1, (int) (byte) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0203");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0204");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (byte) 10, (int) (byte) 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0205");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) (short) 1, (int) (byte) 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0206");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (short) 1, (int) (byte) -1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0207");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0208");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, 100, (int) '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0209");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0210");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) -1, (int) '4', (int) (short) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0211");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) '4', (int) (short) 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0212");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) ' ', (int) '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0213");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) '4', (int) (byte) 1, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0214");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) (byte) 10, (int) (short) 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0215");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, 1, (int) (short) 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0216");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0217");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) (byte) 0, 100, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0218");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) ' ', (int) (short) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0219");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0220");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, (int) (byte) 1, (-1), (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0221");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) 10, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0222");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) '#', (int) (byte) 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0223");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (-1), (int) (byte) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0224");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (byte) 10, (int) (short) 100, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0225");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, (int) (short) -1, (int) (short) 0, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0226");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0227");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, (int) (short) 1, (int) (byte) 100, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0228");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) (byte) 1, 100, ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0229");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (short) 1, (int) (byte) -1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0230");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) '4', 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0231");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, 1, (int) 'a', ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0232");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (short) -1, (int) '#', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0233");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (-1), (int) (short) 0, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0234");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (byte) 1, (int) 'a', '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0235");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, 0, (int) 'a', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0236");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0237");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, 100, (int) '#', 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0238");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (int) '#', (int) ' ', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0239");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) (byte) 10, 100, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0240");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0241");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 0, (-1), '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0242");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) '#', (int) (short) 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0243");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) '4', (int) (byte) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0244");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (byte) 1, 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0245");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0246");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, 10, (int) (byte) 0, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0247");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0248");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0249");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (short) 1, (int) (short) 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0250");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (-1), (int) (byte) 100, charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0251");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, 100, (int) 'a', '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0252");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) (short) -1, (-1), (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0253");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 100, (int) (byte) -1, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0254");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) (short) 10, (int) (byte) 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0255");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (short) -1, 0, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0256");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) (byte) 10, 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0257");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0258");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) -1, (int) ' ', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0259");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0260");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) 'a', 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0261");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (-1), (int) '#', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0262");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, 10, (int) 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0263");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) '#', 0, charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0264");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, 0, (int) (short) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0265");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) 100, (int) '#', (int) '#', 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0266");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) (short) 0, (int) '4', '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0267");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0268");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (byte) 1, (int) 'a', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0269");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) (short) 0, (-1), '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0270");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, 10, (int) '#', ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0271");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0272");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) '4', 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0273");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0274");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (-1), (int) (byte) 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0275");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (byte) -1, 10, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0276");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) (short) 1, (int) 'a', '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0277");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0278");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) (byte) -1, (int) (byte) 100, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0279");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, 100, (int) '4', '4', charSequence6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0280");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, 0, (int) (byte) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0281");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (short) 1, 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0282");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (byte) -1, (int) '#', charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0283");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (byte) 10, (int) (short) 10, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0284");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) '#', (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0285");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, 10, 0, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0286");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (byte) 0, (int) (byte) 100, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0287");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 100, (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0288");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (-1), (int) (short) 1, ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0289");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (short) 100, (int) (byte) 100, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0290");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (int) '4', (int) (byte) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0291");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0292");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', 1, (int) (short) 0, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0293");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) ' ', (int) '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0294");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (int) (short) 100, (int) (byte) 100, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0295");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) '#', (int) (short) 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0296");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (byte) 100, (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0297");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) (short) 10, (int) (byte) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0298");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0299");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, 0, (int) (byte) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0300");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (byte) 10, (int) (byte) 10, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0301");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 100, (int) (short) 10, 0, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0302");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 100, (int) (byte) -1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0303");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) 0, (int) (short) 100, (int) (short) 100, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0304");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0305");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) (short) 10, (int) (byte) -1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0306");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0307");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, 0, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0308");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, 10, 0, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0309");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, 0, (int) (byte) 10, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0310");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) 'a', (int) '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0311");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) -1, (int) (short) 100, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0312");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0313");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) '#', (int) (byte) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0314");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, 100, 0, charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0315");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0316");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 0, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0317");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0318");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) ' ', 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0319");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) ' ', (int) (short) 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0320");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0321");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (int) (byte) 0, 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0322");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) (short) 10, 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0323");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0324");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) 'a', (int) (short) 10, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0325");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0326");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0327");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) ' ', (int) (short) 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0328");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) (short) 10, 0, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0329");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0330");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) '#', (int) '#', 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0331");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (int) (byte) 10, (int) (byte) 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0332");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) 1, (int) (short) 100, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0333");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (-1), (int) '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0334");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) '#', (int) (short) 100, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0335");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0336");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0337");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, 10, 0, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0338");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), (int) (short) 100, 0, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0339");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (-1), 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0340");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, 0, (int) (byte) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0341");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) (short) 0, (int) '#', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0342");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (-1), (int) (byte) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0343");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (-1), (int) '4', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0344");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), 100, (int) 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0345");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0346");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', 0, (int) (short) 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0347");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0348");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0349");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) ' ', (int) ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0350");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) (short) 1, (int) (byte) 10, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0351");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0352");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) 1, (int) (byte) 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0353");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 0, (int) ' ', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0354");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0355");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, 0, 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0356");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (short) 10, (-1), 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0357");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) (byte) 10, (int) '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0358");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) '#', (int) '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0359");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, 1, (int) (short) 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0360");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (short) -1, (int) (short) 0, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0361");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) (byte) -1, (int) (byte) -1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0362");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, 100, (int) '#', '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0363");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0364");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, 10, (int) (short) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0365");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', 100, 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0366");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, 10, (int) (short) 1, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0367");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', 0, 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0368");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) '4', (int) (byte) 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0369");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 10, 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0370");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0371");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, (int) '4', (int) 'a', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0372");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) ' ', (int) ' ', '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0373");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) '4', (int) ' ', '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0374");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) (byte) 10, (int) (byte) 0, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0375");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (byte) 1, (int) (short) 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0376");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0377");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (byte) 0, (int) (byte) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0378");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, (int) (byte) 1, (int) (short) 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0379");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (-1), 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0380");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (short) -1, (int) (short) -1, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0381");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, (int) (byte) -1, (int) (short) 0, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0382");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) (short) 10, (int) (short) -1, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0383");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) '4', 10, (-1), ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0384");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0385");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, (int) (short) 100, (int) ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0386");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) (short) 10, (-1), (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0387");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 100, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0388");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) (short) 1, (int) (short) -1, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0389");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', 100, (int) '#', '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0390");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0391");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0392");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) (short) 10, 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0393");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', 1, 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0394");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0395");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) (byte) 10, 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0396");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0397");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0398");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) (short) 0, (int) (byte) 100, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0399");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, (int) (byte) -1, 10, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0400");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0401");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0402");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) ' ', (int) ' ', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0403");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (byte) -1, 10, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0404");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) -1, (int) (byte) 0, (int) (byte) 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0405");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) (short) 1, (int) (short) 0, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0406");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, (int) (byte) -1, (int) (short) 100, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0407");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) (short) 1, (-1), '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0408");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', 10, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0409");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0410");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) (short) 10, 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0411");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', 1, (int) (short) 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0412");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (byte) 10, (int) (short) 100, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0413");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, 0, (int) (short) 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0414");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, 0, (int) (short) 100, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0415");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) '#', (int) (short) 100, (int) (short) 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0416");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0417");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, (int) (byte) 0, 0, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0418");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (-1), (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0419");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (byte) 10, 10, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0420");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (short) 100, (-1), '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0421");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) 0, 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0422");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) (byte) 1, 0, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0423");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, (int) (byte) 1, (int) (short) -1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0424");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, 1, 100, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0425");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, 100, (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0426");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0427");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (-1), (int) (short) 10, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0428");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) 'a', (int) '#', '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0429");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (byte) 1, 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0430");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, 100, (int) (byte) 1, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0431");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0432");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) (short) 0, 0, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0433");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0434");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, (int) '#', 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0435");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (byte) 10, 0, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0436");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (byte) 1, (int) (short) -1, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0437");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, 10, (int) (short) -1, ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0438");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0439");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0440");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) (byte) 100, 100, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0441");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0442");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, 10, (int) (byte) 10, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0443");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (byte) 0, 1, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0444");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) (short) -1, (int) '#', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0445");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', 100, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0446");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (-1), 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0447");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, 10, 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0448");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) (byte) 1, (int) (short) 0, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0449");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, 10, 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0450");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (-1), (int) (byte) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0451");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, 10, (int) (short) 10, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0452");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) (short) -1, 0, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0453");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0454");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 1, 100, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0455");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0456");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', (int) (short) 100, 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0457");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 0, (int) '4', (int) ' ', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0458");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) (byte) 1, (int) ' ', '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0459");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (-1), 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0460");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) 'a', (int) (byte) -1, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0461");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, 100, (int) (byte) 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0462");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', 1, (int) (short) 0, ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0463");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0464");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (short) 1, (int) '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0465");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) -1, (int) (byte) -1, '4', charSequence6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0466");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, 100, 0, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0467");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) (byte) 1, (-1), '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0468");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), 0, 1, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0469");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, (int) (byte) 10, (int) 'a', 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0470");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0471");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, (int) (short) -1, 100, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0472");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0473");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) (short) 1, (int) (short) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0474");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) '4', 0, (int) (short) -1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0475");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (int) (byte) 10, (int) (byte) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0476");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) 'a', 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0477");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (short) 10, (int) (byte) 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0478");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0479");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (byte) 0, (int) ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0480");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, 10, 10, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0481");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0482");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0483");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 10, (int) (short) 100, (int) '#', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0484");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, 100, (int) (byte) -1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0485");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (short) -1, (int) '4', '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0486");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, 0, (int) (byte) -1, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0487");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, (int) 'a', (int) 'a', 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0488");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, 100, 0, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0489");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0490");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, 10, (int) (byte) 100, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0491");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, (int) '#', (int) '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0492");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0493");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) '#', 100, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0494");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (-1), (int) (byte) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0495");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (int) (byte) 0, (int) '4', '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0496");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0497");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) ' ', (int) '4', charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0498");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0499");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) (byte) -1, (-1), '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils0.test0500");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', (int) '4', 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

