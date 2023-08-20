package ObjectUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ObjectUtils0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test01");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Comparable<java.lang.String>) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "hi!" + "'", strComparable1.equals("hi!"));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test02");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 10 + "'", byte1 == (byte) 10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test03");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 100 + "'", short1 == (short) 100);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test04");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0f), (byte) 0, (byte) 1, (short) 100 };
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 277747716 + "'", int5 == 277747716);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test05");
        java.lang.reflect.Type type0 = null;
        java.lang.reflect.Type type1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(type0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test06");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (byte) 10, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test07");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "10", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 55 + "'", int3 == 55);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test08");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) true, "10");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "true" + "'", str2.equals("true"));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test09");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("true", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test10");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.min(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test11");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (byte) 100, (java.lang.Object) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test12");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test13");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.min(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.median(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.min(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test14");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) ' ');
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test15");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "10");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test16");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test17");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test18");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test20");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        java.lang.Class<?> wildcardClass1 = null0.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement2 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.reflect.AnnotatedElement) wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test21");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("true", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test22");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) (short) 10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test23");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "" + "'", charSequence1.equals(""));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test24");
        char char1 = org.apache.commons.lang3.ObjectUtils.CONST(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test25");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test26");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull("10", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test27");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.min(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.median(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test28");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test29");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        java.lang.Class<?> wildcardClass2 = null1.getClass();
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) '4', (java.lang.Object) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test30");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) '#', "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#" + "'", str2.equals("#"));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test31");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a" + "'", str1.equals("a"));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test32");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Comparable<java.lang.String>) "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "true" + "'", strComparable1.equals("true"));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test33");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test34");
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
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test35");
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
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test36");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) 10, (java.lang.Object) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test37");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.clone(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(null1);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test38");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0" + "'", str1.equals("-1.0"));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test39");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test40");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test41");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test42");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) "10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test43");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test44");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) "a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test45");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test46");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "#" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#" + "'", str3.equals("#"));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test47");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 100 + "'", short1 == (short) 100);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test48");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) null0, "hi!");
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) str2, "-1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test49");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("", "a", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test50");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test51");
        java.lang.Object[] objArray0 = null;
        int int1 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test52");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.min(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.median(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.max(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test53");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("true", "-1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 71 + "'", int2 == 71);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test54");
        java.lang.String[] strArray3 = new java.lang.String[] { "10", "true", "hi!" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "true" + "'", str6.equals("true"));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test55");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 55);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test56");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST(1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test57");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100" + "'", str1.equals("100"));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test58");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("#", "10");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test59");
        java.lang.String[] strArray2 = new java.lang.String[] { "true", "hi!" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test60");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test61");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test62");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) (-14));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test63");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test64");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.mode(objArray0);
        java.lang.Class<?> wildcardClass2 = objArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test65");
        char char1 = org.apache.commons.lang3.ObjectUtils.CONST('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test66");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.clone("100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test67");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        java.lang.Class<?> wildcardClass2 = null1.getClass();
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) '4', (java.lang.Object) wildcardClass2);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[] { wildcardClass2 };
        java.lang.reflect.AnnotatedElement annotatedElement5 = org.apache.commons.lang3.ObjectUtils.mode(annotatedElementArray4);
        java.lang.Class<?> wildcardClass6 = annotatedElementArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test68");
        java.lang.String[] strArray3 = new java.lang.String[] { "-1.0", "true", "hi!" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test69");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test70");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        java.lang.Class<?> wildcardClass2 = null1.getClass();
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) '4', (java.lang.Object) wildcardClass2);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[] { wildcardClass2 };
        java.lang.reflect.AnnotatedElement annotatedElement5 = org.apache.commons.lang3.ObjectUtils.mode(annotatedElementArray4);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(annotatedElementArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray6);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test71");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) (short) 100);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test72");
        java.lang.String[] strArray3 = new java.lang.String[] { "10", "true", "hi!" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils0.test73");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }
}

