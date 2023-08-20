package ObjectUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ObjectUtils0 {

    public static boolean debug = false;

    @Test
    public void ObjectUtils0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0001");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0002");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (byte) 1, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void ObjectUtils0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0003");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void ObjectUtils0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0004");
        java.io.Serializable serializable1 = org.apache.commons.lang3.ObjectUtils.CONST((java.io.Serializable) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + (-1L) + "'", serializable1.equals((-1L)));
    }

    @Test
    public void ObjectUtils0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0005");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) 100L, (java.lang.Object) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0006");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString(obj0, "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void ObjectUtils0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0007");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void ObjectUtils0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0008");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0009");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 100 + "'", byte1 == (byte) 100);
    }

    @Test
    public void ObjectUtils0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0010");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void ObjectUtils0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0011");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0012");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0013");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void ObjectUtils0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0014");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void ObjectUtils0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0015");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void ObjectUtils0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0016");
        boolean boolean1 = org.apache.commons.lang3.ObjectUtils.CONST(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void ObjectUtils0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0017");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void ObjectUtils0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0018");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void ObjectUtils0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0019");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 100L);
    }

    @Test
    public void ObjectUtils0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0020");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("1", "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-55) + "'", int3 == (-55));
    }

    @Test
    public void ObjectUtils0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0021");
        java.io.Serializable serializable1 = org.apache.commons.lang3.ObjectUtils.clone((java.io.Serializable) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void ObjectUtils0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0022");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void ObjectUtils0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0023");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0024");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString(obj0, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void ObjectUtils0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0025");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0026");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void ObjectUtils0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0027");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, (-1), (-1L), 100.0f };
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray4);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) int5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-306834496) + "'", int5 == (-306834496));
    }

    @Test
    public void ObjectUtils0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0028");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void ObjectUtils0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0029");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void ObjectUtils0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0030");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 1.0f);
    }

    @Test
    public void ObjectUtils0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0031");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void ObjectUtils0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0032");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 10 + "'", short1 == (short) 10);
    }

    @Test
    public void ObjectUtils0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0033");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void ObjectUtils0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0034");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void ObjectUtils0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0035");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (short) 1, "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void ObjectUtils0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0036");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 100);
    }

    @Test
    public void ObjectUtils0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0037");
        java.lang.Object obj0 = null;
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void ObjectUtils0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0038");
        char char1 = org.apache.commons.lang3.ObjectUtils.CONST('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void ObjectUtils0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0039");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void ObjectUtils0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0040");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
    }

    @Test
    public void ObjectUtils0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0041");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 100 + "'", short1 == (short) 100);
    }

    @Test
    public void ObjectUtils0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0042");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void ObjectUtils0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0043");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 10 + "'", byte1 == (byte) 10);
    }

    @Test
    public void ObjectUtils0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0044");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.clone("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void ObjectUtils0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0045");
        char char1 = org.apache.commons.lang3.ObjectUtils.CONST('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1 == '4');
    }

    @Test
    public void ObjectUtils0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0046");
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
    public void ObjectUtils0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0047");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void ObjectUtils0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0048");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 100 + "'", short1 == (short) 100);
    }

    @Test
    public void ObjectUtils0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0049");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void ObjectUtils0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0050");
        java.lang.Appendable appendable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, (-1), (-1L), 100.0f };
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray5);
        int int7 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray5);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0051");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0052");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("1", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void ObjectUtils0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0053");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void ObjectUtils0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0054");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0055");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) 1.0f, (java.lang.Object) 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0056");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void ObjectUtils0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0057");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, (-1), (-1L), 100.0f };
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray5);
        int int7 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray5);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0058");
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
    public void ObjectUtils0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0059");
        java.lang.Appendable appendable0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0060");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST(1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void ObjectUtils0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0061");
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
    public void ObjectUtils0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0062");
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
    public void ObjectUtils0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0063");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void ObjectUtils0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0064");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) objectUtils1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0065");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0066");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 10L, (java.lang.Object) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0067");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void ObjectUtils0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0068");
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
    public void ObjectUtils0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0069");
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
    public void ObjectUtils0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0070");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0071");
        char char1 = org.apache.commons.lang3.ObjectUtils.CONST(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void ObjectUtils0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0072");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void ObjectUtils0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0073");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void ObjectUtils0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0074");
        boolean boolean1 = org.apache.commons.lang3.ObjectUtils.CONST(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void ObjectUtils0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0075");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST(10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void ObjectUtils0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0076");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Comparable<java.lang.String>) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void ObjectUtils0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0077");
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
    public void ObjectUtils0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0078");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull("1", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void ObjectUtils0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0079");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray4);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0080");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) 97L, (java.lang.Object) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0081");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0082");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-3), (java.lang.Object) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0083");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) 'a', (java.lang.Object) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0084");
        java.lang.Appendable appendable0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0085");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.CONST("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void ObjectUtils0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0086");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void ObjectUtils0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0087");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) (byte) 1);
    }

    @Test
    public void ObjectUtils0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0088");
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
    public void ObjectUtils0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0089");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void ObjectUtils0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0090");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void ObjectUtils0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0091");
        char char1 = org.apache.commons.lang3.ObjectUtils.CONST('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '#' + "'", char1 == '#');
    }

    @Test
    public void ObjectUtils0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0092");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass2);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0093");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void ObjectUtils0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0094");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void ObjectUtils0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0095");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void ObjectUtils0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0096");
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
    public void ObjectUtils0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0097");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 10 + "'", byte1 == (byte) 10);
    }

    @Test
    public void ObjectUtils0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0098");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) 0L, obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0099");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void ObjectUtils0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0100");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0101");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (-306834496), (java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(wildcardClass3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0102");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "" + "'", charSequence1.equals(""));
    }

    @Test
    public void ObjectUtils0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0103");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0104");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void ObjectUtils0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0105");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void ObjectUtils0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0106");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("1", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-55) + "'", int2 == (-55));
    }

    @Test
    public void ObjectUtils0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0107");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) "1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0108");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 3201202);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0109");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void ObjectUtils0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0110");
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
    public void ObjectUtils0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0111");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) wildcardClass1, (java.lang.Object) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void ObjectUtils0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0112");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void ObjectUtils0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0113");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((-3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -3 + "'", short1 == (short) -3);
    }

    @Test
    public void ObjectUtils0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0114");
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
    public void ObjectUtils0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0115");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void ObjectUtils0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0116");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void ObjectUtils0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0117");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) '4', (java.lang.Object) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0118");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString(obj0, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void ObjectUtils0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0119");
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
    public void ObjectUtils0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0120");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("", "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void ObjectUtils0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0121");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 55 + "'", byte1 == (byte) 55);
    }

    @Test
    public void ObjectUtils0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0122");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void ObjectUtils0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0123");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 55 + "'", byte1 == (byte) 55);
    }

    @Test
    public void ObjectUtils0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0124");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass2);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0125");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 1.0d, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
    }

    @Test
    public void ObjectUtils0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0126");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void ObjectUtils0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0127");
        java.io.Serializable serializable0 = null;
        java.io.Serializable serializable1 = org.apache.commons.lang3.ObjectUtils.clone(serializable0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void ObjectUtils0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0128");
        java.lang.Appendable appendable0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray1.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(wildcardClass3, wildcardClass6);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0129");
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
    public void ObjectUtils0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0130");
        java.io.Serializable serializable1 = org.apache.commons.lang3.ObjectUtils.CONST((java.io.Serializable) (-3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + (-3) + "'", serializable1.equals((-3)));
    }

    @Test
    public void ObjectUtils0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0131");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 52 + "'", short1 == (short) 52);
    }

    @Test
    public void ObjectUtils0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0132");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0133");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) "1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0134");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0135");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void ObjectUtils0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0136");
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
    public void ObjectUtils0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0137");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void ObjectUtils0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0138");
        java.lang.Object obj0 = null;
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ObjectUtils0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0139");
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
    public void ObjectUtils0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0140");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void ObjectUtils0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0141");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("", "1.0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void ObjectUtils0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0142");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0143");
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
    public void ObjectUtils0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0144");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 97L);
    }

    @Test
    public void ObjectUtils0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0145");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void ObjectUtils0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0146");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("1", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void ObjectUtils0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0147");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 100 + "'", short1 == (short) 100);
    }

    @Test
    public void ObjectUtils0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0148");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0149");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0150");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST(100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void ObjectUtils0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0151");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("1", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void ObjectUtils0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0152");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, (-1), (-1L), 100.0f };
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray5);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0153");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void ObjectUtils0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0154");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0155");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 35.0d, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "35.0" + "'", str2.equals("35.0"));
    }

    @Test
    public void ObjectUtils0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0156");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("1", "1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void ObjectUtils0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0157");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void ObjectUtils0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0158");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void ObjectUtils0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0159");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void ObjectUtils0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0160");
        java.io.Serializable serializable1 = org.apache.commons.lang3.ObjectUtils.CONST((java.io.Serializable) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + 97.0f + "'", serializable1.equals(97.0f));
    }

    @Test
    public void ObjectUtils0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0161");
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
    public void ObjectUtils0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0162");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void ObjectUtils0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0163");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void ObjectUtils0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0164");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void ObjectUtils0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0165");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void ObjectUtils0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0166");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString(obj0, "1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
    }

    @Test
    public void ObjectUtils0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0167");
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
    public void ObjectUtils0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0168");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void ObjectUtils0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0169");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("1", "class java.lang.Object", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-50) + "'", int3 == (-50));
    }

    @Test
    public void ObjectUtils0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0170");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void ObjectUtils0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0171");
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
    public void ObjectUtils0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0172");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 1119249155);
    }

    @Test
    public void ObjectUtils0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0173");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.0" + "'", str1.equals("1.0"));
    }

    @Test
    public void ObjectUtils0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0174");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void ObjectUtils0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0175");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-50));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-50L) + "'", long1 == (-50L));
    }

    @Test
    public void ObjectUtils0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0176");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "35.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void ObjectUtils0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0177");
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
    public void ObjectUtils0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0178");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void ObjectUtils0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0179");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void ObjectUtils0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0180");
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
    public void ObjectUtils0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0181");
        java.lang.Appendable appendable0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray1.getClass();
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0182");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.clone(null1);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0183");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 3201202);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3201202L + "'", long1 == 3201202L);
    }

    @Test
    public void ObjectUtils0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0184");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-2138784939));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2138784939) + "'", int1 == (-2138784939));
    }

    @Test
    public void ObjectUtils0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0185");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray1.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(wildcardClass3, wildcardClass6);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0186");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void ObjectUtils0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0187");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Object[] objArray3 = org.apache.commons.lang3.ObjectUtils.clone(objArray2);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0188");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "1", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
    }

    @Test
    public void ObjectUtils0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0189");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0190");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void ObjectUtils0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0191");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "hi!" + "'", charSequence1.equals("hi!"));
    }

    @Test
    public void ObjectUtils0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0192");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray4);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0193");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void ObjectUtils0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0194");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) "35.0");
    }

    @Test
    public void ObjectUtils0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0195");
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
    public void ObjectUtils0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0196");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0197");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) "35.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0198");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0199");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0200");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((-55));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -55 + "'", byte1 == (byte) -55);
    }

    @Test
    public void ObjectUtils0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0201");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void ObjectUtils0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0202");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST(1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void ObjectUtils0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0203");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-5), (java.lang.Object) (byte) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0204");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void ObjectUtils0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0205");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0206");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("0", "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-51) + "'", int2 == (-51));
    }

    @Test
    public void ObjectUtils0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0207");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) 1119249155, (java.lang.Object) 3201202L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0208");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1, null2, null3 };
        org.apache.commons.lang3.ObjectUtils.Null null5 = org.apache.commons.lang3.ObjectUtils.mode(nullArray4);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) nullArray4);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0209");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.clone("35.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void ObjectUtils0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0210");
        java.lang.String[] strArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.max(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void ObjectUtils0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0211");
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
    public void ObjectUtils0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0212");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 52 + "'", short1 == (short) 52);
    }

    @Test
    public void ObjectUtils0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0213");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void ObjectUtils0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0214");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void ObjectUtils0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0215");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 100 + "'", byte1 == (byte) 100);
    }

    @Test
    public void ObjectUtils0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0216");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 2118744065);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2118744065" + "'", str1.equals("2118744065"));
    }

    @Test
    public void ObjectUtils0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0217");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) "35.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0218");
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
    public void ObjectUtils0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0219");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void ObjectUtils0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0220");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void ObjectUtils0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0221");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 55 + "'", short1 == (short) 55);
    }

    @Test
    public void ObjectUtils0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0222");
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
    public void ObjectUtils0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0223");
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
    public void ObjectUtils0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0224");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "2118744065", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
    }

    @Test
    public void ObjectUtils0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0225");
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
    public void ObjectUtils0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0226");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 97 + "'", byte1 == (byte) 97);
    }

    @Test
    public void ObjectUtils0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0227");
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
    public void ObjectUtils0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0228");
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
    public void ObjectUtils0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0229");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) (short) 55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0230");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("35.0", "class java.lang.Object", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-48) + "'", int3 == (-48));
    }

    @Test
    public void ObjectUtils0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0231");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-5));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void ObjectUtils0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0232");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
    }

    @Test
    public void ObjectUtils0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0233");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void ObjectUtils0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0234");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(3201202);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3201202 + "'", int1 == 3201202);
    }

    @Test
    public void ObjectUtils0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0235");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 2118744065);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0236");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 10 + "'", short1 == (short) 10);
    }

    @Test
    public void ObjectUtils0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0237");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        java.lang.Class<?> wildcardClass5 = null2.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.reflect.AnnotatedElement) wildcardClass5);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0238");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 10 + "'", short1 == (short) 10);
    }

    @Test
    public void ObjectUtils0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0239");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
    }

    @Test
    public void ObjectUtils0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0240");
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
    public void ObjectUtils0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0241");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void ObjectUtils0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0242");
        java.lang.Appendable appendable0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray4);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray4);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0243");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray7);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0244");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void ObjectUtils0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0245");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("", "1.0", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void ObjectUtils0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0246");
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
    public void ObjectUtils0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0247");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void ObjectUtils0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0248");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.0d + "'", double1 == 49.0d);
    }

    @Test
    public void ObjectUtils0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0249");
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
    public void ObjectUtils0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0250");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 52 + "'", byte1 == (byte) 52);
    }

    @Test
    public void ObjectUtils0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0251");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 10.0d);
    }

    @Test
    public void ObjectUtils0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0252");
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
    public void ObjectUtils0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0253");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 50 + "'", byte1 == (byte) 50);
    }

    @Test
    public void ObjectUtils0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0254");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-48), (java.lang.Object) (short) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0255");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        boolean boolean6 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) strArray3, (java.lang.Object) "1.0");
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0256");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) "35.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0257");
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
    public void ObjectUtils0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0258");
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
    public void ObjectUtils0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0259");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 52 + "'", byte1 == (byte) 52);
    }

    @Test
    public void ObjectUtils0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0260");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 52 + "'", short1 == (short) 52);
    }

    @Test
    public void ObjectUtils0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0261");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 55 + "'", short1 == (short) 55);
    }

    @Test
    public void ObjectUtils0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0262");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) objectUtils1, (java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass4 = objectUtils1.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass6);
        java.lang.reflect.GenericDeclaration genericDeclaration8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.reflect.GenericDeclaration) wildcardClass4, (java.lang.reflect.GenericDeclaration) wildcardClass6);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0263");
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
    public void ObjectUtils0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0264");
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
    public void ObjectUtils0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0265");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void ObjectUtils0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0266");
        java.lang.Appendable appendable0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0267");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void ObjectUtils0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0268");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-51));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-51.0d) + "'", double1 == (-51.0d));
    }

    @Test
    public void ObjectUtils0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0269");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 1464371706);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.46437171E9f + "'", float1 == 1.46437171E9f);
    }

    @Test
    public void ObjectUtils0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0270");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void ObjectUtils0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0271");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (short) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "55" + "'", str1.equals("55"));
    }

    @Test
    public void ObjectUtils0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0272");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void ObjectUtils0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0273");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 97 + "'", byte1 == (byte) 97);
    }

    @Test
    public void ObjectUtils0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0274");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("0", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void ObjectUtils0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0275");
        java.lang.Object[] objArray0 = null;
        int int1 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void ObjectUtils0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0276");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 1L, obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0277");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) "1", (java.lang.Object) (-50));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0278");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Comparable<java.lang.String>) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "0" + "'", strComparable1.equals("0"));
    }

    @Test
    public void ObjectUtils0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0279");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 100 + "'", byte1 == (byte) 100);
    }

    @Test
    public void ObjectUtils0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0280");
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
    public void ObjectUtils0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0281");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 100 + "'", byte1 == (byte) 100);
    }

    @Test
    public void ObjectUtils0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0282");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void ObjectUtils0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0283");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0284");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 35 + "'", byte1 == (byte) 35);
    }

    @Test
    public void ObjectUtils0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0285");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Comparable<java.lang.String>) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "" + "'", strComparable1.equals(""));
    }

    @Test
    public void ObjectUtils0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0286");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 97 + "'", short1 == (short) 97);
    }

    @Test
    public void ObjectUtils0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0287");
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
    public void ObjectUtils0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0288");
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
    public void ObjectUtils0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0289");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[] { null2 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray6 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray5 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray6);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray8 = org.apache.commons.lang3.ObjectUtils.mode(nullArray6);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0290");
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
    public void ObjectUtils0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0291");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "55", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 51 + "'", int3 == 51);
    }

    @Test
    public void ObjectUtils0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0292");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("", "2118744065", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
    }

    @Test
    public void ObjectUtils0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0293");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElementArray1);
    }

    @Test
    public void ObjectUtils0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0294");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void ObjectUtils0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0295");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void ObjectUtils0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0296");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0297");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "1.0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
    }

    @Test
    public void ObjectUtils0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0298");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void ObjectUtils0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0299");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 35 + "'", byte1 == (byte) 35);
    }

    @Test
    public void ObjectUtils0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0300");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-51));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-51.0f) + "'", float1 == (-51.0f));
    }

    @Test
    public void ObjectUtils0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0301");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void ObjectUtils0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0302");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("", "1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void ObjectUtils0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0303");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) (short) 97);
    }

    @Test
    public void ObjectUtils0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0304");
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
    public void ObjectUtils0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0305");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(1119249155);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1119249155 + "'", int1 == 1119249155);
    }

    @Test
    public void ObjectUtils0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0306");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray1.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(wildcardClass3, wildcardClass6);
        java.lang.reflect.AnnotatedElement annotatedElement8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.reflect.AnnotatedElement) wildcardClass7);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0307");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 1.46437171E9f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.464371712E9d + "'", double1 == 1.464371712E9d);
    }

    @Test
    public void ObjectUtils0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0308");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void ObjectUtils0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0309");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (-2138784939), (java.lang.Object) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0310");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("35.0", "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-48) + "'", int2 == (-48));
    }

    @Test
    public void ObjectUtils0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0311");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "2118744065", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
    }

    @Test
    public void ObjectUtils0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0312");
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
    public void ObjectUtils0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0313");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-50));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-50.0d) + "'", double1 == (-50.0d));
    }

    @Test
    public void ObjectUtils0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0314");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 100 + "'", short1 == (short) 100);
    }

    @Test
    public void ObjectUtils0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0315");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void ObjectUtils0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0316");
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
    public void ObjectUtils0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0317");
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
    public void ObjectUtils0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0318");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (byte) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 55 + "'", int1 == 55);
    }

    @Test
    public void ObjectUtils0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0319");
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.Comparable<java.lang.String>) "class java.lang.Object", (java.lang.Comparable<java.lang.String>) "1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + "class java.lang.Object" + "'", strComparable2.equals("class java.lang.Object"));
    }

    @Test
    public void ObjectUtils0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0320");
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
    public void ObjectUtils0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0321");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("", "2118744065");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void ObjectUtils0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0322");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-2138784939));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.138784939E9d) + "'", double1 == (-2.138784939E9d));
    }

    @Test
    public void ObjectUtils0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0323");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("35.0", "0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void ObjectUtils0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0324");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void ObjectUtils0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0325");
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
    public void ObjectUtils0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0326");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 35.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0327");
        java.lang.Object obj2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.Object) (byte) -1, (java.lang.Object) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (byte) -1 + "'", obj2.equals((byte) -1));
    }

    @Test
    public void ObjectUtils0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0328");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 10 + "'", short1 == (short) 10);
    }

    @Test
    public void ObjectUtils0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0329");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) false, (java.lang.Object) 2118744065);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0330");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.median(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated array is empty");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0331");
        java.lang.Object obj1 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Object) (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj1 + "' != '" + (byte) 97 + "'", obj1.equals((byte) 97));
    }

    @Test
    public void ObjectUtils0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0332");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 49.0f + "'", float1 == 49.0f);
    }

    @Test
    public void ObjectUtils0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0333");
        java.lang.reflect.Type[] typeArray0 = null;
        java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray1);
    }

    @Test
    public void ObjectUtils0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0334");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0335");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST(52L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void ObjectUtils0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0336");
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
    public void ObjectUtils0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0337");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 31 + "'", short1 == (short) 31);
    }

    @Test
    public void ObjectUtils0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0338");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (-306834496), (java.lang.Object) wildcardClass3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0339");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void ObjectUtils0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0340");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0341");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) (short) 52);
    }

    @Test
    public void ObjectUtils0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0342");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void ObjectUtils0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0343");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0344");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 100.0d);
    }

    @Test
    public void ObjectUtils0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0345");
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
    public void ObjectUtils0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0346");
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
    public void ObjectUtils0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0347");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (byte) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void ObjectUtils0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0348");
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
    public void ObjectUtils0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0349");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void ObjectUtils0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0350");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtilsArray4);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) objectUtilsArray7);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0351");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 97 + "'", short1 == (short) 97);
    }

    @Test
    public void ObjectUtils0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0352");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (-306834496), (java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(wildcardClass3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0353");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) (byte) 10);
    }

    @Test
    public void ObjectUtils0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0354");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) "2118744065", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2118744065" + "'", str2.equals("2118744065"));
    }

    @Test
    public void ObjectUtils0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0355");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 3201202L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3201202.0f + "'", float1 == 3201202.0f);
    }

    @Test
    public void ObjectUtils0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0356");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (byte) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void ObjectUtils0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0357");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0358");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class [Ljava.lang.Object;", "1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void ObjectUtils0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0359");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("55", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void ObjectUtils0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0360");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void ObjectUtils0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0361");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 51L + "'", long1 == 51L);
    }

    @Test
    public void ObjectUtils0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0362");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtils0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectUtils1);
    }

    @Test
    public void ObjectUtils0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0363");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 1.464371712E9d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.464371712E9" + "'", str1.equals("1.464371712E9"));
    }

    @Test
    public void ObjectUtils0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0364");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST(49.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 49.0f + "'", float1 == 49.0f);
    }

    @Test
    public void ObjectUtils0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0365");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-3.0f) + "'", float1 == (-3.0f));
    }

    @Test
    public void ObjectUtils0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0366");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void ObjectUtils0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0367");
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(2118744065);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -128 and 127: [2118744065]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0368");
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
    public void ObjectUtils0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0369");
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
    public void ObjectUtils0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0370");
        java.io.Serializable serializable1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.io.Serializable) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable1 + "' != '" + true + "'", serializable1.equals(true));
    }

    @Test
    public void ObjectUtils0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0371");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 1464371706);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.464371706E9d + "'", double1 == 1.464371706E9d);
    }

    @Test
    public void ObjectUtils0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0372");
        java.lang.String[] strArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.min(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void ObjectUtils0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0373");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) -3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -3 + "'", short1 == (short) -3);
    }

    @Test
    public void ObjectUtils0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0374");
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
    public void ObjectUtils0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0375");
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
    public void ObjectUtils0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0376");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void ObjectUtils0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0377");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 3201202.0f, "35.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3201202.0" + "'", str2.equals("3201202.0"));
    }

    @Test
    public void ObjectUtils0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0378");
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
    public void ObjectUtils0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0379");
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
    public void ObjectUtils0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0380");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1, null2, null3 };
        org.apache.commons.lang3.ObjectUtils.Null null5 = org.apache.commons.lang3.ObjectUtils.mode(nullArray4);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) null5);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0381");
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(474113137);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [474113137]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0382");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0383");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void ObjectUtils0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0384");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("true", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void ObjectUtils0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0385");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1, null2, null3 };
        org.apache.commons.lang3.ObjectUtils.Null null5 = org.apache.commons.lang3.ObjectUtils.mode(nullArray4);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray4);
        org.apache.commons.lang3.ObjectUtils.Null null7 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray4);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0386");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        java.lang.Class<?> wildcardClass2 = objectUtils1.getClass();
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0387");
        java.lang.Appendable appendable0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray7);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0388");
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
    public void ObjectUtils0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0389");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(2118744065);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2118744065 + "'", int1 == 2118744065);
    }

    @Test
    public void ObjectUtils0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0390");
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
    public void ObjectUtils0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0391");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 52 + "'", byte1 == (byte) 52);
    }

    @Test
    public void ObjectUtils0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0392");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-306834496));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-306834496) + "'", int1 == (-306834496));
    }

    @Test
    public void ObjectUtils0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0393");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-48));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-48) + "'", int1 == (-48));
    }

    @Test
    public void ObjectUtils0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0394");
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
    public void ObjectUtils0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0395");
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
    public void ObjectUtils0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0396");
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
    public void ObjectUtils0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0397");
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
    public void ObjectUtils0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0398");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = org.apache.commons.lang3.ObjectUtils.clone(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void ObjectUtils0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0399");
        java.lang.Appendable appendable0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) strArray3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0400");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((-5));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -5 + "'", byte1 == (byte) -5);
    }

    @Test
    public void ObjectUtils0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0401");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a" + "'", str1.equals("a"));
    }

    @Test
    public void ObjectUtils0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0402");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void ObjectUtils0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0403");
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
    public void ObjectUtils0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0404");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 32 + "'", byte1 == (byte) 32);
    }

    @Test
    public void ObjectUtils0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0405");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 1.46437171E9f, "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.46437171E9" + "'", str2.equals("1.46437171E9"));
    }

    @Test
    public void ObjectUtils0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0406");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void ObjectUtils0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0407");
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
    public void ObjectUtils0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0408");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray1.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(wildcardClass3, wildcardClass6);
        java.lang.reflect.AnnotatedElement annotatedElement8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.reflect.AnnotatedElement) wildcardClass7);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0409");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 5 + "'", byte1 == (byte) 5);
    }

    @Test
    public void ObjectUtils0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0410");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[] { null2 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray6 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray5 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray6);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray8 = org.apache.commons.lang3.ObjectUtils.mode(nullArray6);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0411");
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
    public void ObjectUtils0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0412");
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
    public void ObjectUtils0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0413");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (byte) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-5L) + "'", long1 == (-5L));
    }

    @Test
    public void ObjectUtils0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0414");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 5.0f, (java.lang.Object) "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0415");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) "3201202.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0416");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -5 + "'", short1 == (short) -5);
    }

    @Test
    public void ObjectUtils0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0417");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void ObjectUtils0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0418");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (byte) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-5.0f) + "'", float1 == (-5.0f));
    }

    @Test
    public void ObjectUtils0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0419");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0420");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) "1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0421");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 55L + "'", long1 == 55L);
    }

    @Test
    public void ObjectUtils0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0422");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray4);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0423");
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
    public void ObjectUtils0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0424");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("", "55", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void ObjectUtils0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0425");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 5 + "'", byte1 == (byte) 5);
    }

    @Test
    public void ObjectUtils0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0426");
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
    public void ObjectUtils0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0427");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (short) 31, "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "31" + "'", str2.equals("31"));
    }

    @Test
    public void ObjectUtils0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0428");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Comparable<java.lang.String>) "1.464371712E9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "1.464371712E9" + "'", strComparable1.equals("1.464371712E9"));
    }

    @Test
    public void ObjectUtils0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0429");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 10 + "'", byte1 == (byte) 10);
    }

    @Test
    public void ObjectUtils0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0430");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((-5));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -5 + "'", short1 == (short) -5);
    }

    @Test
    public void ObjectUtils0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0431");
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
    public void ObjectUtils0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0432");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 52 + "'", byte1 == (byte) 52);
    }

    @Test
    public void ObjectUtils0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0433");
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
    public void ObjectUtils0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0434");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void ObjectUtils0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0435");
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
    public void ObjectUtils0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0436");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void ObjectUtils0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0437");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (-306834496), (java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(wildcardClass3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0438");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0439");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void ObjectUtils0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0440");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 55 + "'", short1 == (short) 55);
    }

    @Test
    public void ObjectUtils0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0441");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void ObjectUtils0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0442");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 52 + "'", short1 == (short) 52);
    }

    @Test
    public void ObjectUtils0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0443");
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
    public void ObjectUtils0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0444");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void ObjectUtils0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0445");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void ObjectUtils0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0446");
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
    public void ObjectUtils0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0447");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (-306834496), (java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(wildcardClass3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0448");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) "1");
    }

    @Test
    public void ObjectUtils0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0449");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.CharSequence) "class [Ljava.lang.Object;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "class [Ljava.lang.Object;" + "'", charSequence1.equals("class [Ljava.lang.Object;"));
    }

    @Test
    public void ObjectUtils0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0450");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.mode(objectUtilsArray4);
        boolean boolean8 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) objectUtilsArray4, (java.lang.Object) (-51));
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0451");
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
    public void ObjectUtils0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0452");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -5 + "'", byte1 == (byte) -5);
    }

    @Test
    public void ObjectUtils0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0453");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void ObjectUtils0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0454");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 31L + "'", long1 == 31L);
    }

    @Test
    public void ObjectUtils0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0455");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 3 + "'", short1 == (short) 3);
    }

    @Test
    public void ObjectUtils0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0456");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 31 + "'", short1 == (short) 31);
    }

    @Test
    public void ObjectUtils0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0457");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 49.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.0d + "'", double1 == 49.0d);
    }

    @Test
    public void ObjectUtils0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0458");
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
    public void ObjectUtils0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0459");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("55", "1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void ObjectUtils0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0460");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Comparable<java.lang.String>) "1.464371712E9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void ObjectUtils0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0461");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (short) -3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -3 + "'", byte1 == (byte) -3);
    }

    @Test
    public void ObjectUtils0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0462");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 5 + "'", short1 == (short) 5);
    }

    @Test
    public void ObjectUtils0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0463");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.0d + "'", double1 == 48.0d);
    }

    @Test
    public void ObjectUtils0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0464");
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
    public void ObjectUtils0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0465");
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
    public void ObjectUtils0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0466");
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
    public void ObjectUtils0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0467");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray4);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray4);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0468");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) "31", "1.46437171E9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "31" + "'", str2.equals("31"));
    }

    @Test
    public void ObjectUtils0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0469");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("a", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void ObjectUtils0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0470");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 51.0f + "'", float1 == 51.0f);
    }

    @Test
    public void ObjectUtils0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0471");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 4 + "'", byte1 == (byte) 4);
    }

    @Test
    public void ObjectUtils0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0472");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) -3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -3 + "'", short1 == (short) -3);
    }

    @Test
    public void ObjectUtils0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0473");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((-50));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -50 + "'", byte1 == (byte) -50);
    }

    @Test
    public void ObjectUtils0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0474");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 97 + "'", short1 == (short) 97);
    }

    @Test
    public void ObjectUtils0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0475");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.CONST("2118744065");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2118744065" + "'", str1.equals("2118744065"));
    }

    @Test
    public void ObjectUtils0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0476");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 32 + "'", short1 == (short) 32);
    }

    @Test
    public void ObjectUtils0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0477");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-50));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-50.0f) + "'", float1 == (-50.0f));
    }

    @Test
    public void ObjectUtils0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0478");
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((-2033316271));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [-2033316271]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0479");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Object[] objArray3 = org.apache.commons.lang3.ObjectUtils.clone(objArray2);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0480");
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
    public void ObjectUtils0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0481");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class [Ljava.lang.Object;", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void ObjectUtils0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0482");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (byte) 50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 50.0f + "'", float1 == 50.0f);
    }

    @Test
    public void ObjectUtils0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0483");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) -55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -55 + "'", short1 == (short) -55);
    }

    @Test
    public void ObjectUtils0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0484");
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
    public void ObjectUtils0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0485");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) "1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0486");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100" + "'", str1.equals("100"));
    }

    @Test
    public void ObjectUtils0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0487");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void ObjectUtils0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0488");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (-1.0d), "1.46437171E9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0" + "'", str2.equals("-1.0"));
    }

    @Test
    public void ObjectUtils0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0489");
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
    public void ObjectUtils0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0490");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) (short) 31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0491");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void ObjectUtils0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0492");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (byte) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void ObjectUtils0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0493");
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
    public void ObjectUtils0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0494");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST(97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void ObjectUtils0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0495");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 10 + "'", short1 == (short) 10);
    }

    @Test
    public void ObjectUtils0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0496");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void ObjectUtils0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0497");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void ObjectUtils0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0498");
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
    public void ObjectUtils0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0499");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (byte) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-5" + "'", str1.equals("-5"));
    }

    @Test
    public void ObjectUtils0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.ObjectUtils0500");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) 50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 50 + "'", byte1 == (byte) 50);
    }
}
