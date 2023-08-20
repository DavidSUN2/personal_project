
package FormattableUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FormattableUtils1 {

    public static boolean debug = false;

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0501");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) (byte) -1, (-1), '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0502");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, 0, (int) (byte) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0503");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, 10, (int) (byte) 10, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0504");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 100, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0505");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) 10, (int) '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0506");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) ' ', (int) '4', 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0507");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) (short) 0, 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0508");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, 10, 0, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0509");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) (byte) -1, (int) (short) 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0510");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) (byte) 1, (int) (short) -1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0511");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, (int) 'a', (int) (short) 0, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0512");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) (short) -1, (int) (byte) 0, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0513");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0514");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0515");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (short) 100, (int) (short) 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0516");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) 'a', (int) (short) 0, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0517");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 10, 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0518");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0519");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) 'a', (int) '#', '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0520");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) 100, (int) (short) 0, (int) (short) 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0521");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0522");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0523");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0524");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (int) 'a', (int) (byte) -1, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0525");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, (int) (byte) 100, (int) 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0526");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) (short) 0, (int) 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0527");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) '4', (int) (byte) -1, (int) ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0528");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), (int) '4', (int) (byte) 100, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0529");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 100, 10, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0530");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0531");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0532");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) 'a', (int) (short) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0533");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (byte) 10, (int) (byte) 10, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0534");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', 0, (int) '4', 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0535");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (byte) 100, (int) (short) 1, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0536");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (byte) -1, (int) (short) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0537");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) (byte) 10, (-1), '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0538");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (short) 1, (-1), '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0539");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0540");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) (short) 1, 10, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0541");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), 0, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0542");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), 1, (int) (byte) 100, charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0543");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 100, 10, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0544");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) (short) 0, (int) 'a', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0545");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 1, (int) (short) 100, (int) (byte) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0546");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), (int) (byte) -1, (int) '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0547");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', (int) (short) 100, (int) (byte) 100, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0548");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0549");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (short) 100, (int) (short) -1, '#', charSequence6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0550");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', (int) '#', (int) (short) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0551");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 100, (int) (byte) 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0552");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, 10, (int) '#', 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0553");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (int) ' ', 10, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0554");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) '#', 10, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0555");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) '4', 0, ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0556");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (-1), (int) (byte) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0557");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) (byte) 10, (int) (byte) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0558");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) (byte) 0, (int) (short) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0559");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0560");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 0, (int) (byte) 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0561");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, 0, (int) (short) 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0562");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, (int) (short) 0, (int) ' ', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0563");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) '#', (int) '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0564");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, 0, (int) '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0565");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0566");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0567");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) '4', (int) '4', ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0568");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0569");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0570");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) 'a', (int) 'a', 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0571");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (byte) 0, (int) '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0572");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', 1, (int) (byte) 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0573");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0574");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) 100, (int) (short) 0, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0575");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) (short) 1, (int) (short) 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0576");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) (short) 10, (int) 'a', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0577");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) (short) 1, 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0578");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0579");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 0, 1, (int) '#', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0580");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) 'a', 0, (int) (byte) -1, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0581");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, 0, (int) ' ', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0582");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', 0, (int) 'a', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0583");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) 10, (int) (byte) 1, (int) (short) 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0584");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (byte) 10, (int) (short) 0, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0585");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', 0, (int) (short) 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0586");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0587");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0588");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) -1, (int) 'a', (int) (short) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0589");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0590");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, 1, 10, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0591");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, (int) (short) 1, (int) (short) 0, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0592");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (short) -1, (int) (short) 0, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0593");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, 0, (int) (short) -1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0594");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (short) 1, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0595");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, 0, (int) (short) -1, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0596");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0597");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) '#', (-1), (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0598");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) '#', (int) (short) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0599");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) '4', (int) (short) -1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0600");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, 0, (int) (byte) 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0601");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (-1), 10, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0602");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (byte) 1, (int) (byte) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0603");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) (short) 100, 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0604");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (short) 100, (int) (short) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0605");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0606");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (int) 'a', (int) (short) -1, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0607");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0608");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, 1, (int) ' ', 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0609");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0610");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) '4', (int) 'a', ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0611");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) '4', (int) (byte) -1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0612");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) ' ', (int) (short) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0613");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) (byte) 1, (int) (short) 0, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0614");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, 100, (int) (byte) 10, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0615");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (byte) 0, (int) (short) 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0616");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, 100, (int) (short) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0617");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) (byte) 1, (int) (byte) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0618");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), (int) (byte) 100, (int) ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0619");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) (byte) 0, (int) ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0620");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) -1, 0, 1, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0621");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', 0, (int) (byte) 10, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0622");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0623");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) (byte) 0, (int) (short) -1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0624");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0625");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0626");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, 0, 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0627");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) -1, (-1), '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0628");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (short) 10, 10, ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0629");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) -1, 0, (-1), '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0630");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) (short) 0, (int) '4', '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0631");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0632");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0633");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 10, (int) (short) 100, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0634");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', 10, 10, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0635");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', 10, 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0636");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 100, (int) 'a', ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0637");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) 10, (int) (short) 0, (int) ' ', charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0638");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) ' ', (int) '#', 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0639");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0640");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0641");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, 0, (int) 'a', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0642");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, 0, 10, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0643");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, (int) (byte) 100, (int) (byte) 0, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0644");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, 0, (int) '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0645");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (int) (byte) 10, (int) ' ', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0646");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (-1), (int) 'a', ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0647");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (byte) 10, (int) (short) 100, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0648");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0649");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) (byte) 1, 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0650");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) 'a', (int) '4', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0651");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (short) 0, (int) (byte) 1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0652");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) (byte) -1, 10, ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0653");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', 10, 1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0654");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) (byte) 0, 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0655");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) 1, 10, (int) (byte) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0656");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0657");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, 10, (int) (short) 0, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0658");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (byte) 100, (-1), 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0659");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0660");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0661");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0662");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (short) 1, (int) '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0663");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0664");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0665");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, 10, (int) (byte) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0666");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0667");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) 'a', (int) (byte) 10, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0668");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, 10, (int) '#', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0669");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) (byte) 10, (int) 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0670");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (byte) 0, (int) '4', '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0671");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), 100, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0672");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) '4', 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0673");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 0, 10, (int) (byte) 0, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0674");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, 0, (-1), '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0675");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0676");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0677");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (byte) 0, (int) ' ', '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0678");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, (int) (byte) 100, (int) (byte) 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0679");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0680");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) (short) 1, (int) '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0681");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, (int) (short) 0, (int) (byte) 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0682");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0683");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, 100, (int) (byte) -1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0684");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, (int) 'a', 0, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0685");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, 0, (int) (byte) -1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0686");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, 10, (int) (short) 100, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0687");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) (byte) 100, 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0688");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, 10, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0689");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0690");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), (int) '4', 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0691");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) (short) -1, (int) (short) 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0692");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0693");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, 100, 1, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0694");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (short) 0, 10, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0695");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (byte) 0, 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0696");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) 'a', 10, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0697");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) '4', (int) (short) 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0698");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) '4', 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0699");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, (int) (byte) 0, (int) '4', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0700");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0701");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (-1), (int) (byte) 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0702");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0703");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0704");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) 'a', (int) (byte) 1, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0705");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 100, (int) (byte) 1, (-1), charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0706");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0707");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (short) 0, (int) '4', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0708");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', 10, (int) (short) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0709");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, 0, (int) (byte) 100, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0710");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) 100, (int) (byte) 100, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0711");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (-1), (int) (short) 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0712");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (byte) 0, (int) ' ', ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0713");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', 10, (int) (byte) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0714");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0715");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, 1, (int) (byte) 0, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0716");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0717");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, 100, 100, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0718");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, 1, (int) 'a', charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0719");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), (int) ' ', (int) (byte) -1, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0720");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) '#', 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0721");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, (int) (short) 10, (int) (byte) -1, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0722");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (short) -1, (int) (short) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0723");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (byte) 1, 0, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0724");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0725");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, (int) (short) 10, (int) (byte) 1, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0726");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0727");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 0, (int) '4', (int) (byte) 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0728");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) 1, (int) (byte) 100, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0729");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (short) 0, 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0730");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (-1), 100, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0731");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0732");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0733");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, 0, 0, '#', charSequence6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0734");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, 0, (int) (short) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0735");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (int) '4', (-1), (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0736");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (short) 100, 10, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0737");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, 0, (int) (byte) -1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0738");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0739");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (-1), (int) (short) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0740");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) (byte) 1, (int) (byte) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0741");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (short) 1, (int) (short) 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0742");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0743");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (byte) 0, (int) '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0744");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) (short) -1, (int) (short) 10, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0745");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, (int) (short) -1, (int) '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0746");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, 10, (int) (byte) 10, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0747");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) (short) -1, (int) 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0748");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (-1), (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0749");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0750");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) 'a', (int) (byte) -1, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0751");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0752");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) (short) 100, (int) (short) 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0753");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, 100, (int) '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0754");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, (-1), 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0755");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, (int) ' ', (-1), '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0756");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (byte) 10, (int) (short) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0757");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) '#', (int) (short) 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0758");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (-1), (int) (short) 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0759");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, (int) '#', (int) (byte) 10, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0760");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) (short) 10, 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0761");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0762");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (short) 100, (int) '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0763");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (int) (short) 100, (int) (short) 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0764");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (byte) 100, (int) (short) 1, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0765");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (byte) -1, 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0766");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, 100, (int) (short) -1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0767");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, 10, 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0768");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 0, (int) (short) 1, (int) 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0769");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) (byte) -1, (int) '#', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0770");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (short) 100, (int) (byte) 10, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0771");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) '4', (int) (byte) 10, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0772");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0773");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) (byte) 1, (int) (byte) 100, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0774");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', 0, (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0775");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (short) 1, (int) (byte) 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0776");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, 1, (int) '4', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0777");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, 0, 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0778");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), (int) (byte) 0, (int) (byte) 100, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0779");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (byte) 100, (int) '#', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0780");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, 0, (int) '#', ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0781");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) (short) 10, (int) (byte) 100, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0782");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), 100, (int) (byte) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0783");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) (byte) 0, (int) '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0784");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, 100, (int) (byte) 10, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0785");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (-1), (int) (short) 10, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0786");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, (int) (short) 1, (int) (byte) 1, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0787");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, 10, 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0788");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0789");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (short) 10, (int) (byte) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0790");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) -1, (int) (short) -1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0791");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0792");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (-1), (int) (short) 1, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0793");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0794");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0795");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (int) (byte) -1, (int) (short) 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0796");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) 100, (int) (short) 100, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0797");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0798");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) 0, (int) 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0799");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 1, (int) (byte) -1, (int) 'a', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0800");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) '#', 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0801");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, 0, (int) (byte) 10, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0802");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) (short) 100, (int) (short) 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0803");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', (int) ' ', 10, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0804");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (int) (byte) 0, (-1), (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0805");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0806");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (byte) -1, (int) (byte) 10, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0807");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (short) -1, (int) (byte) 100, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0808");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) (byte) 1, (int) (short) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0809");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, (int) (byte) 100, (int) ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0810");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, 0, (int) (byte) 100, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0811");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) (byte) 0, (int) (short) -1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0812");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) (short) 100, (int) (byte) 100, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0813");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) '4', (int) (short) 0, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0814");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, 10, (int) (short) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0815");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) (byte) 100, (int) (short) -1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0816");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) ' ', 0, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0817");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, 0, 10, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0818");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0819");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, 100, (int) (short) 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0820");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (byte) 10, 1, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0821");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) '4', (int) (byte) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0822");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) -1, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0823");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0824");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, (int) (short) 1, (int) (short) -1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0825");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) (short) 1, (int) (byte) -1, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0826");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0827");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, 10, 0, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0828");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', 1, (int) '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0829");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) (byte) -1, (int) '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0830");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), 0, 0, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0831");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, 100, (int) 'a', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0832");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (byte) 100, 0, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0833");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0834");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (byte) 0, (int) '4', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0835");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) 'a', 0, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0836");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0837");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0838");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) '#', (int) (byte) 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0839");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, 0, 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0840");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) (short) -1, (int) (byte) 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0841");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (int) '4', (int) ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0842");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (short) 10, (int) '#', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0843");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 0, (int) (byte) 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0844");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0845");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) ' ', (-1), 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0846");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) (byte) 10, (int) ' ', 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0847");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (short) 100, 1, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0848");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', 0, 1, ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0849");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) ' ', (int) ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0850");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0851");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) (byte) 10, (int) '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0852");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0853");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0854");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) (byte) 100, (int) '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0855");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, 0, (int) '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0856");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (-1), (int) (short) 0, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0857");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, 1, (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0858");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (byte) -1, (int) 'a', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0859");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) (byte) 0, (int) (short) 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0860");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0861");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, (int) '4', (int) (byte) 0, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0862");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', 10, (int) (byte) 1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0863");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0864");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) 10, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0865");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (byte) -1, (int) (byte) 100, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0866");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) ' ', (int) (byte) 0, (int) '4', 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0867");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (byte) 0, (-1), charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0868");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0869");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) (short) 0, (int) (short) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0870");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, 0, (-1), 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0871");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0872");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) 0, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0873");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0874");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, 0, 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0875");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (byte) 0, 100, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0876");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0877");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (byte) 0, (int) (short) 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0878");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) 1, (int) '4', ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0879");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) (byte) 0, (int) '#', 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0880");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, (int) '#', (int) (byte) 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0881");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, 1, (int) (short) 0, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0882");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0883");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) '#', (int) '4', 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0884");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0885");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) (byte) 0, (int) (short) 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0886");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) (short) 0, (int) ' ', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0887");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0888");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 1, (int) (short) 0, 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0889");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (byte) 1, (int) (short) -1, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0890");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, (-1), 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0891");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) -1, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0892");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) ' ', 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0893");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) '4', (int) (byte) 0, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0894");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, 1, (int) (short) 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0895");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, (-1), (int) (short) 10, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0896");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) ' ', (int) (short) 1, ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0897");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) (byte) 1, 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0898");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0899");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, 10, 1, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0900");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) (byte) 10, (int) '4', '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0901");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0902");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, 10, 10, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0903");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) (byte) 100, 1, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0904");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0905");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (-1), (int) (short) 10, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0906");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (int) (byte) -1, (-1), 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0907");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0908");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (int) '4', (int) (byte) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0909");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, 1, (int) (short) -1, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0910");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (int) (short) -1, 1, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0911");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', 1, (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0912");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (byte) 1, (int) (short) 10, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0913");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (int) (byte) 0, 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0914");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0915");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) ' ', (int) (byte) -1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0916");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0917");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (short) 0, (int) (short) -1, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0918");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, 0, 0, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0919");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0920");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0921");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) '#', (int) (byte) 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0922");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) (short) 0, 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0923");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) ' ', (int) (short) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0924");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), (int) (short) 1, 10, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0925");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) '#', (int) (byte) 0, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0926");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (byte) 100, (int) (byte) 10, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0927");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0928");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (short) 10, 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0929");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) (byte) 1, (int) (short) 1, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0930");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0931");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0932");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, 0, (int) '#', ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0933");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) (byte) 0, (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0934");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) '#', (int) (short) 100, charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0935");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', 0, (int) '4', '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0936");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) '#', 100, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0937");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, 100, (int) '4', 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0938");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) (byte) -1, (int) (short) 10, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0939");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, 100, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0940");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 0, (int) (byte) 10, (int) (short) 0, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0941");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0942");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) (short) 0, (int) 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0943");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (int) 'a', (int) '4', '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0944");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0945");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0946");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) '4', (int) (short) 1, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0947");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0948");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (-1), (int) (short) 0, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0949");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) 0, (int) '4', 100, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0950");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) '4', 100, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0951");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0952");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) (short) 1, (int) (short) 100, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0953");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, 100, (-1), '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0954");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) 1, (int) (short) 0, (int) (byte) 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0955");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (byte) -1, (int) (short) -1, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0956");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, (int) (byte) 1, (int) ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0957");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) 100, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0958");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) (byte) 1, (int) (short) 0, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0959");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, 10, (int) 'a', '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0960");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (-1), 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0961");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) (short) 10, 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0962");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) (short) -1, (int) (short) 0, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0963");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) (byte) -1, 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0964");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) ' ', (int) (byte) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0965");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (short) 100, 100, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0966");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (int) 'a', (int) (short) 10, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0967");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, 0, (int) '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0968");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, (int) (short) 1, (int) (short) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0969");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0970");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0971");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0972");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0973");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 10, (int) (short) 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0974");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (byte) 100, 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0975");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) '4', 0, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0976");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) (short) -1, (int) (short) 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0977");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, 100, 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0978");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 0, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0979");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (int) ' ', (int) '4', ' ', charSequence6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0980");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) (byte) 100, (int) (short) 1, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0981");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) (byte) 1, (int) 'a', ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0982");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0983");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) ' ', (int) (byte) 10, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0984");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (int) (byte) 100, (int) '4', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0985");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (short) 0, (int) '4', '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0986");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) (byte) 10, (int) (byte) 100, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0987");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (byte) 100, (int) (byte) -1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0988");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', 100, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0989");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) 'a', (int) ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0990");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (byte) 100, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0991");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) (byte) -1, (int) (byte) -1, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0992");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), 0, (int) (byte) 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0993");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (short) 1, (int) (short) 0, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0994");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) -1, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0995");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0996");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, 0, (int) (byte) 10, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0997");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) '4', (int) '4', 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0998");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test0999");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (byte) 100, (int) (short) 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.test1000");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

