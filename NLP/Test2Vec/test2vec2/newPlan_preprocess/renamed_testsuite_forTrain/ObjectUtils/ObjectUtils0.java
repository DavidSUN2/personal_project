
package ObjectUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ObjectUtils0 {

    public static boolean debug = false;

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0001");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0002");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (byte) 1, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0003");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0004");
        java.io.Serializable serializable1 = org.apache.commons.lang3.ObjectUtils.CONST((java.io.Serializable) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + (-1L) + "'", serializable1.equals((-1L)));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0005");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) 100L, (java.lang.Object) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0006");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString(obj0, "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0007");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0008");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0009");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 100 + "'", byte1 == (byte) 100);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0010");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0011");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0012");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0013");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0014");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0015");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0016");
        boolean boolean1 = org.apache.commons.lang3.ObjectUtils.CONST(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0017");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0018");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0019");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 100L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0020");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("1", "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-55) + "'", int3 == (-55));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0021");
        java.io.Serializable serializable1 = org.apache.commons.lang3.ObjectUtils.clone((java.io.Serializable) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0022");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0023");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0024");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString(obj0, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0025");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0026");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0027");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, (-1), (-1L), 100.0f };
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray4);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) int5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-306834496) + "'", int5 == (-306834496));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0028");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0029");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0030");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 1.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0031");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0032");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 10 + "'", short1 == (short) 10);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0033");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0034");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0035");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (short) 1, "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0036");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 100);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0037");
        java.lang.Object obj0 = null;
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0038");
        char char1 = org.apache.commons.lang3.ObjectUtils.CONST('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0039");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0040");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0041");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 100 + "'", short1 == (short) 100);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0042");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0043");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 10 + "'", byte1 == (byte) 10);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0044");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.clone("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0045");
        char char1 = org.apache.commons.lang3.ObjectUtils.CONST('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1 == '4');
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0046");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.median(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.median(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0047");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0048");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 100 + "'", short1 == (short) 100);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0049");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0050");
        java.lang.Appendable appendable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, (-1), (-1L), 100.0f };
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray5);
        int int7 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-306834496) + "'", int6 == (-306834496));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-306834496) + "'", int7 == (-306834496));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0051");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0052");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("1", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0053");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0054");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0055");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) 1.0f, (java.lang.Object) 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0056");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0057");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, (-1), (-1L), 100.0f };
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray5);
        int int7 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-306834496) + "'", int6 == (-306834496));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-306834496) + "'", int7 == (-306834496));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0058");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.median(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0059");
        java.lang.Appendable appendable0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0060");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST(1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0061");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.clone(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.median(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0062");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.Class<?> wildcardClass2 = objArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ObjectUtils.clone(wildcardClass2);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.reflect.Type) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0063");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0064");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) objectUtils1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0065");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0066");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 10L, (java.lang.Object) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0067");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0068");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0069");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.clone(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0070");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0071");
        char char1 = org.apache.commons.lang3.ObjectUtils.CONST(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0072");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0073");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0074");
        boolean boolean1 = org.apache.commons.lang3.ObjectUtils.CONST(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0075");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST(10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0076");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Comparable<java.lang.String>) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0077");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.clone(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.median(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0078");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull("1", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0079");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) str5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0080");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) 97L, (java.lang.Object) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0081");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0082");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-3), (java.lang.Object) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0083");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) 'a', (java.lang.Object) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0084");
        java.lang.Appendable appendable0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0085");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.CONST("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0086");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0087");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) (byte) 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0088");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.clone(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0089");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0090");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0091");
        char char1 = org.apache.commons.lang3.ObjectUtils.CONST('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '#' + "'", char1 == '#');
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0092");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0093");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0094");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0095");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0096");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0097");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 10 + "'", byte1 == (byte) 10);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0098");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) 0L, obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0099");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0100");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0101");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (-306834496), (java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0102");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "" + "'", charSequence1.equals(""));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0103");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0104");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0105");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0106");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("1", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-55) + "'", int2 == (-55));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0107");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) "1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0108");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 3201202);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0109");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0110");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.median(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.max(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0111");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) wildcardClass1, (java.lang.Object) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0112");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0113");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((-3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -3 + "'", short1 == (short) -3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0114");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.median(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0115");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0116");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0117");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) '4', (java.lang.Object) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0118");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString(obj0, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0119");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.median(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.min(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0120");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("", "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0121");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 55 + "'", byte1 == (byte) 55);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0122");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0123");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 55 + "'", byte1 == (byte) 55);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0124");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0125");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 1.0d, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0126");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0127");
        java.io.Serializable serializable0 = null;
        java.io.Serializable serializable1 = org.apache.commons.lang3.ObjectUtils.clone(serializable0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0128");
        java.lang.Appendable appendable0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray1.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(wildcardClass3, wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0129");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.max(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0130");
        java.io.Serializable serializable1 = org.apache.commons.lang3.ObjectUtils.CONST((java.io.Serializable) (-3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + (-3) + "'", serializable1.equals((-3)));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0131");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 52 + "'", short1 == (short) 52);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0132");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0133");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) "1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0134");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0135");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0136");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        int int4 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) strArray2, "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3201202 + "'", int4 == 3201202);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0137");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0138");
        java.lang.Object obj0 = null;
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0139");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0140");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0141");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("", "1.0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0142");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) null2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0143");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.ObjectUtils.clone(wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 1, (java.lang.Object) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0144");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 97L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0145");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0146");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("1", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0147");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 100 + "'", short1 == (short) 100);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0148");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0149");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0150");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST(100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0151");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("1", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0152");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, (-1), (-1L), 100.0f };
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-306834496) + "'", int6 == (-306834496));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0153");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0154");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0155");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 35.0d, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "35.0" + "'", str2.equals("35.0"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0156");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("1", "1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0157");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0158");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0159");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0160");
        java.io.Serializable serializable1 = org.apache.commons.lang3.ObjectUtils.CONST((java.io.Serializable) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + 97.0f + "'", serializable1.equals(97.0f));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0161");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray7);
        int int9 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1119249155 + "'", int9 == 1119249155);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0162");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0163");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0164");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0165");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0166");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString(obj0, "1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0167");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, (-1), (-1L), 100.0f };
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray4);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.Object[] objArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray6);
        boolean boolean8 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) int5, (java.lang.Object) objArray7);
        int int9 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-306834496) + "'", int5 == (-306834496));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0168");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0169");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("1", "class java.lang.Object", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-50) + "'", int3 == (-50));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0170");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0171");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.clone(strArray6);
        int int9 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1119249155 + "'", int9 == 1119249155);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0172");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 1119249155);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0173");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.0" + "'", str1.equals("1.0"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0174");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0175");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-50));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-50L) + "'", long1 == (-50L));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0176");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "35.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0177");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) strArray7);
        int int9 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1119249155 + "'", int9 == 1119249155);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0178");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0179");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0180");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0181");
        java.lang.Appendable appendable0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0182");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.clone(null1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) null1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(null3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0183");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 3201202);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3201202L + "'", long1 == 3201202L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0184");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-2138784939));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2138784939) + "'", int1 == (-2138784939));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0185");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray1.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(wildcardClass3, wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0186");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0187");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Object[] objArray3 = org.apache.commons.lang3.ObjectUtils.clone(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0188");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "1", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0189");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0190");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0191");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "hi!" + "'", charSequence1.equals("hi!"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0192");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) str5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0193");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0194");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) "35.0");
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0195");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray7 = new org.apache.commons.lang3.ObjectUtils.Null[][] {};
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(nullArray5, nullArray7);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) nullArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0196");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0197");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) "35.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0198");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0199");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0200");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((-55));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -55 + "'", byte1 == (byte) -55);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0201");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0202");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST(1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0203");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-5), (java.lang.Object) (byte) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0204");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0205");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0206");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("0", "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-51) + "'", int2 == (-51));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0207");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) 1119249155, (java.lang.Object) 3201202L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0208");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1, null2, null3 };
        org.apache.commons.lang3.ObjectUtils.Null null5 = org.apache.commons.lang3.ObjectUtils.mode(nullArray4);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) nullArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) str6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0209");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.clone("35.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0210");
        java.lang.String[] strArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.max(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0211");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.min(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0212");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 52 + "'", short1 == (short) 52);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0213");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0214");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0215");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 100 + "'", byte1 == (byte) 100);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0216");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 2118744065);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2118744065" + "'", str1.equals("2118744065"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0217");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) "35.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0218");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.ObjectUtils.clone((java.io.Serializable) str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0219");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0220");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0221");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 55 + "'", short1 == (short) 55);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0222");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.Class<?> wildcardClass2 = objArray1.getClass();
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) wildcardClass2, (java.lang.Object) 0);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0223");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.Class<?> wildcardClass2 = objArray0.getClass();
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null5 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = new org.apache.commons.lang3.ObjectUtils.Null[] { null3, null4, null5 };
        org.apache.commons.lang3.ObjectUtils.Null null7 = org.apache.commons.lang3.ObjectUtils.mode(nullArray6);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray8 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray6);
        boolean boolean9 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) wildcardClass2, (java.lang.Object) nullArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0224");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "2118744065", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0225");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.Class<?> wildcardClass2 = objArray1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ObjectUtils.clone(wildcardClass2);
        org.apache.commons.lang3.ObjectUtils objectUtils4 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils5 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils6 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray7 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils4, objectUtils5, objectUtils6 };
        org.apache.commons.lang3.ObjectUtils objectUtils8 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray7);
        boolean boolean9 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) wildcardClass3, (java.lang.Object) objectUtilsArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0226");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 97 + "'", byte1 == (byte) 97);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0227");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray7 = new org.apache.commons.lang3.ObjectUtils.Null[][] {};
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(nullArray5, nullArray7);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray9 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0228");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.max(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0229");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) (short) 55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0230");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("35.0", "class java.lang.Object", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-48) + "'", int3 == (-48));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0231");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-5));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0232");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0233");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0234");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(3201202);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3201202 + "'", int1 == 3201202);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0235");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 2118744065);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0236");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 10 + "'", short1 == (short) 10);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0237");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        java.lang.Class<?> wildcardClass5 = null2.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.reflect.AnnotatedElement) wildcardClass5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0238");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 10 + "'", short1 == (short) 10);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0239");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0240");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.clone(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.max(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0241");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0242");
        java.lang.Appendable appendable0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray4);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0243");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0244");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0245");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("", "1.0", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0246");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, (-1), (-1L), 100.0f };
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray4);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray4);
        java.lang.Class<?> wildcardClass7 = objArray4.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement8 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.reflect.AnnotatedElement) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-306834496) + "'", int5 == (-306834496));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-306834496) + "'", int6 == (-306834496));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0247");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0248");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.0d + "'", double1 == 49.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0249");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.io.Serializable serializable4 = org.apache.commons.lang3.ObjectUtils.mode((java.io.Serializable[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0250");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 52 + "'", byte1 == (byte) 52);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0251");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 10.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0252");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) objectUtils0, (java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass3 = objectUtils0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass5);
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.reflect.GenericDeclaration) wildcardClass3, (java.lang.reflect.GenericDeclaration) wildcardClass5);
        java.io.Serializable serializable8 = org.apache.commons.lang3.ObjectUtils.clone((java.io.Serializable) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "class java.lang.Object" + "'", str6.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0253");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 50 + "'", byte1 == (byte) 50);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0254");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-48), (java.lang.Object) (short) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0255");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        boolean boolean6 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) strArray3, (java.lang.Object) "1.0");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0256");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) "35.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0257");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.Class<?> wildcardClass2 = objArray0.getClass();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.Object[] objArray4 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray3);
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(wildcardClass2, wildcardClass5);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) wildcardClass2);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0258");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, (-1), (-1L), 100.0f };
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray4);
        java.lang.Class<?> wildcardClass6 = objArray4.getClass();
        boolean boolean8 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) objArray4, (java.lang.Object) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-306834496) + "'", int5 == (-306834496));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0259");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 52 + "'", byte1 == (byte) 52);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0260");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 52 + "'", short1 == (short) 52);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0261");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 55 + "'", short1 == (short) 55);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0262");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) objectUtils1, (java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass4 = objectUtils1.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass6);
        java.lang.reflect.GenericDeclaration genericDeclaration8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.reflect.GenericDeclaration) wildcardClass4, (java.lang.reflect.GenericDeclaration) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) genericDeclaration8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "class java.lang.Object" + "'", str7.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0263");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0264");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray6);
        java.lang.Object[] objArray9 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0265");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0266");
        java.lang.Appendable appendable0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0267");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0268");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-51));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-51.0d) + "'", double1 == (-51.0d));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0269");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 1464371706);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.46437171E9f + "'", float1 == 1.46437171E9f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0270");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0271");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (short) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "55" + "'", str1.equals("55"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0272");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0273");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 97 + "'", byte1 == (byte) 97);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0274");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("0", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0275");
        java.lang.Object[] objArray0 = null;
        int int1 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0276");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 1L, obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0277");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) "1", (java.lang.Object) (-50));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0278");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Comparable<java.lang.String>) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "0" + "'", strComparable1.equals("0"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0279");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 100 + "'", byte1 == (byte) 100);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0280");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) strArray2, (java.lang.Object) "1.0");
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.io.Serializable serializable7 = org.apache.commons.lang3.ObjectUtils.CONST((java.io.Serializable) strArray2);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.ObjectUtils.mode((java.lang.CharSequence[]) strArray2);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "class java.lang.Object" + "'", str6.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0281");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 100 + "'", byte1 == (byte) 100);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0282");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0283");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0284");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 35 + "'", byte1 == (byte) 35);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0285");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Comparable<java.lang.String>) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "" + "'", strComparable1.equals(""));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0286");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 97 + "'", short1 == (short) 97);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0287");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) strArray2, (java.lang.Object) "1.0");
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.io.Serializable serializable7 = org.apache.commons.lang3.ObjectUtils.CONST((java.io.Serializable) strArray2);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "class java.lang.Object" + "'", str6.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "class java.lang.Object" + "'", str9.equals("class java.lang.Object"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0288");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.Class<?> wildcardClass2 = objArray0.getClass();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.Object[] objArray4 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray3);
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(wildcardClass2, wildcardClass5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.reflect.AnnotatedElement) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.ObjectUtils.clone(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0289");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[] { null2 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray6 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray5 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray6);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray8 = org.apache.commons.lang3.ObjectUtils.mode(nullArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) nullArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0290");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0291");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "55", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 51 + "'", int3 == 51);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0292");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("", "2118744065", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0293");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElementArray1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0294");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0295");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0296");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0297");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "1.0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0298");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0299");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 35 + "'", byte1 == (byte) 35);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0300");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-51));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-51.0f) + "'", float1 == (-51.0f));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0301");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0302");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("", "1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0303");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) (short) 97);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0304");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) strArray2);
        boolean boolean6 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) str4, (java.lang.Object) 1119249155);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0305");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(1119249155);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1119249155 + "'", int1 == 1119249155);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0306");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray1.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(wildcardClass3, wildcardClass6);
        java.lang.reflect.AnnotatedElement annotatedElement8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.reflect.AnnotatedElement) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0307");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 1.46437171E9f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.464371712E9d + "'", double1 == 1.464371712E9d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0308");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0309");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (-2138784939), (java.lang.Object) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0310");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("35.0", "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-48) + "'", int2 == (-48));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0311");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "2118744065", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0312");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (-306834496), (java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(wildcardClass3);
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.reflect.GenericDeclaration) wildcardClass6);
        boolean boolean8 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 50, (java.lang.Object) genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0313");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-50));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-50.0d) + "'", double1 == (-50.0d));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0314");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 100 + "'", short1 == (short) 100);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0315");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0316");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.median(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0317");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.Object obj6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Object) strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.toString(obj6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.identityToString(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0318");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (byte) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 55 + "'", int1 == 55);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0319");
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.Comparable<java.lang.String>) "class java.lang.Object", (java.lang.Comparable<java.lang.String>) "1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + "class java.lang.Object" + "'", strComparable2.equals("class java.lang.Object"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0320");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.median(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0321");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("", "2118744065");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0322");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-2138784939));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.138784939E9d) + "'", double1 == (-2.138784939E9d));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0323");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("35.0", "0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0324");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0325");
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        java.lang.Class<?> wildcardClass5 = null2.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type type7 = org.apache.commons.lang3.ObjectUtils.mode(typeArray6);
        boolean boolean8 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 5, (java.lang.Object) typeArray6);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "true" + "'", str9.equals("true"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0326");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 35.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0327");
        java.lang.Object obj2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.Object) (byte) -1, (java.lang.Object) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (byte) -1 + "'", obj2.equals((byte) -1));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0328");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 10 + "'", short1 == (short) 10);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0329");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) false, (java.lang.Object) 2118744065);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0330");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.median(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated array is empty");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0331");
        java.lang.Object obj1 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Object) (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj1 + "' != '" + (byte) 97 + "'", obj1.equals((byte) 97));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0332");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 49.0f + "'", float1 == 49.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0333");
        java.lang.reflect.Type[] typeArray0 = null;
        java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0334");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0335");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST(52L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0336");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.Object obj6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Object) strArray3);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0337");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 31 + "'", short1 == (short) 31);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0338");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (-306834496), (java.lang.Object) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) (-306834496));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0339");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0340");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) objectUtils5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0341");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) (short) 52);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0342");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0343");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0344");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 100.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0345");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.io.Serializable serializable7 = org.apache.commons.lang3.ObjectUtils.mode((java.io.Serializable[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + "1" + "'", serializable7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0346");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray2 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1 };
        org.apache.commons.lang3.ObjectUtils objectUtils3 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray2);
        org.apache.commons.lang3.ObjectUtils objectUtils4 = new org.apache.commons.lang3.ObjectUtils();
        boolean boolean6 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) objectUtils4, (java.lang.Object) (byte) 10);
        org.apache.commons.lang3.ObjectUtils objectUtils7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtils4);
        org.apache.commons.lang3.ObjectUtils objectUtils8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(objectUtils3, objectUtils7);
        org.apache.commons.lang3.ObjectUtils objectUtils9 = org.apache.commons.lang3.ObjectUtils.CONST(objectUtils7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0347");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (byte) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0348");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0349");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0350");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtilsArray4);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) objectUtilsArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) str8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0351");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 97 + "'", short1 == (short) 97);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0352");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (-306834496), (java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0353");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) (byte) 10);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0354");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) "2118744065", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2118744065" + "'", str2.equals("2118744065"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0355");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 3201202L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3201202.0f + "'", float1 == 3201202.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0356");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (byte) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0357");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0358");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class [Ljava.lang.Object;", "1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0359");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("55", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0360");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0361");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 51L + "'", long1 == 51L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0362");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtils0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectUtils1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0363");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 1.464371712E9d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.464371712E9" + "'", str1.equals("1.464371712E9"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0364");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST(49.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 49.0f + "'", float1 == 49.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0365");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-3.0f) + "'", float1 == (-3.0f));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0366");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0367");
        // The following exception was thrown during execution in test generation
        try {
            byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(2118744065);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -128 and 127: [2118744065]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0368");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) strArray2, (java.lang.Object) "1.0");
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "class java.lang.Object" + "'", str6.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "class java.lang.Object" + "'", str7.equals("class java.lang.Object"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0369");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.io.Serializable serializable7 = org.apache.commons.lang3.ObjectUtils.mode((java.io.Serializable[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + "1" + "'", serializable7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0370");
        java.io.Serializable serializable1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.io.Serializable) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + true + "'", serializable1.equals(true));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0371");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 1464371706);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.464371706E9d + "'", double1 == 1.464371706E9d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0372");
        java.lang.String[] strArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.min(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0373");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) -3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -3 + "'", short1 == (short) -3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0374");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray7 = new org.apache.commons.lang3.ObjectUtils.Null[][] {};
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(nullArray5, nullArray7);
        java.lang.Object obj9 = org.apache.commons.lang3.ObjectUtils.mode((java.lang.Object[]) nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0375");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.io.Serializable serializable7 = org.apache.commons.lang3.ObjectUtils.mode((java.io.Serializable[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + "1" + "'", serializable7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0376");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0377");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 3201202.0f, "35.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3201202.0" + "'", str2.equals("3201202.0"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0378");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.CONST(null0);
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils4 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray5 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils2, objectUtils3, objectUtils4 };
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray5);
        org.apache.commons.lang3.ObjectUtils objectUtils7 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray5);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtilsArray5);
        boolean boolean9 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) null1, (java.lang.Object) objectUtilsArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0379");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) strArray2, (java.lang.Object) "1.0");
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "class java.lang.Object" + "'", str6.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0380");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1, null2, null3 };
        org.apache.commons.lang3.ObjectUtils.Null null5 = org.apache.commons.lang3.ObjectUtils.mode(nullArray4);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) null5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) str6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0381");
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(474113137);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [474113137]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0382");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) objectUtilsArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0383");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0384");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("true", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0385");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1, null2, null3 };
        org.apache.commons.lang3.ObjectUtils.Null null5 = org.apache.commons.lang3.ObjectUtils.mode(nullArray4);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray4);
        org.apache.commons.lang3.ObjectUtils.Null null7 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) nullArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0386");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        java.lang.Class<?> wildcardClass2 = objectUtils1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) objectUtils1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0387");
        java.lang.Appendable appendable0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0388");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.clone(strArray6);
        java.io.Serializable serializable9 = org.apache.commons.lang3.ObjectUtils.mode((java.io.Serializable[]) strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + "1" + "'", serializable9.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0389");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(2118744065);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2118744065 + "'", int1 == 2118744065);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0390");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (-306834496), (java.lang.Object) wildcardClass2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) boolean4, "1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0391");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 52 + "'", byte1 == (byte) 52);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0392");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-306834496));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-306834496) + "'", int1 == (-306834496));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0393");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-48));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-48) + "'", int1 == (-48));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0394");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, (-1), (-1L), 100.0f };
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray4);
        java.lang.Class<?> wildcardClass6 = objArray4.getClass();
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-306834496) + "'", int5 == (-306834496));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0395");
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) objectUtils1, (java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass4 = objectUtils1.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass6);
        java.lang.reflect.GenericDeclaration genericDeclaration8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.reflect.GenericDeclaration) wildcardClass4, (java.lang.reflect.GenericDeclaration) wildcardClass6);
        boolean boolean9 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (byte) -55, (java.lang.Object) genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "class java.lang.Object" + "'", str7.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0396");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.Class<?> wildcardClass2 = objArray0.getClass();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.Object[] objArray4 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray3);
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(wildcardClass2, wildcardClass5);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) wildcardClass2);
        java.io.Serializable serializable8 = org.apache.commons.lang3.ObjectUtils.clone((java.io.Serializable) str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0397");
        java.lang.reflect.AnnotatedElement annotatedElement0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray1.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(wildcardClass3, wildcardClass6);
        java.lang.reflect.AnnotatedElement annotatedElement8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(annotatedElement0, (java.lang.reflect.AnnotatedElement) wildcardClass3);
        java.lang.Class<?> wildcardClass9 = org.apache.commons.lang3.ObjectUtils.clone(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0398");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = org.apache.commons.lang3.ObjectUtils.clone(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0399");
        java.lang.Appendable appendable0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0400");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((-5));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -5 + "'", byte1 == (byte) -5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0401");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a" + "'", str1.equals("a"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0402");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0403");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null5 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null6 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = new org.apache.commons.lang3.ObjectUtils.Null[] { null4, null5, null6 };
        org.apache.commons.lang3.ObjectUtils.Null null8 = org.apache.commons.lang3.ObjectUtils.mode(nullArray7);
        org.apache.commons.lang3.ObjectUtils.Null null9 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(null1, null8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0404");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 32 + "'", byte1 == (byte) 32);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0405");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 1.46437171E9f, "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.46437171E9" + "'", str2.equals("1.46437171E9"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0406");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0407");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) objectUtils0, (java.lang.Object) (byte) 10);
        org.apache.commons.lang3.ObjectUtils objectUtils3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtils0);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) objectUtils0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0408");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray1.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(wildcardClass3, wildcardClass6);
        java.lang.reflect.AnnotatedElement annotatedElement8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.reflect.AnnotatedElement) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0409");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 5 + "'", byte1 == (byte) 5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0410");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[] { null2 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray6 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray5 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray6);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray8 = org.apache.commons.lang3.ObjectUtils.mode(nullArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) nullArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0411");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.mode(objectUtilsArray3);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectUtils5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-575714536) + "'", int6 == (-575714536));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0412");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.io.Serializable serializable7 = org.apache.commons.lang3.ObjectUtils.mode((java.io.Serializable[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + "1" + "'", serializable7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0413");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (byte) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-5L) + "'", long1 == (-5L));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0414");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 5.0f, (java.lang.Object) "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0415");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) "3201202.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0416");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -5 + "'", short1 == (short) -5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0417");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0418");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (byte) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-5.0f) + "'", float1 == (-5.0f));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0419");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0420");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) "1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0421");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 55L + "'", long1 == 55L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0422");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) str6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0423");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0424");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("", "55", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0425");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 5 + "'", byte1 == (byte) 5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0426");
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        java.lang.Class<?> wildcardClass5 = null2.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type type7 = org.apache.commons.lang3.ObjectUtils.mode(typeArray6);
        boolean boolean8 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 5, (java.lang.Object) typeArray6);
        java.lang.reflect.Type type9 = org.apache.commons.lang3.ObjectUtils.mode(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0427");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (short) 31, "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "31" + "'", str2.equals("31"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0428");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Comparable<java.lang.String>) "1.464371712E9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "1.464371712E9" + "'", strComparable1.equals("1.464371712E9"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0429");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 10 + "'", byte1 == (byte) 10);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0430");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((-5));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -5 + "'", short1 == (short) -5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0431");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        java.lang.Class<?> wildcardClass4 = null1.getClass();
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] { wildcardClass4 };
        java.lang.reflect.Type type6 = org.apache.commons.lang3.ObjectUtils.mode(typeArray5);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) typeArray5);
        java.lang.reflect.Type type8 = org.apache.commons.lang3.ObjectUtils.mode(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0432");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 52 + "'", byte1 == (byte) 52);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0433");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0434");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0435");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) strArray7);
        int int9 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1119249155 + "'", int9 == 1119249155);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0436");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0437");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (-306834496), (java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0438");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) objectUtilsArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0439");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0440");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 55 + "'", short1 == (short) 55);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0441");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0442");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 52 + "'", short1 == (short) 52);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0443");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] { typeArray0, typeArray1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.ObjectUtils.mode(typeArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0444");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0445");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0446");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (-306834496), (java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(wildcardClass2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass5);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "class java.lang.Object" + "'", str6.equals("class java.lang.Object"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0447");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (-306834496), (java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0448");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) "1");
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0449");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.CharSequence) "class [Ljava.lang.Object;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "class [Ljava.lang.Object;" + "'", charSequence1.equals("class [Ljava.lang.Object;"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0450");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.mode(objectUtilsArray4);
        boolean boolean8 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) objectUtilsArray4, (java.lang.Object) (-51));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectUtils6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0451");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass1);
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0452");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -5 + "'", byte1 == (byte) -5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0453");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0454");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 31L + "'", long1 == 31L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0455");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 3 + "'", short1 == (short) 3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0456");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 31 + "'", short1 == (short) 31);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0457");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 49.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.0d + "'", double1 == 49.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0458");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement1 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement annotatedElement2 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement2);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0459");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("55", "1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0460");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Comparable<java.lang.String>) "1.464371712E9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0461");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (short) -3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -3 + "'", byte1 == (byte) -3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0462");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 5 + "'", short1 == (short) 5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0463");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.0d + "'", double1 == 48.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0464");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2033316271) + "'", int6 == (-2033316271));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0465");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.clone(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.min(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0466");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.Object obj6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Object) strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0467");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray4);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3277121 + "'", int6 == 3277121);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0468");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) "31", "1.46437171E9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "31" + "'", str2.equals("31"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0469");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("a", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0470");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 51.0f + "'", float1 == 51.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0471");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 4 + "'", byte1 == (byte) 4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0472");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) -3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -3 + "'", short1 == (short) -3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0473");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((-50));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -50 + "'", byte1 == (byte) -50);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0474");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 97 + "'", short1 == (short) 97);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0475");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.CONST("2118744065");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2118744065" + "'", str1.equals("2118744065"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0476");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 32 + "'", short1 == (short) 32);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0477");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-50));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-50.0f) + "'", float1 == (-50.0f));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0478");
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((-2033316271));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [-2033316271]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0479");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Object[] objArray3 = org.apache.commons.lang3.ObjectUtils.clone(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0480");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement1 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement annotatedElement2 = org.apache.commons.lang3.ObjectUtils.mode(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement2);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0481");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class [Ljava.lang.Object;", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0482");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (byte) 50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 50.0f + "'", float1 == 50.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0483");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) -55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -55 + "'", short1 == (short) -55);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0484");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.min(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0485");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) "1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0486");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100" + "'", str1.equals("100"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0487");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0488");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (-1.0d), "1.46437171E9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0" + "'", str2.equals("-1.0"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0489");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) strArray3, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0490");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) (short) 31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0491");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0492");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (byte) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0493");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0494");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST(97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0495");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 10 + "'", short1 == (short) 10);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0496");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0497");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0498");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = org.apache.commons.lang3.ObjectUtils.mode(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(nullArray7);
        org.apache.commons.lang3.ObjectUtils.Null null9 = org.apache.commons.lang3.ObjectUtils.mode(nullArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0499");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (byte) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-5" + "'", str1.equals("-5"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test0500");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) 50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 50 + "'", byte1 == (byte) 50);
    }
}
