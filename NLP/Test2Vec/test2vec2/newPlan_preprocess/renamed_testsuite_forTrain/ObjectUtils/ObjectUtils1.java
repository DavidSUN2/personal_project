
package ObjectUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ObjectUtils1 {

    public static boolean debug = false;

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0501");
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + "" + "'", strComparable2.equals(""));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0502");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtilsArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) objectUtilsArray6);
        java.lang.Object obj8 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Object) str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0503");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("1.464371712E9", "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0504");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (short) -55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-55" + "'", str1.equals("-55"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0505");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) "-5");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0506");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 49L + "'", long1 == 49L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0507");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-1.0", "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0508");
        java.lang.Object[] objArray0 = null;
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.clone(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objArray1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0509");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0510");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0511");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0512");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) "1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0513");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) "31");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0514");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0515");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = org.apache.commons.lang3.ObjectUtils.mode(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(nullArray7);
        org.apache.commons.lang3.ObjectUtils.Null null9 = org.apache.commons.lang3.ObjectUtils.mode(nullArray8);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0516");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0517");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] { typeArray0, typeArray1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.ObjectUtils.mode(typeArray2);
        java.lang.reflect.Type[][] typeArray4 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray2);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1550056849) + "'", int5 == (-1550056849));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0518");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("35.0", "3201202.0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0519");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0520");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) objectUtils1, (java.lang.Object) (byte) 10);
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtils1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) objectUtils4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0521");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray3 = new org.apache.commons.lang3.ObjectUtils.Null[] { null0, null1, null2 };
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.mode(nullArray3);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[] { null4 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray6 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray5 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray7 = org.apache.commons.lang3.ObjectUtils.clone(nullArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) nullArray6);
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray9 = org.apache.commons.lang3.ObjectUtils.clone(nullArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0522");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("", "class [Ljava.lang.Object;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-25) + "'", int2 == (-25));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0523");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 49 + "'", short1 == (short) 49);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0524");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) objArray6);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0525");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) "1.46437171E9");
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0526");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0527");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 10.0f, (java.lang.Object) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0528");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        java.lang.Class<?> wildcardClass4 = null1.getClass();
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] { wildcardClass4 };
        java.lang.reflect.Type type6 = org.apache.commons.lang3.ObjectUtils.mode(typeArray5);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) type6);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "class org.apache.commons.lang3.ObjectUtils$Null" + "'", str7.equals("class org.apache.commons.lang3.ObjectUtils$Null"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0529");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0530");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0531");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0532");
        java.lang.reflect.Type[] typeArray0 = null;
        java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.ObjectUtils.CONST(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0533");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0534");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.ObjectUtils.clone(strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) strArray7);
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
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0535");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (short) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 32 + "'", byte1 == (byte) 32);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0536");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0537");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) "-1.0", obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0538");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0539");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-5));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-5.0f) + "'", float1 == (-5.0f));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0540");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-1550056849));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.550056849E9d) + "'", double1 == (-1.550056849E9d));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0541");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0542");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(wildcardClass2, wildcardClass4);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.ObjectUtils.clone(wildcardClass4);
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.reflect.GenericDeclaration) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0543");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 31L + "'", long1 == 31L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0544");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (short) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 55.0f + "'", float1 == 55.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0545");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) (short) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0546");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (-5));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-5" + "'", str1.equals("-5"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0547");
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] { typeArray1, typeArray2 };
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.ObjectUtils.mode(typeArray3);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) 100L, (java.lang.Object) typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0548");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        int int7 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) strArray3);
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
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 78136861 + "'", int6 == 78136861);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 78136861 + "'", int7 == 78136861);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0549");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray5 = org.apache.commons.lang3.ObjectUtils.CONST(objectUtilsArray3);
        java.lang.Class<?> wildcardClass6 = objectUtilsArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0550");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("false", "-55", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 57 + "'", int3 == 57);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0551");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0552");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement4 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.reflect.AnnotatedElement) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) annotatedElement4);
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
        org.junit.Assert.assertNotNull(annotatedElement4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0553");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (short) 3, "class org.apache.commons.lang3.ObjectUtils$Null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3" + "'", str2.equals("3"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0554");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1" + "'", str1.equals("-1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0555");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((-3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -3 + "'", byte1 == (byte) -3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0556");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) "3");
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0557");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1" + "'", str1.equals("-1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0558");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray2 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1 };
        org.apache.commons.lang3.ObjectUtils objectUtils3 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray2);
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.ObjectUtils.clone((java.io.Serializable) objectUtilsArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0559");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.median(strArray7);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0560");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 49.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0561");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-1", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-59) + "'", int2 == (-59));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0562");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.Class<?> wildcardClass2 = objArray1.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement3 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.reflect.AnnotatedElement) wildcardClass2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass2, "hi!");
        java.lang.reflect.AnnotatedElement annotatedElement6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.reflect.AnnotatedElement) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "class [Ljava.lang.Object;" + "'", str5.equals("class [Ljava.lang.Object;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0563");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 35 + "'", byte1 == (byte) 35);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0564");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.Object[] objArray7 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) objArray7);
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
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 955038443 + "'", int6 == 955038443);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0565");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (short) -55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -55 + "'", byte1 == (byte) -55);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0566");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (-5), "2118744065");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-5" + "'", str2.equals("-5"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0567");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Comparable<java.lang.String>) "class org.apache.commons.lang3.ObjectUtils$Null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "class org.apache.commons.lang3.ObjectUtils$Null" + "'", strComparable1.equals("class org.apache.commons.lang3.ObjectUtils$Null"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0568");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0569");
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        java.lang.Class<?> wildcardClass5 = null2.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type type7 = org.apache.commons.lang3.ObjectUtils.mode(typeArray6);
        boolean boolean8 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 5, (java.lang.Object) typeArray6);
        java.lang.Class<?> wildcardClass9 = typeArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0570");
        java.lang.Appendable appendable0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        boolean boolean6 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) strArray3, (java.lang.Object) "1.0");
        java.lang.Object[] objArray7 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) objArray7);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0571");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        int int9 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0572");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("1.464371712E9", "class [Ljava.lang.Object;", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-50) + "'", int3 == (-50));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0573");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0574");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0575");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("35.0", "3", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0576");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-306834496));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-306834496L) + "'", long1 == (-306834496L));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0577");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] { typeArray0, typeArray1, typeArray2 };
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(typeArray3);
        java.lang.Class<?> wildcardClass5 = typeArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0578");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 50 + "'", short1 == (short) 50);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0579");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-55", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0580");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0581");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray3 = new org.apache.commons.lang3.ObjectUtils.Null[] { null0, null1, null2 };
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.mode(nullArray3);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[] { null4 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray6 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray5 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray7 = org.apache.commons.lang3.ObjectUtils.clone(nullArray6);
        int int8 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) nullArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1005632854 + "'", int8 == 1005632854);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0582");
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((-306834496));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [-306834496]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0583");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 0L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0584");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0585");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("2118744065", "0", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0586");
        // The following exception was thrown during execution in test generation
        try {
            byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((-575714536));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -128 and 127: [-575714536]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0587");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.clone(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray4);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0588");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] { typeArray1, typeArray2 };
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.ObjectUtils.mode(typeArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) typeArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0589");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 3277121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3277121L + "'", long1 == 3277121L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0590");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 1017436136);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.01743616E9f + "'", float1 == 1.01743616E9f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0591");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.CONST("false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "false" + "'", str1.equals("false"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0592");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 55L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 55.0f + "'", float1 == 55.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0593");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray2 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1 };
        org.apache.commons.lang3.ObjectUtils objectUtils3 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray2);
        int int4 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) objectUtilsArray2);
        boolean boolean6 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) int4, (java.lang.Object) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 897479465 + "'", int4 == 897479465);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0594");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Object[]) strArray2);
        boolean boolean8 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) objArray6, (java.lang.Object) (byte) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 156130835 + "'", int5 == 156130835);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0595");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (short) 50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 50 + "'", short1 == (short) 50);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0596");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 50 + "'", short1 == (short) 50);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0597");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) (short) 32);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0598");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 13);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0599");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.clone(strComparable0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0600");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 55 + "'", int3 == 55);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0601");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0602");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST(51L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 51L + "'", long1 == 51L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0603");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) "0");
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0604");
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
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0605");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 51, (java.lang.Object) (-48));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0606");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0607");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 97.0d, "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97.0" + "'", str2.equals("97.0"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0608");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.io.Serializable serializable7 = org.apache.commons.lang3.ObjectUtils.mode((java.io.Serializable[]) strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.clone(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.min(strArray8);
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
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0609");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray4 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][][] typeArray5 = new java.lang.reflect.Type[][][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4 };
        java.lang.reflect.Type[][] typeArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(typeArray5);
        java.lang.Class<?> wildcardClass7 = typeArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0610");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 55 + "'", byte1 == (byte) 55);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0611");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.io.Serializable serializable5 = org.apache.commons.lang3.ObjectUtils.CONST((java.io.Serializable) str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + "1" + "'", serializable5.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0612");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(897479465);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 897479465 + "'", int1 == 897479465);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0613");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) 50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 50L + "'", long1 == 50L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0614");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 4 + "'", byte1 == (byte) 4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0615");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0616");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-55));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-55L) + "'", long1 == (-55L));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0617");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 156130835);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.56130835E8d + "'", double1 == 1.56130835E8d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0618");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.Class<?> wildcardClass2 = objArray0.getClass();
        java.io.Serializable serializable3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.io.Serializable) objArray0);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0619");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) strArray2, (java.lang.Object) "1.0");
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.io.Serializable serializable7 = org.apache.commons.lang3.ObjectUtils.CONST((java.io.Serializable) strArray2);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0620");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) (-5L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0621");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) strArray2);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0622");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) int5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0623");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("", "class org.apache.commons.lang3.ObjectUtils$Null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0624");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) -3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -3 + "'", byte1 == (byte) -3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0625");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("1.0", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0626");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] { typeArray1, typeArray2 };
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.ObjectUtils.mode(typeArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) typeArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0627");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        java.lang.Object obj6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object) objectUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0628");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((-50.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-50.0d) + "'", double1 == (-50.0d));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0629");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.CharSequence) "31");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0630");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0631");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement4 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.reflect.AnnotatedElement) wildcardClass3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) annotatedElement4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) annotatedElement4);
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
        org.junit.Assert.assertNotNull(annotatedElement4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "class [Ljava.lang.Object;" + "'", str5.equals("class [Ljava.lang.Object;"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0632");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0633");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) objectUtils0, (java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass3 = objectUtils0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass5);
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.reflect.GenericDeclaration) wildcardClass3, (java.lang.reflect.GenericDeclaration) wildcardClass5);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) wildcardClass3);
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
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0634");
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.Comparable<java.lang.String>) "-5", (java.lang.Comparable<java.lang.String>) "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + "-5" + "'", strComparable2.equals("-5"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0635");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0636");
        java.lang.Appendable appendable0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) strArray8);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0637");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(1005632854);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1005632854 + "'", int1 == 1005632854);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0638");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-59));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-59L) + "'", long1 == (-59L));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0639");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-1", "55");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0640");
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.Comparable<java.lang.String>) "class [Ljava.lang.Object;", (java.lang.Comparable<java.lang.String>) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + "class [Ljava.lang.Object;" + "'", strComparable2.equals("class [Ljava.lang.Object;"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0641");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-2138784939));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2138784939L) + "'", long1 == (-2138784939L));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0642");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 55.0f + "'", float1 == 55.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0643");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 1005632854);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1005632854L + "'", long1 == 1005632854L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0644");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0645");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray3 = new org.apache.commons.lang3.ObjectUtils.Null[] { null0, null1, null2 };
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.mode(nullArray3);
        java.lang.Object obj5 = org.apache.commons.lang3.ObjectUtils.mode((java.lang.Object[]) nullArray3);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) nullArray3);
        boolean boolean8 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) nullArray3, (java.lang.Object) (-14425837));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0646");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray2 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1 };
        org.apache.commons.lang3.ObjectUtils objectUtils3 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray2);
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtils3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0647");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST(32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0648");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray7 = new org.apache.commons.lang3.ObjectUtils.Null[][] {};
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(nullArray5, nullArray7);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray9 = org.apache.commons.lang3.ObjectUtils.mode(nullArray7);
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
        org.junit.Assert.assertNull(nullArray9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0649");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.min(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0650");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0651");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) objectUtils0, (java.lang.Object) (byte) 10);
        org.apache.commons.lang3.ObjectUtils objectUtils3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtils0);
        java.lang.Class<?> wildcardClass4 = objectUtils3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0652");
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(1119249155);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [1119249155]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0653");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray3 = new org.apache.commons.lang3.ObjectUtils.Null[] { null0, null1, null2 };
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.mode(nullArray3);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray5 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray3);
        org.apache.commons.lang3.ObjectUtils.Null null6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray3);
        boolean boolean8 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) null6, (java.lang.Object) 97.0f);
        java.lang.Class<?> wildcardClass9 = null6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0654");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0655");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = org.apache.commons.lang3.ObjectUtils.clone(typeArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) typeArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0656");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) str5, "1.464371712E9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "class java.lang.Object" + "'", str4.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0657");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 1005632854, "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1005632854" + "'", str2.equals("1005632854"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0658");
        java.io.Serializable[] serializableArray0 = null;
        java.io.Serializable serializable1 = org.apache.commons.lang3.ObjectUtils.firstNonNull(serializableArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0659");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0660");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("-55", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0661");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("55", "true", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-63) + "'", int3 == (-63));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0662");
        java.lang.Appendable appendable0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, obj1);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0663");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 3 + "'", short1 == (short) 3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0664");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("35.0", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-46) + "'", int2 == (-46));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0665");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST(3201202L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3201202L + "'", long1 == 3201202L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0666");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
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
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0667");
        java.lang.reflect.Type[][][] typeArray0 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray1 = org.apache.commons.lang3.ObjectUtils.CONST(typeArray0);
        java.lang.Class<?> wildcardClass2 = typeArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0668");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("true", "-1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 71 + "'", int2 == 71);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0669");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (short) 32, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32" + "'", str2.equals("32"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0670");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 97 + "'", byte1 == (byte) 97);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0671");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.ObjectUtils.clone(typeArray0);
        java.lang.reflect.Type[] typeArray2 = org.apache.commons.lang3.ObjectUtils.clone(typeArray1);
        java.lang.Object obj3 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[]) typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0672");
        java.lang.Appendable appendable0 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement2 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.ObjectUtils.clone(annotatedElementArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) annotatedElementArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0673");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.io.Serializable serializable7 = org.apache.commons.lang3.ObjectUtils.mode((java.io.Serializable[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.ObjectUtils.clone(strArray3);
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
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0674");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray2);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[] strArray9 = org.apache.commons.lang3.ObjectUtils.CONST(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0675");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((-48));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -48 + "'", short1 == (short) -48);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0676");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("32", "1", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0677");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.io.Serializable serializable7 = org.apache.commons.lang3.ObjectUtils.mode((java.io.Serializable[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) str8);
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
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0678");
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(3277121);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [3277121]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0679");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray2);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.max(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0680");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0681");
        java.lang.reflect.Type[][][] typeArray0 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray1 = org.apache.commons.lang3.ObjectUtils.CONST(typeArray0);
        java.lang.Class<?> wildcardClass2 = typeArray0.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass4);
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray7 = new java.lang.reflect.AnnotatedElement[] { wildcardClass2, genericDeclaration6 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray8 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray7 };
        java.lang.reflect.AnnotatedElement[] annotatedElementArray9 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "class java.lang.Object" + "'", str5.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0682");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray7 = new org.apache.commons.lang3.ObjectUtils.Null[][] {};
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(nullArray5, nullArray7);
        java.lang.Class<?> wildcardClass9 = nullArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0683");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1, null2, null3 };
        org.apache.commons.lang3.ObjectUtils.Null null5 = org.apache.commons.lang3.ObjectUtils.mode(nullArray4);
        java.lang.Object obj6 = org.apache.commons.lang3.ObjectUtils.mode((java.lang.Object[]) nullArray4);
        java.lang.Class<?> wildcardClass7 = nullArray4.getClass();
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
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0684");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) (-51.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0685");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) objArray1);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0686");
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(1017436136);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [1017436136]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0687");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull("55", "32");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "55" + "'", str2.equals("55"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0688");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) strArray7);
        java.io.Serializable serializable9 = org.apache.commons.lang3.ObjectUtils.clone((java.io.Serializable) strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0689");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) objectUtilsArray3);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0690");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray2);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        int int9 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 356296810 + "'", int9 == 356296810);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0691");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 3201202.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3201202.0" + "'", str1.equals("3201202.0"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0692");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -5 + "'", short1 == (short) -5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0693");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray2);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.Object[] objArray9 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0694");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass1);
        java.lang.reflect.Type type3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) type3, (java.lang.Object) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "class java.lang.Object" + "'", str2.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0695");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "48" + "'", str1.equals("48"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0696");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0697");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        boolean boolean8 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) nullArray6, (java.lang.Object) 3201202.0f);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0698");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.550056849E9d), obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0699");
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        boolean boolean6 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 97.0d, (java.lang.Object) objectUtilsArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0700");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (short) 0, "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0" + "'", str2.equals("0"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0701");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 35 + "'", short1 == (short) 35);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0702");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Object[]) strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "class java.lang.Object" + "'", str4.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0703");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("-1", "1.46437171E9", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4) + "'", int3 == (-4));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0704");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) 49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0705");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray2 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1 };
        org.apache.commons.lang3.ObjectUtils objectUtils3 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray2);
        org.apache.commons.lang3.ObjectUtils objectUtils4 = new org.apache.commons.lang3.ObjectUtils();
        boolean boolean6 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) objectUtils4, (java.lang.Object) (byte) 10);
        org.apache.commons.lang3.ObjectUtils objectUtils7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtils4);
        org.apache.commons.lang3.ObjectUtils objectUtils8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(objectUtils3, objectUtils7);
        java.lang.Class<?> wildcardClass9 = objectUtils3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0706");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (-5.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-5.0" + "'", str1.equals("-5.0"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0707");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 51 + "'", short1 == (short) 51);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0708");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class org.apache.commons.lang3.ObjectUtils$Null", "-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0709");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) strArray2, (java.lang.Object) "1.0");
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.io.Serializable serializable7 = org.apache.commons.lang3.ObjectUtils.CONST((java.io.Serializable) strArray2);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.ObjectUtils.mode((java.lang.CharSequence[]) strArray2);
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
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "class java.lang.Object" + "'", str9.equals("class java.lang.Object"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0710");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0711");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 3201202.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0712");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100.0" + "'", str1.equals("100.0"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0713");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.Object obj6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Object) strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.toString(obj6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) str7);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0714");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) (byte) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0715");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0716");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0717");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) 55L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0718");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) -48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -48 + "'", short1 == (short) -48);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0719");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0720");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.clone(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray4);
        int int7 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 516960060 + "'", int7 == 516960060);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0721");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray2);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0722");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.clone("3201202.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0723");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0724");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST(57.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0725");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((-2138784939L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2138784939L) + "'", long1 == (-2138784939L));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0726");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) 3201202.0f, (java.lang.Object) "97.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0727");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray3 = new org.apache.commons.lang3.ObjectUtils.Null[] { null0, null1, null2 };
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.mode(nullArray3);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[] { null4 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray6 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray5 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray7 = org.apache.commons.lang3.ObjectUtils.clone(nullArray6);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray8 = org.apache.commons.lang3.ObjectUtils.mode(nullArray7);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray9 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(nullArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null4);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0728");
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
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) nullArray6);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0729");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = org.apache.commons.lang3.ObjectUtils.mode(nullArray5);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) nullArray5);
        java.lang.Class<?> wildcardClass9 = nullArray5.getClass();
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
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0730");
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray0 = null;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray1 = org.apache.commons.lang3.ObjectUtils.mode(nullArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(nullArray1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0731");
        java.lang.reflect.AnnotatedElement annotatedElement0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray1.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(wildcardClass3, wildcardClass6);
        java.lang.reflect.AnnotatedElement annotatedElement8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(annotatedElement0, (java.lang.reflect.AnnotatedElement) wildcardClass3);
        java.lang.Class<?> wildcardClass9 = annotatedElement8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0732");
        java.lang.StringBuilder stringBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        java.lang.Class<?> wildcardClass5 = null2.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.reflect.AnnotatedElement) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(wildcardClass5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) wildcardClass5);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0733");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0734");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) wildcardClass3, (java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) 0);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0735");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.CharSequence) "35.0", (java.lang.CharSequence) "2118744065");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "35.0" + "'", charSequence2.equals("35.0"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0736");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray3 = new org.apache.commons.lang3.ObjectUtils.Null[] { null0, null1, null2 };
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.mode(nullArray3);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray5 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray3);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Object[]) nullArray5);
        int int7 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1756784299) + "'", int7 == (-1756784299));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0737");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.clone(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray4);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0738");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        java.lang.Class<?> wildcardClass1 = objectUtils0.getClass();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object[] objArray3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        java.lang.reflect.Type type5 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0739");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0740");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-2.0f) + "'", float1 == (-2.0f));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0741");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (-5), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-5" + "'", str2.equals("-5"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0742");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("false", "2118744065", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0743");
        java.lang.Appendable appendable0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) strArray3, "");
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
            System.out.format("%n%s%n", "ObjectUtils1.test0744");
        java.lang.reflect.AnnotatedElement annotatedElement0 = null;
        java.lang.reflect.AnnotatedElement annotatedElement1 = org.apache.commons.lang3.ObjectUtils.CONST(annotatedElement0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0745");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        java.lang.Class<?> wildcardClass5 = null2.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.reflect.AnnotatedElement) wildcardClass5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) wildcardClass5);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0746");
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
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) wildcardClass7);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0747");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 3201202);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3201202.0d + "'", double1 == 3201202.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0748");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) objArray1);
        int int3 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray1);
        int int4 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0749");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray2);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray2);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) strArray7, "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0750");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) strArray3);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0751");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-63));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-63.0f) + "'", float1 == (-63.0f));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0752");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray2 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1 };
        org.apache.commons.lang3.ObjectUtils objectUtils3 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray2);
        int int4 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) objectUtilsArray2);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.mode(objectUtilsArray2);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.mode(objectUtilsArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2135054222) + "'", int4 == (-2135054222));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectUtils6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0753");
        java.lang.reflect.Type[][][] typeArray0 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray1 = org.apache.commons.lang3.ObjectUtils.CONST(typeArray0);
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) typeArray0);
        java.lang.reflect.Type[][][] typeArray3 = org.apache.commons.lang3.ObjectUtils.clone(typeArray0);
        int int4 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0754");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int7 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0755");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.Object obj8 = org.apache.commons.lang3.ObjectUtils.mode((java.lang.Object[]) strArray3);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "" + "'", obj8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0756");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("class [Ljava.lang.reflect.Type;", "100.0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0757");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils7 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0758");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) -50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -50 + "'", byte1 == (byte) -50);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0759");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible("class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "class java.lang.Object" + "'", str1.equals("class java.lang.Object"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0760");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-1.0", "31");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0761");
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] { typeArray1, typeArray2 };
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.ObjectUtils.mode(typeArray3);
        java.lang.reflect.Type[][] typeArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray3);
        java.lang.reflect.Type[] typeArray6 = org.apache.commons.lang3.ObjectUtils.mode(typeArray3);
        java.lang.reflect.Type[][] typeArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray3);
        java.io.Serializable serializable8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.io.Serializable) (-5.0f), (java.io.Serializable) typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-5.0f) + "'", serializable8.equals((-5.0f)));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0762");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray7 = org.apache.commons.lang3.ObjectUtils.CONST(objectUtilsArray6);
        java.lang.Class<?> wildcardClass8 = objectUtilsArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0763");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-1.0", "48");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0764");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("-1", "97.0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-12) + "'", int3 == (-12));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0765");
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = org.apache.commons.lang3.ObjectUtils.clone(typeArray1);
        java.lang.Object[] objArray3 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Object[]) typeArray2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 100.0d, (java.lang.Object) objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0766");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        int int7 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 481125985 + "'", int5 == 481125985);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 481125985 + "'", int6 == 481125985);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 481125985 + "'", int7 == 481125985);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0767");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(objectUtils0, objectUtils1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils2);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0768");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        java.lang.Object obj6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Object) strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0769");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0770");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.CONST("1.46437171E9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.46437171E9" + "'", str1.equals("1.46437171E9"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0771");
        java.lang.StringBuilder stringBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray8 = org.apache.commons.lang3.ObjectUtils.CONST(objectUtilsArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) objectUtilsArray8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0772");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) str8);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0773");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0774");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3201202 + "'", int5 == 3201202);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0775");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 49.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "49.0" + "'", str1.equals("49.0"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0776");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-1756784299));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1756784299) + "'", int1 == (-1756784299));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0777");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray3 = new org.apache.commons.lang3.ObjectUtils.Null[] { null0, null1, null2 };
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.mode(nullArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) null4);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) null4);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = new org.apache.commons.lang3.ObjectUtils.Null[] { null4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray8 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray7);
        org.apache.commons.lang3.ObjectUtils.Null null9 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null4);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0778");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) objectUtils0, (java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass3 = objectUtils0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass5);
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.reflect.GenericDeclaration) wildcardClass3, (java.lang.reflect.GenericDeclaration) wildcardClass5);
        java.lang.Class<?> wildcardClass8 = genericDeclaration7.getClass();
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) genericDeclaration7);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0779");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 25.0f + "'", float1 == 25.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0780");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray3 = new org.apache.commons.lang3.ObjectUtils.Null[] { null0, null1, null2 };
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.mode(nullArray3);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[] { null4 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray6 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray5 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray7 = org.apache.commons.lang3.ObjectUtils.clone(nullArray6);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) nullArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0781");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray4);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray4);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.mode(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) str8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0782");
        java.lang.reflect.Type[][][][] typeArray0 = new java.lang.reflect.Type[][][][] {};
        java.lang.reflect.Type[][][] typeArray1 = org.apache.commons.lang3.ObjectUtils.firstNonNull(typeArray0);
        int int2 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0783");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray2 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1 };
        org.apache.commons.lang3.ObjectUtils objectUtils3 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray2);
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray2);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) objectUtilsArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2051775322) + "'", int5 == (-2051775322));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0784");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) objectUtils5);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0785");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 97 + "'", short1 == (short) 97);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0786");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        java.lang.Class<?> wildcardClass4 = null1.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.reflect.GenericDeclaration) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0787");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        java.lang.Class<?> wildcardClass4 = null1.getClass();
        java.lang.reflect.Type type5 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.reflect.Type) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0788");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "1.464371712E9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0789");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (byte) -55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-55.0d) + "'", double1 == (-55.0d));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0790");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (-2033316271), (java.lang.Object) (short) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0791");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray3 = new org.apache.commons.lang3.ObjectUtils.Null[] { null0, null1, null2 };
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.mode(nullArray3);
        java.lang.Object obj5 = org.apache.commons.lang3.ObjectUtils.mode((java.lang.Object[]) nullArray3);
        java.lang.Class<?> wildcardClass6 = nullArray3.getClass();
        java.io.Serializable serializable7 = org.apache.commons.lang3.ObjectUtils.clone((java.io.Serializable) nullArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0792");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) strArray2);
        boolean boolean7 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) objArray5, (java.lang.Object) 22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0793");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement2 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.ObjectUtils.clone(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray5 = org.apache.commons.lang3.ObjectUtils.clone(annotatedElementArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) annotatedElementArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0794");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.ObjectUtils.CONST(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) strArray6);
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
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0795");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals(obj0, (java.lang.Object) 49.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0796");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (short) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 3 + "'", byte1 == (byte) 3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0797");
        org.apache.commons.lang3.ObjectUtils.Null null0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.clone(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(null1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0798");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Comparable<java.lang.String>) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0799");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int7 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0800");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-1550056849));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1550056849L) + "'", long1 == (-1550056849L));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0801");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 1.464371712E9d, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.464371712E9" + "'", str2.equals("1.464371712E9"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0802");
        java.lang.reflect.Type[][][] typeArray0 = null;
        java.lang.reflect.Type[][] typeArray1 = org.apache.commons.lang3.ObjectUtils.mode(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0803");
        java.io.Serializable serializable1 = org.apache.commons.lang3.ObjectUtils.clone((java.io.Serializable) 50L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0804");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0805");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.0d + "'", double1 == 31.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0806");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 31L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0807");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 50 + "'", byte1 == (byte) 50);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0808");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.0d + "'", double1 == 13.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0809");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST(35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0810");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 1.46437171E9f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0811");
        java.lang.Appendable appendable0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass2);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.reflect.Type) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) type4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "class java.lang.Object" + "'", str3.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0812");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 4.0f, "3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.0" + "'", str2.equals("4.0"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0813");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0814");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (-7));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-7" + "'", str1.equals("-7"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0815");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) -48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-48L) + "'", long1 == (-48L));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0816");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 10.0d, (java.lang.Object) (-8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0817");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0818");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0819");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (byte) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0820");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((-46));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -46 + "'", byte1 == (byte) -46);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0821");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Comparable<java.lang.String>) "97.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "97.0" + "'", strComparable1.equals("97.0"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0822");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray2);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.median(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0823");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.reflect.GenericDeclaration) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) genericDeclaration4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "class java.lang.Object" + "'", str3.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0824");
        java.lang.Appendable appendable0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
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
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0825");
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(1464371706);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [1464371706]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0826");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0827");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "class java.lang.Object" + "'", str4.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "class java.lang.Object" + "'", str8.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0828");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.ObjectUtils.clone(typeArray0);
        java.lang.Class<?> wildcardClass2 = typeArray0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.reflect.GenericDeclaration) wildcardClass2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) genericDeclaration3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0829");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) strArray2);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray2);
        java.lang.Object[] objArray7 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0830");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0831");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) -55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -55 + "'", byte1 == (byte) -55);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0832");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0833");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) -46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -46 + "'", short1 == (short) -46);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0834");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("3", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0835");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-1.0", "49.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0836");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 35 + "'", short1 == (short) 35);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0837");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0838");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] { typeArray1, typeArray2 };
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.ObjectUtils.mode(typeArray3);
        java.lang.reflect.Type[][] typeArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray3);
        java.lang.reflect.Type[][] typeArray6 = org.apache.commons.lang3.ObjectUtils.clone(typeArray5);
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.ObjectUtils.mode(typeArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) typeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0839");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray7 = org.apache.commons.lang3.ObjectUtils.CONST(objectUtilsArray6);
        int int8 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) objectUtilsArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-561859767) + "'", int8 == (-561859767));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0840");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.clone(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray4);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0841");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-306834496));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.06834496E8d) + "'", double1 == (-3.06834496E8d));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0842");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 2L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0843");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray3 = new org.apache.commons.lang3.ObjectUtils.Null[] { null0, null1, null2 };
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.mode(nullArray3);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[] { null4 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray6 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray5 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray7 = org.apache.commons.lang3.ObjectUtils.clone(nullArray6);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray8 = org.apache.commons.lang3.ObjectUtils.mode(nullArray7);
        int int9 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) nullArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512934869 + "'", int9 == 512934869);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0844");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0845");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) (-59L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0846");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 71.0f + "'", float1 == 71.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0847");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0848");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 5 + "'", short1 == (short) 5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0849");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("true", "-5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 71 + "'", int2 == 71);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0850");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST(1.01743616E9f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.01743616E9f + "'", float1 == 1.01743616E9f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0851");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.clone(null1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) null1);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0852");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = org.apache.commons.lang3.ObjectUtils.mode(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(nullArray5);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) nullArray8);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0853");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0854");
        java.lang.StringBuilder stringBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.clone(null1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) null3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(null3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0855");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0856");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.CONST(null0);
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(null1);
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.clone(null2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = null3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0857");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-25));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-25) + "'", int1 == (-25));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0858");
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((-561859767));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [-561859767]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0859");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 57.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0860");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0861");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.clone(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.min(strArray6);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0862");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1, null2, null3 };
        org.apache.commons.lang3.ObjectUtils.Null null5 = org.apache.commons.lang3.ObjectUtils.mode(nullArray4);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) nullArray6);
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
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0863");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 5 + "'", short1 == (short) 5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0864");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.ObjectUtils.clone(typeArray0);
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Object[]) typeArray1);
        java.lang.reflect.Type[] typeArray3 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.ObjectUtils.clone(typeArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) typeArray3);
        java.lang.reflect.Type[] typeArray6 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(typeArray1, typeArray3);
        java.lang.Class<?> wildcardClass7 = typeArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0865");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = org.apache.commons.lang3.ObjectUtils.mode(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(nullArray7);
        java.lang.Object obj9 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[]) nullArray8);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0866");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-561859767));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-561859767L) + "'", long1 == (-561859767L));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0867");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Comparable<java.lang.String>) "49.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0868");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-47));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-47) + "'", int1 == (-47));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0869");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0870");
        java.lang.StringBuilder stringBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtilsArray4);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) objectUtilsArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) objArray8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0871");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-5", "1005632854");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0872");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray7 = org.apache.commons.lang3.ObjectUtils.CONST(objectUtilsArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) objectUtilsArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0873");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Comparable<java.lang.String>) "1.464371712E9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "1.464371712E9" + "'", strComparable1.equals("1.464371712E9"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0874");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2" + "'", str1.equals("2"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0875");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 1017436136);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1017436136L + "'", long1 == 1017436136L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0876");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "0", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 56 + "'", int3 == 56);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0877");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 3201202.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0878");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) (-2.138784939E9d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0879");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0880");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-1550056849));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1550056849) + "'", int1 == (-1550056849));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0881");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 55 + "'", short1 == (short) 55);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0882");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 49 + "'", short1 == (short) 49);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0883");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        int int4 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3201202 + "'", int4 == 3201202);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0884");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        java.lang.Class<?> wildcardClass4 = null1.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement5 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.reflect.AnnotatedElement) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(wildcardClass4);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.reflect.AnnotatedElement) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0885");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray4);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray4);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) str8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0886");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((-8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -8 + "'", short1 == (short) -8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0887");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(wildcardClass2, wildcardClass4);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "class java.lang.Object" + "'", str6.equals("class java.lang.Object"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0888");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (byte) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0889");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray3 = new org.apache.commons.lang3.ObjectUtils.Null[] { null0, null1, null2 };
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.mode(nullArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) null4);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) null4);
        java.lang.Class<?> wildcardClass7 = null4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0890");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 3 + "'", byte1 == (byte) 3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0891");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.ObjectUtils.clone(typeArray0);
        java.lang.reflect.Type[] typeArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray1);
        int int3 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0892");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = org.apache.commons.lang3.ObjectUtils.mode(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(nullArray7);
        org.apache.commons.lang3.ObjectUtils.Null null9 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray8);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0893");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.Class<?> wildcardClass2 = objArray0.getClass();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.Object[] objArray4 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray3);
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(wildcardClass2, wildcardClass5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.reflect.AnnotatedElement) wildcardClass6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) wildcardClass6);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass6);
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "class [Ljava.lang.Object;" + "'", str9.equals("class [Ljava.lang.Object;"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0894");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0895");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.CONST("3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3" + "'", str1.equals("3"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0896");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement2 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.ObjectUtils.clone(annotatedElementArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) annotatedElementArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0897");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("1.46437171E9", "class [Ljava.lang.Object;", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-50) + "'", int3 == (-50));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0898");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1, null2, null3 };
        org.apache.commons.lang3.ObjectUtils.Null null5 = org.apache.commons.lang3.ObjectUtils.mode(nullArray4);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.Object[] objArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray6);
        boolean boolean8 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) nullArray4, (java.lang.Object) objArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) objArray6);
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
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0899");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.CONST("class [Ljava.lang.Object;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "class [Ljava.lang.Object;" + "'", str1.equals("class [Ljava.lang.Object;"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0900");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class org.apache.commons.lang3.ObjectUtils$Null", "-5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0901");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0902");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) 49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 49L + "'", long1 == 49L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0903");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class [Ljava.lang.reflect.Type;", "32");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0904");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0905");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[] { null2 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray6 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray5 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray6);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray8 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) nullArray7);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0906");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (short) -8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-8" + "'", str1.equals("-8"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0907");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "class java.lang.Object" + "'", str4.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0908");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("48", "3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0909");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0910");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray4 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][][] typeArray5 = new java.lang.reflect.Type[][][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4 };
        java.lang.reflect.Type[][] typeArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(typeArray5);
        java.lang.reflect.Type[][][] typeArray7 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(typeArray5, typeArray7);
        java.lang.reflect.Type[][][] typeArray9 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0911");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-7", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-52) + "'", int2 == (-52));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0912");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 1119249155);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1119249155L + "'", long1 == 1119249155L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0913");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("-1", "3", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-6) + "'", int3 == (-6));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0914");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0915");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 3277121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3277121.0d + "'", double1 == 3277121.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0916");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0917");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.mode(objectUtilsArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) objectUtilsArray4);
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
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0918");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 49L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 49.0f + "'", float1 == 49.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0919");
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((-2051775322));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [-2051775322]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0920");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] { typeArray0, typeArray1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.ObjectUtils.mode(typeArray2);
        java.lang.reflect.Type[][] typeArray4 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray2);
        java.lang.reflect.Type[][] typeArray5 = org.apache.commons.lang3.ObjectUtils.clone(typeArray4);
        java.lang.reflect.Type[] typeArray6 = org.apache.commons.lang3.ObjectUtils.mode(typeArray5);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0921");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.CharSequence) "32");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "32" + "'", charSequence1.equals("32"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0922");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtilsArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) objectUtilsArray6);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray8 = org.apache.commons.lang3.ObjectUtils.CONST(objectUtilsArray6);
        int int9 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) objectUtilsArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-829723542) + "'", int9 == (-829723542));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0923");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 55 + "'", int1 == 55);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0924");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (-306834496), (java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(wildcardClass2);
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.reflect.GenericDeclaration) wildcardClass5);
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.reflect.GenericDeclaration) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0925");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        boolean boolean7 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) objectUtilsArray3, (java.lang.Object) 52.0d);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray8 = org.apache.commons.lang3.ObjectUtils.clone(objectUtilsArray3);
        int int9 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1032340634 + "'", int9 == 1032340634);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0926");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray8 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray7);
        java.lang.Object[] objArray9 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) nullArray7);
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
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0927");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("3", "100.0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0928");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 13L + "'", long1 == 13L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0929");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 48 + "'", short1 == (short) 48);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0930");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-14425837));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4425837E7d) + "'", double1 == (-1.4425837E7d));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0931");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) -46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -46 + "'", byte1 == (byte) -46);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0932");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0933");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray2 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1 };
        org.apache.commons.lang3.ObjectUtils objectUtils3 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray2);
        int int4 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) objectUtilsArray2);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.mode(objectUtilsArray2);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) objectUtilsArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 504536152 + "'", int4 == 504536152);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectUtils5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 504536152 + "'", int6 == 504536152);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0934");
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = org.apache.commons.lang3.ObjectUtils.clone(typeArray1);
        java.lang.Object[] objArray3 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Object[]) typeArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) objArray3);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1756784299), (java.lang.Object) str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0935");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (-2051775322));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-2051775322" + "'", str1.equals("-2051775322"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0936");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] { typeArray0, typeArray1, typeArray2 };
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(typeArray3);
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.ObjectUtils.CONST(typeArray4);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) typeArray4);
        java.lang.reflect.Type[] typeArray7 = null;
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(typeArray4, typeArray7);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) typeArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0937");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "class java.lang.Object" + "'", str4.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "class java.lang.Object" + "'", str5.equals("class java.lang.Object"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0938");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0939");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.Class<?> wildcardClass2 = objArray0.getClass();
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0940");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "class java.lang.Object" + "'", str4.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "class java.lang.Object" + "'", str8.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "class java.lang.Object" + "'", str9.equals("class java.lang.Object"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0941");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-12));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-12L) + "'", long1 == (-12L));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0942");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.Object obj5 = org.apache.commons.lang3.ObjectUtils.mode((java.lang.Object[]) strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0943");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) (-2138784939));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0944");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("31", "100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0945");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (byte) -50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-50.0d) + "'", double1 == (-50.0d));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0946");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-5.0", "-2051775322");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0947");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "-2051775322");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0948");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) objArray1);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0949");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray3 = new org.apache.commons.lang3.ObjectUtils.Null[] { null0, null1, null2 };
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.mode(nullArray3);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray5 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray3);
        boolean boolean7 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) nullArray5, (java.lang.Object) 1.56130835E8d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0950");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        int int4 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) strArray2, "-1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3201202 + "'", int4 == 3201202);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0951");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("-1.0", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0952");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (short) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0953");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray3 = new org.apache.commons.lang3.ObjectUtils.Null[] { null0, null1, null2 };
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.mode(nullArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) null4);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) null4);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) null4, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0954");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) (-2033316271));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0955");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 13L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 13.0f + "'", float1 == 13.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0956");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        java.lang.Class<?> wildcardClass5 = objectUtils4.getClass();
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0957");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 54L + "'", long1 == 54L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0958");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-4));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-4.0f) + "'", float1 == (-4.0f));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0959");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-829723542));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-829723542L) + "'", long1 == (-829723542L));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0960");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) strArray2, (java.lang.Object) "1.0");
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        int int7 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-389202921) + "'", int7 == (-389202921));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0961");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) (-12L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0962");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) objectUtils6);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0963");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-6));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-6.0f) + "'", float1 == (-6.0f));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0964");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-5L) + "'", long1 == (-5L));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0965");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        boolean boolean6 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) strArray3, (java.lang.Object) "1.0");
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.io.Serializable serializable8 = org.apache.commons.lang3.ObjectUtils.CONST((java.io.Serializable) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) serializable8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "class java.lang.Object" + "'", str7.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0966");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) "-55");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0967");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("", "100.0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-5) + "'", int3 == (-5));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0968");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0969");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) "100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0970");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray3 = new org.apache.commons.lang3.ObjectUtils.Null[] { null0, null1, null2 };
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.mode(nullArray3);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray5 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray3);
        java.lang.Class<?> wildcardClass6 = nullArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0971");
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElementArray1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0972");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-99682442));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.9682442E7d) + "'", double1 == (-9.9682442E7d));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0973");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("97.0", "-55", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0974");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.ObjectUtils.CONST(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) strArray5);
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
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0975");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual(obj0, (java.lang.Object) 49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0976");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray3 = new org.apache.commons.lang3.ObjectUtils.Null[] { null0, null1, null2 };
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.mode(nullArray3);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray5 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray3);
        org.apache.commons.lang3.ObjectUtils.Null null6 = org.apache.commons.lang3.ObjectUtils.mode(nullArray5);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null6);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0977");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0978");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 51L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 51.0f + "'", float1 == 51.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0979");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST(54L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 54L + "'", long1 == 54L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0980");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 50L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 50.0f + "'", float1 == 50.0f);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0981");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Comparable<java.lang.String>) "55");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "55" + "'", strComparable1.equals("55"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0982");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((-51.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-51.0f) + "'", float1 == (-51.0f));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0983");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement2 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(annotatedElementArray1);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-50L), (java.lang.Object) annotatedElementArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) annotatedElementArray3);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) annotatedElementArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0984");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.CharSequence) "1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0985");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 2118744065);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2118744065L + "'", long1 == 2118744065L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0986");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = org.apache.commons.lang3.ObjectUtils.clone(typeArray1);
        java.lang.Class<?> wildcardClass3 = typeArray1.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.reflect.GenericDeclaration) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration4);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0987");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, (-1), (-1L), 100.0f };
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray5);
        java.lang.Class<?> wildcardClass7 = objArray5.getClass();
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) str8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-306834496) + "'", int6 == (-306834496));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0988");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0989");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        java.lang.Class<?> wildcardClass5 = objectUtils4.getClass();
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "class org.apache.commons.lang3.ObjectUtils" + "'", str6.equals("class org.apache.commons.lang3.ObjectUtils"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0990");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("-8", "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-59) + "'", int3 == (-59));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0991");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0992");
        java.lang.StringBuilder stringBuilder0 = null;
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
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) objectUtilsArray7);
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
            System.out.format("%n%s%n", "ObjectUtils1.test0993");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (byte) -55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-55) + "'", int1 == (-55));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0994");
        java.lang.Appendable appendable0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3201202 + "'", int5 == 3201202);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0995");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("100", "3201202.0", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0996");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("35.0", "100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0997");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0998");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 3.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3.0" + "'", str1.equals("3.0"));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test0999");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("", "class [Ljava.lang.reflect.Type;", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-31) + "'", int3 == (-31));
    }

    @Test
    public void ObjectUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.test1000");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(strComparable0, (java.lang.Comparable<java.lang.String>) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + "0" + "'", strComparable2.equals("0"));
    }
}
