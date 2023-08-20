package FormattableUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FormattableUtils2 {

    public static boolean debug = false;

    @Test
    public void FormattableUtils1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1001");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1002");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) '#', (-1), '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1003");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) (short) -1, (int) (byte) -1, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1004");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (byte) -1, (int) (short) 10, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1005");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) (short) 0, (int) '4', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1006");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 10, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1007");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) (byte) -1, (int) (byte) 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1008");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) -1, (int) (short) 1, (int) (byte) 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1009");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1010");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (short) 1, 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1011");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, 1, (-1), (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1012");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 10, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1013");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (int) (short) 100, 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1014");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, 100, (int) (byte) 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1015");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) 'a', (int) (byte) -1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1016");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, 0, (int) '4', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1017");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', 0, (int) (byte) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1018");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 0, 100, (int) (byte) -1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1019");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) '4', (int) ' ', 0, '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1020");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, 10, (int) (short) 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1021");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, 0, 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1022");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', 0, 0, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1023");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 100, 10, (int) (short) 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1024");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 100, (int) 'a', (int) ' ', '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1025");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1026");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 1, (int) 'a', (int) '#', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1027");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 10, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1028");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, 1, (int) (byte) 10, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1029");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1030");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) ' ', 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1031");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '#', 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1032");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) (byte) 10, 0, ' ', charSequence6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1033");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 1, 0, (int) (byte) 100, '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1034");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', 10, 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1035");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) -1, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1036");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (-1), (int) 'a', '#', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1037");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '4', (int) (short) 10, (int) (short) 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1038");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) ' ', (int) '4', (int) (short) 0, 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1039");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, (int) (short) 1, (int) 'a', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1040");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', (int) (byte) 1, (int) (short) 0, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1041");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (-1), 10, ' ', charSequence6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1042");
        java.util.Formatter formatter1 = null;
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) 'a', 0, (int) ' ', charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1043");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) (byte) 100, (int) (byte) 10, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1044");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, (int) (byte) 100, (int) (byte) 100, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1045");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 1, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1046");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) 1, (int) 'a', (int) '#', '4', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1047");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 100, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1048");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) '4', (int) '4', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1049");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) '4', (int) (byte) 0, ' ', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1050");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (-1), (int) ' ', 100, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1051");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) 'a', 10, 100, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1052");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 1, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1053");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) '#', (int) (short) 100, (int) (short) 1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1054");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1055");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, 100, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1056");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (short) 0, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1057");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (short) 1, (int) (byte) 100, (int) (short) 1, '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1058");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 0, (int) 'a', 1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1059");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (short) 0, (int) ' ', (int) (short) 1, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1060");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1061");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, 10, (int) (short) 1, (int) (short) 10, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1062");
        java.lang.CharSequence charSequence0 = null;
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append(charSequence0, formatter1, 100, 0, (int) (short) 0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1063");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "", formatter1, (int) (byte) 10, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1064");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, (int) '4', (int) (short) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'hi!' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1065");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) (byte) 1, (int) (short) 100, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1066");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) '4', (int) (byte) -1, (int) (byte) 1, ' ', (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1067");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 10, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1068");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter6 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) (byte) 1, (int) (short) 1, 1, (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1069");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter5 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, (int) 'a', (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1070");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "hi!", formatter1, (int) (byte) -1, 10, (int) '4', '#', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void FormattableUtils1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FormattableUtils2.FormattableUtils1071");
        java.util.Formatter formatter1 = null;
        // The following exception was thrown during execution in FormattableUtils generation
        try {
            java.util.Formatter formatter7 = org.apache.commons.lang3.text.FormattableUtils.append((java.lang.CharSequence) "null", formatter1, 0, 0, 1, 'a', (java.lang.CharSequence) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified ellipsis 'null' exceeds precision of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

