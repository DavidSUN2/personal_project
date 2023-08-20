package FormattableUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FormattableUtils1 {

    public static boolean debug = false;

    @Test
    public void FormattableUtils0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0501");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) (byte) -1, (-1), '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0502");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, 0, (int) (byte) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0503");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, 10, (int) (byte) 10, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0504");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 100, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0505");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) 10, (int) '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0506");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) ' ', (int) '4', 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0507");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) (short) 0, 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0508");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, 10, 0, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0509");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) (byte) -1, (int) (short) 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0510");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) (byte) 1, (int) (short) -1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0511");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, (int) 'a', (int) (short) 0, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0512");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) (short) -1, (int) (byte) 0, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0513");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0514");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0515");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (short) 100, (int) (short) 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0516");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) 'a', (int) (short) 0, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0517");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 10, 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0518");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0519");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) 'a', (int) '#', '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0520");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) 100, (int) (short) 0, (int) (short) 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0521");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0522");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0523");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0524");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (int) 'a', (int) (byte) -1, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0525");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, (int) (byte) 100, (int) 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0526");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) (short) 0, (int) 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0527");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) '4', (int) (byte) -1, (int) ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0528");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), (int) '4', (int) (byte) 100, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0529");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 100, 10, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0530");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0531");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0532");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) 'a', (int) (short) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0533");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (byte) 10, (int) (byte) 10, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0534");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', 0, (int) '4', 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0535");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (byte) 100, (int) (short) 1, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0536");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (byte) -1, (int) (short) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0537");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) (byte) 10, (-1), '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0538");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (short) 1, (-1), '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0539");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0540");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) (short) 1, 10, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0541");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), 0, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0542");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), 1, (int) (byte) 100, charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0543");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 100, 10, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0544");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) (short) 0, (int) 'a', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0545");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 1, (int) (short) 100, (int) (byte) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0546");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), (int) (byte) -1, (int) '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0547");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', (int) (short) 100, (int) (byte) 100, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0548");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0549");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (short) 100, (int) (short) -1, '#', charSequence6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0550");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', (int) '#', (int) (short) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0551");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 100, (int) (byte) 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0552");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, 10, (int) '#', 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0553");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (int) ' ', 10, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0554");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) '#', 10, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0555");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) '4', 0, ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0556");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (-1), (int) (byte) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0557");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) (byte) 10, (int) (byte) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0558");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) (byte) 0, (int) (short) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0559");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0560");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 0, (int) (byte) 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0561");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, 0, (int) (short) 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0562");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, (int) (short) 0, (int) ' ', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0563");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) '#', (int) '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0564");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, 0, (int) '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0565");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0566");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0567");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) '4', (int) '4', ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0568");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0569");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0570");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) 'a', (int) 'a', 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0571");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (byte) 0, (int) '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0572");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', 1, (int) (byte) 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0573");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0574");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) 100, (int) (short) 0, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0575");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) (short) 1, (int) (short) 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0576");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) (short) 10, (int) 'a', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0577");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) (short) 1, 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0578");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0579");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 0, 1, (int) '#', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0580");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) 'a', 0, (int) (byte) -1, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0581");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, 0, (int) ' ', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0582");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', 0, (int) 'a', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0583");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) 10, (int) (byte) 1, (int) (short) 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0584");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (byte) 10, (int) (short) 0, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0585");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', 0, (int) (short) 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0586");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0587");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0588");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) -1, (int) 'a', (int) (short) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0589");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0590");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, 1, 10, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0591");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, (int) (short) 1, (int) (short) 0, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0592");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (short) -1, (int) (short) 0, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0593");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, 0, (int) (short) -1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0594");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (short) 1, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0595");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, 0, (int) (short) -1, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0596");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0597");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) '#', (-1), (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0598");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) '#', (int) (short) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0599");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) '4', (int) (short) -1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0600");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, 0, (int) (byte) 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0601");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (-1), 10, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0602");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (byte) 1, (int) (byte) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0603");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) (short) 100, 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0604");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (short) 100, (int) (short) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0605");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0606");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (int) 'a', (int) (short) -1, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0607");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0608");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, 1, (int) ' ', 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0609");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0610");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) '4', (int) 'a', ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0611");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) '4', (int) (byte) -1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0612");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) ' ', (int) (short) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0613");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) (byte) 1, (int) (short) 0, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0614");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, 100, (int) (byte) 10, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0615");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (byte) 0, (int) (short) 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0616");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, 100, (int) (short) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0617");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) (byte) 1, (int) (byte) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0618");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), (int) (byte) 100, (int) ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0619");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) (byte) 0, (int) ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0620");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) -1, 0, 1, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0621");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', 0, (int) (byte) 10, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0622");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0623");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) (byte) 0, (int) (short) -1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0624");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0625");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0626");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, 0, 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0627");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) -1, (-1), '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0628");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (short) 10, 10, ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0629");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) -1, 0, (-1), '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0630");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) (short) 0, (int) '4', '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0631");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0632");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0633");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 10, (int) (short) 100, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0634");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', 10, 10, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0635");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', 10, 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0636");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 100, (int) 'a', ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0637");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) 10, (int) (short) 0, (int) ' ', charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0638");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) ' ', (int) '#', 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0639");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0640");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0641");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, 0, (int) 'a', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0642");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, 0, 10, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0643");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, (int) (byte) 100, (int) (byte) 0, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0644");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, 0, (int) '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0645");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (int) (byte) 10, (int) ' ', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0646");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (-1), (int) 'a', ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0647");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (byte) 10, (int) (short) 100, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0648");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0649");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) (byte) 1, 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0650");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) 'a', (int) '4', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0651");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (short) 0, (int) (byte) 1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0652");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) (byte) -1, 10, ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0653");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', 10, 1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0654");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) (byte) 0, 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0655");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) 1, 10, (int) (byte) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0656");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0657");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, 10, (int) (short) 0, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0658");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (byte) 100, (-1), 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0659");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0660");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0661");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0662");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (short) 1, (int) '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0663");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0664");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0665");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, 10, (int) (byte) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0666");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0667");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) 'a', (int) (byte) 10, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0668");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, 10, (int) '#', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0669");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) (byte) 10, (int) 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0670");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (byte) 0, (int) '4', '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0671");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), 100, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0672");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) '4', 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0673");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 0, 10, (int) (byte) 0, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0674");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, 0, (-1), '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0675");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0676");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0677");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (byte) 0, (int) ' ', '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0678");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, (int) (byte) 100, (int) (byte) 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0679");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0680");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) (short) 1, (int) '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0681");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, (int) (short) 0, (int) (byte) 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0682");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0683");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, 100, (int) (byte) -1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0684");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, (int) 'a', 0, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0685");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, 0, (int) (byte) -1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0686");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, 10, (int) (short) 100, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0687");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) (byte) 100, 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0688");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, 10, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0689");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0690");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), (int) '4', 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0691");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) (short) -1, (int) (short) 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0692");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0693");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, 100, 1, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0694");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (short) 0, 10, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0695");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (byte) 0, 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0696");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) 'a', 10, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0697");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) '4', (int) (short) 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0698");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) '4', 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0699");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, (int) (byte) 0, (int) '4', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0700");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0701");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (-1), (int) (byte) 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0702");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0703");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0704");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) 'a', (int) (byte) 1, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0705");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 100, (int) (byte) 1, (-1), charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0706");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0707");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (short) 0, (int) '4', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0708");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', 10, (int) (short) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0709");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, 0, (int) (byte) 100, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0710");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) 100, (int) (byte) 100, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0711");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (-1), (int) (short) 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0712");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) (byte) 0, (int) ' ', ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0713");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', 10, (int) (byte) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0714");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0715");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, 1, (int) (byte) 0, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0716");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0717");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, 100, 100, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0718");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, 1, (int) 'a', charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0719");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), (int) ' ', (int) (byte) -1, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0720");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) '#', 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0721");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, (int) (short) 10, (int) (byte) -1, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0722");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (short) -1, (int) (short) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0723");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (byte) 1, 0, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0724");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0725");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, (int) (short) 10, (int) (byte) 1, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0726");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0727");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 0, (int) '4', (int) (byte) 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0728");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) 1, (int) (byte) 100, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0729");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (short) 0, 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0730");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (-1), 100, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0731");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0732");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0733");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, 0, 0, '#', charSequence6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0734");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, 0, (int) (short) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0735");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (int) '4', (-1), (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0736");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (short) 100, 10, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0737");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, 0, (int) (byte) -1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0738");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0739");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (-1), (int) (short) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0740");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) (byte) 1, (int) (byte) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0741");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (short) 1, (int) (short) 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0742");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0743");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (byte) 0, (int) '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0744");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) (short) -1, (int) (short) 10, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0745");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, (int) (short) -1, (int) '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0746");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, 10, (int) (byte) 10, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0747");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) (short) -1, (int) 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0748");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (-1), (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0749");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0750");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) 'a', (int) (byte) -1, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0751");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0752");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) (short) 100, (int) (short) 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0753");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, 100, (int) '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0754");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, (-1), 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0755");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, (int) ' ', (-1), '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0756");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (byte) 10, (int) (short) 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0757");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) '#', (int) (short) 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0758");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (-1), (int) (short) 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0759");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, (int) '#', (int) (byte) 10, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0760");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) (short) 10, 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0761");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0762");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (short) 100, (int) '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0763");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (int) (short) 100, (int) (short) 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0764");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (byte) 100, (int) (short) 1, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0765");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (byte) -1, 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0766");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, 100, (int) (short) -1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0767");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, 10, 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0768");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 0, (int) (short) 1, (int) 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0769");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) (byte) -1, (int) '#', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0770");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (short) 100, (int) (byte) 10, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0771");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) '4', (int) (byte) 10, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0772");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0773");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) (byte) 1, (int) (byte) 100, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0774");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', 0, (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0775");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (short) 1, (int) (byte) 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0776");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, 1, (int) '4', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0777");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, 0, 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0778");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), (int) (byte) 0, (int) (byte) 100, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0779");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (byte) 100, (int) '#', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0780");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, 0, (int) '#', ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0781");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) (short) 10, (int) (byte) 100, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0782");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), 100, (int) (byte) 0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0783");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) (byte) 0, (int) '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0784");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, 100, (int) (byte) 10, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0785");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (-1), (int) (short) 10, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0786");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, (int) (short) 1, (int) (byte) 1, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0787");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, 10, 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0788");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0789");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (short) 10, (int) (byte) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0790");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) -1, (int) (short) -1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0791");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0792");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (-1), (int) (short) 1, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0793");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0794");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0795");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (int) (byte) -1, (int) (short) 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0796");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) 100, (int) (short) 100, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0797");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0798");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (byte) 0, (int) 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0799");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 1, (int) (byte) -1, (int) 'a', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0800");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) '#', 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0801");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, 0, (int) (byte) 10, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0802");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) (short) 100, (int) (short) 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0803");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', (int) ' ', 10, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0804");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (int) (byte) 0, (-1), (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0805");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0806");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (byte) -1, (int) (byte) 10, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0807");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (short) -1, (int) (byte) 100, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0808");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) (byte) 1, (int) (short) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0809");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, (int) (byte) 100, (int) ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0810");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, 0, (int) (byte) 100, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0811");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) (byte) 0, (int) (short) -1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0812");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) (short) 100, (int) (byte) 100, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0813");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) '4', (int) (short) 0, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0814");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, 10, (int) (short) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0815");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) (byte) 100, (int) (short) -1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0816");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) ' ', 0, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0817");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, 0, 10, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0818");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0819");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, 100, (int) (short) 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0820");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (byte) 10, 1, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0821");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) '4', (int) (byte) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0822");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) -1, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0823");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) -1, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0824");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 1, (int) (short) 1, (int) (short) -1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0825");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) (short) 1, (int) (byte) -1, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0826");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0827");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, 10, 0, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0828");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', 1, (int) '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0829");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) (byte) -1, (int) '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0830");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), 0, 0, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0831");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, 100, (int) 'a', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0832");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) (byte) 100, 0, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0833");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0834");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (byte) 0, (int) '4', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0835");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) 'a', 0, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0836");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0837");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0838");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) '#', (int) (byte) 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0839");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, 0, 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0840");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) (short) -1, (int) (byte) 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0841");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (int) '4', (int) ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0842");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (short) 10, (int) '#', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0843");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 0, (int) (byte) 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0844");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0845");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) ' ', (-1), 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0846");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) (byte) 10, (int) ' ', 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0847");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (short) 100, 1, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0848");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', 0, 1, ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0849");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) ' ', (int) ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0850");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0851");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) (byte) 10, (int) '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0852");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0853");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0854");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) (byte) 100, (int) '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0855");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, 0, (int) '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0856");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (-1), (int) (short) 0, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0857");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, 1, (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0858");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (byte) -1, (int) 'a', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0859");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) (byte) 0, (int) (short) 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0860");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0861");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, (int) '4', (int) (byte) 0, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0862");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', 10, (int) (byte) 1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0863");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0864");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) 10, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0865");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (byte) -1, (int) (byte) 100, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0866");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) ' ', (int) (byte) 0, (int) '4', 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0867");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (byte) 0, (-1), charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0868");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0869");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) (short) 0, (int) (short) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0870");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, 0, (-1), 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0871");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0872");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) 0, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0873");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0874");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, 0, 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0875");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (byte) 0, 100, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0876");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0877");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (byte) 0, (int) (short) 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0878");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (byte) 1, (int) '4', ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0879");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) -1, (int) (byte) 0, (int) '#', 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0880");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, (int) '#', (int) (byte) 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0881");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, 1, (int) (short) 0, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0882");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0883");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) '#', (int) '4', 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0884");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0885");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) (byte) 0, (int) (short) 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0886");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) (short) 0, (int) ' ', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0887");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0888");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 1, (int) (short) 0, 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0889");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (byte) 1, (int) (short) -1, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0890");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, (-1), 100, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0891");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) -1, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0892");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) ' ', 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0893");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) '4', (int) (byte) 0, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0894");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, 1, (int) (short) 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0895");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, (-1), (int) (short) 10, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0896");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) ' ', (int) (short) 1, ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0897");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) (byte) 1, 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0898");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0899");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, 10, 1, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0900");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) (byte) 10, (int) '4', '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0901");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0902");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, 10, 10, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0903");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) (byte) 100, 1, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0904");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0905");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (-1), (int) (short) 10, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0906");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (int) (byte) -1, (-1), 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0907");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0908");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (int) '4', (int) (byte) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0909");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, 1, (int) (short) -1, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0910");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (int) (short) -1, 1, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0911");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', 1, (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0912");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 10, (int) (byte) 1, (int) (short) 10, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0913");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (int) (byte) 0, 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0914");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0915");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) ' ', (int) (byte) -1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0916");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0917");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (short) 0, (int) (short) -1, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0918");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 100, 0, 0, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0919");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0920");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0921");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) '#', (int) (byte) 1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0922");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) (short) 0, 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0923");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) ' ', (int) (short) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0924");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (-1), (int) (short) 1, 10, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0925");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 10, (int) '#', (int) (byte) 0, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0926");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (byte) 100, (int) (byte) 10, '4', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0927");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0928");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (short) 10, 0, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0929");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) (byte) 1, (int) (short) 1, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0930");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (-1), (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0931");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0932");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, 0, (int) '#', ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0933");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) (byte) 0, (int) (byte) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0934");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) '#', (int) (short) 100, charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0935");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', 0, (int) '4', '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0936");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', (int) '#', 100, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0937");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, 100, (int) '4', 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0938");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) (byte) -1, (int) (short) 10, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0939");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, 100, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0940");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 0, (int) (byte) 10, (int) (short) 0, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0941");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0942");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) -1, (int) (short) 0, (int) 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0943");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (int) 'a', (int) '4', '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0944");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '#', (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0945");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0946");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) '4', (int) (short) 1, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0947");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0948");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (-1), (int) (short) 0, 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0949");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) 0, (int) '4', 100, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0950");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) '4', 100, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0951");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) ' ', (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0952");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) (short) 1, (int) (short) 100, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0953");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 100, 100, (-1), '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0954");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) 1, (int) (short) 0, (int) (byte) 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0955");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, (int) (byte) -1, (int) (short) -1, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0956");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 0, (int) (byte) 1, (int) ' ', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0957");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (short) 100, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0958");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 100, (int) (byte) 1, (int) (short) 0, '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0959");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, 10, (int) 'a', '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0960");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (-1), 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0961");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) (short) 10, 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0962");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) (short) -1, (int) (short) 0, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0963");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) (byte) -1, 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0964");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) ' ', (int) (byte) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0965");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (short) 100, 100, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0966");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (int) 'a', (int) (short) 10, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0967");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, 0, (int) '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0968");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, (int) (short) 1, (int) (short) -1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0969");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 10, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0970");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0971");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0972");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 0, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0973");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) (short) 10, (int) (short) 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0974");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (byte) 100, 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0975");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) '4', 0, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0976");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) (short) -1, (int) (short) 0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0977");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, 100, 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0978");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 0, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0979");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, (int) ' ', (int) '4', ' ', charSequence6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0980");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 0, (int) (byte) 100, (int) (short) 1, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0981");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) (byte) 1, (int) 'a', ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0982");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0983");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) ' ', (int) (byte) 10, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0984");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (int) (byte) 100, (int) '4', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0985");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (short) 0, (int) '4', '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0986");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) (byte) 10, (int) (byte) 100, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0987");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (byte) 100, (int) (byte) -1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0988");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', 100, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0989");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 100, (int) 'a', (int) ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0990");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 100, (int) (byte) 100, 0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0991");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) (byte) -1, (int) (byte) -1, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0992");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), 0, (int) (byte) 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0993");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) (short) 1, (int) (short) 0, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0994");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, (int) (byte) -1, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0995");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0996");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, 0, (int) (byte) 10, '#', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0997");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', (int) '4', (int) '4', 'a', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0998");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils0999");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (byte) 100, (int) (short) 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils1.FormattableUtils1000");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 1, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

