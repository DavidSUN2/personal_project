package ObjectUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ObjectUtils1 {

    public static boolean debug = false;

    @Test
    public void ObjectUtils0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0501");
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + "" + "'", strComparable2.equals(""));
    }

    @Test
    public void ObjectUtils0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0502");
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
    public void ObjectUtils0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0503");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("1.464371712E9", "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void ObjectUtils0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0504");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (short) -55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-55" + "'", str1.equals("-55"));
    }

    @Test
    public void ObjectUtils0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0505");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) "-5");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0506");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 49L + "'", long1 == 49L);
    }

    @Test
    public void ObjectUtils0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0507");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-1.0", "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void ObjectUtils0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0508");
        java.lang.Object[] objArray0 = null;
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.clone(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objArray1);
    }

    @Test
    public void ObjectUtils0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0509");
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
    public void ObjectUtils0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0510");
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
    public void ObjectUtils0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0511");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0512");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) "1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0513");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) "31");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0514");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void ObjectUtils0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0515");
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
    public void ObjectUtils0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0516");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void ObjectUtils0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0517");
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
    public void ObjectUtils0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0518");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("35.0", "3201202.0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void ObjectUtils0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0519");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void ObjectUtils0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0520");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) objectUtils1, (java.lang.Object) (byte) 10);
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtils1);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0521");
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
    public void ObjectUtils0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0522");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("", "class [Ljava.lang.Object;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-25) + "'", int2 == (-25));
    }

    @Test
    public void ObjectUtils0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0523");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 49 + "'", short1 == (short) 49);
    }

    @Test
    public void ObjectUtils0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0524");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0525");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) "1.46437171E9");
    }

    @Test
    public void ObjectUtils0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0526");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void ObjectUtils0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0527");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 10.0f, (java.lang.Object) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0528");
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
    public void ObjectUtils0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0529");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void ObjectUtils0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0530");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0531");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void ObjectUtils0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0532");
        java.lang.reflect.Type[] typeArray0 = null;
        java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.ObjectUtils.CONST(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray1);
    }

    @Test
    public void ObjectUtils0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0533");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 4);
    }

    @Test
    public void ObjectUtils0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0534");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.ObjectUtils.clone(strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray5);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0535");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (short) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 32 + "'", byte1 == (byte) 32);
    }

    @Test
    public void ObjectUtils0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0536");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void ObjectUtils0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0537");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) "-1.0", obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0538");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void ObjectUtils0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0539");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-5));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-5.0f) + "'", float1 == (-5.0f));
    }

    @Test
    public void ObjectUtils0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0540");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-1550056849));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.550056849E9d) + "'", double1 == (-1.550056849E9d));
    }

    @Test
    public void ObjectUtils0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0541");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0542");
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
    public void ObjectUtils0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0543");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 31L + "'", long1 == 31L);
    }

    @Test
    public void ObjectUtils0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0544");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (short) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 55.0f + "'", float1 == 55.0f);
    }

    @Test
    public void ObjectUtils0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0545");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) (short) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0546");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (-5));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-5" + "'", str1.equals("-5"));
    }

    @Test
    public void ObjectUtils0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0547");
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
    public void ObjectUtils0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0548");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        int int7 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0549");
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
    public void ObjectUtils0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0550");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("false", "-55", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 57 + "'", int3 == 57);
    }

    @Test
    public void ObjectUtils0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0551");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
    }

    @Test
    public void ObjectUtils0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0552");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement4 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.reflect.AnnotatedElement) wildcardClass3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0553");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (short) 3, "class org.apache.commons.lang3.ObjectUtils$Null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3" + "'", str2.equals("3"));
    }

    @Test
    public void ObjectUtils0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0554");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1" + "'", str1.equals("-1"));
    }

    @Test
    public void ObjectUtils0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0555");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((-3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -3 + "'", byte1 == (byte) -3);
    }

    @Test
    public void ObjectUtils0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0556");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) "3");
    }

    @Test
    public void ObjectUtils0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0557");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1" + "'", str1.equals("-1"));
    }

    @Test
    public void ObjectUtils0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0558");
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
    public void ObjectUtils0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0559");
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
    public void ObjectUtils0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0560");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 49.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0561");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-1", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-59) + "'", int2 == (-59));
    }

    @Test
    public void ObjectUtils0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0562");
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
    public void ObjectUtils0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0563");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 35 + "'", byte1 == (byte) 35);
    }

    @Test
    public void ObjectUtils0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0564");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.Object[] objArray7 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0565");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (short) -55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -55 + "'", byte1 == (byte) -55);
    }

    @Test
    public void ObjectUtils0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0566");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (-5), "2118744065");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-5" + "'", str2.equals("-5"));
    }

    @Test
    public void ObjectUtils0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0567");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Comparable<java.lang.String>) "class org.apache.commons.lang3.ObjectUtils$Null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "class org.apache.commons.lang3.ObjectUtils$Null" + "'", strComparable1.equals("class org.apache.commons.lang3.ObjectUtils$Null"));
    }

    @Test
    public void ObjectUtils0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0568");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void ObjectUtils0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0569");
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
    public void ObjectUtils0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0570");
        java.lang.Appendable appendable0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        boolean boolean6 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) strArray3, (java.lang.Object) "1.0");
        java.lang.Object[] objArray7 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0571");
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
    public void ObjectUtils0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0572");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("1.464371712E9", "class [Ljava.lang.Object;", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-50) + "'", int3 == (-50));
    }

    @Test
    public void ObjectUtils0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0573");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0574");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0575");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("35.0", "3", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void ObjectUtils0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0576");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-306834496));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-306834496L) + "'", long1 == (-306834496L));
    }

    @Test
    public void ObjectUtils0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0577");
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
    public void ObjectUtils0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0578");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 50 + "'", short1 == (short) 50);
    }

    @Test
    public void ObjectUtils0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0579");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-55", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void ObjectUtils0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0580");
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
    public void ObjectUtils0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0581");
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
    public void ObjectUtils0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0582");
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((-306834496));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [-306834496]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0583");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 0L);
    }

    @Test
    public void ObjectUtils0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0584");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0585");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("2118744065", "0", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void ObjectUtils0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0586");
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((-575714536));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -128 and 127: [-575714536]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0587");
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
    public void ObjectUtils0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0588");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] { typeArray1, typeArray2 };
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.ObjectUtils.mode(typeArray3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0589");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 3277121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3277121L + "'", long1 == 3277121L);
    }

    @Test
    public void ObjectUtils0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0590");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 1017436136);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.01743616E9f + "'", float1 == 1.01743616E9f);
    }

    @Test
    public void ObjectUtils0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0591");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.CONST("false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "false" + "'", str1.equals("false"));
    }

    @Test
    public void ObjectUtils0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0592");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 55L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 55.0f + "'", float1 == 55.0f);
    }

    @Test
    public void ObjectUtils0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0593");
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
    public void ObjectUtils0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0594");
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
    public void ObjectUtils0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0595");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (short) 50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 50 + "'", short1 == (short) 50);
    }

    @Test
    public void ObjectUtils0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0596");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 50 + "'", short1 == (short) 50);
    }

    @Test
    public void ObjectUtils0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0597");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) (short) 32);
    }

    @Test
    public void ObjectUtils0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0598");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 13);
    }

    @Test
    public void ObjectUtils0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0599");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.clone(strComparable0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void ObjectUtils0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0600");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 55 + "'", int3 == 55);
    }

    @Test
    public void ObjectUtils0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0601");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void ObjectUtils0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0602");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST(51L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 51L + "'", long1 == 51L);
    }

    @Test
    public void ObjectUtils0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0603");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) "0");
    }

    @Test
    public void ObjectUtils0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0604");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0605");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 51, (java.lang.Object) (-48));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0606");
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
    public void ObjectUtils0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0607");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 97.0d, "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97.0" + "'", str2.equals("97.0"));
    }

    @Test
    public void ObjectUtils0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0608");
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
    public void ObjectUtils0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0609");
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
    public void ObjectUtils0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0610");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 55 + "'", byte1 == (byte) 55);
    }

    @Test
    public void ObjectUtils0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0611");
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
    public void ObjectUtils0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0612");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(897479465);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 897479465 + "'", int1 == 897479465);
    }

    @Test
    public void ObjectUtils0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0613");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) 50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 50L + "'", long1 == 50L);
    }

    @Test
    public void ObjectUtils0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0614");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 4 + "'", byte1 == (byte) 4);
    }

    @Test
    public void ObjectUtils0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0615");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0616");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-55));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-55L) + "'", long1 == (-55L));
    }

    @Test
    public void ObjectUtils0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0617");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 156130835);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.56130835E8d + "'", double1 == 1.56130835E8d);
    }

    @Test
    public void ObjectUtils0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0618");
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
    public void ObjectUtils0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0619");
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
    public void ObjectUtils0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0620");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) (-5L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0621");
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
    public void ObjectUtils0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0622");
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
    public void ObjectUtils0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0623");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("", "class org.apache.commons.lang3.ObjectUtils$Null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void ObjectUtils0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0624");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) -3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -3 + "'", byte1 == (byte) -3);
    }

    @Test
    public void ObjectUtils0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0625");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("1.0", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void ObjectUtils0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0626");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] { typeArray1, typeArray2 };
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.ObjectUtils.mode(typeArray3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0627");
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
    public void ObjectUtils0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0628");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((-50.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-50.0d) + "'", double1 == (-50.0d));
    }

    @Test
    public void ObjectUtils0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0629");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.CharSequence) "31");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void ObjectUtils0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0630");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void ObjectUtils0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0631");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement4 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.reflect.AnnotatedElement) wildcardClass3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) annotatedElement4);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0632");
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
    public void ObjectUtils0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0633");
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
    public void ObjectUtils0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0634");
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.Comparable<java.lang.String>) "-5", (java.lang.Comparable<java.lang.String>) "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + "-5" + "'", strComparable2.equals("-5"));
    }

    @Test
    public void ObjectUtils0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0635");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void ObjectUtils0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0636");
        java.lang.Appendable appendable0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray7);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0637");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(1005632854);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1005632854 + "'", int1 == 1005632854);
    }

    @Test
    public void ObjectUtils0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0638");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-59));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-59L) + "'", long1 == (-59L));
    }

    @Test
    public void ObjectUtils0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0639");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-1", "55");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void ObjectUtils0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0640");
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.Comparable<java.lang.String>) "class [Ljava.lang.Object;", (java.lang.Comparable<java.lang.String>) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + "class [Ljava.lang.Object;" + "'", strComparable2.equals("class [Ljava.lang.Object;"));
    }

    @Test
    public void ObjectUtils0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0641");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-2138784939));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2138784939L) + "'", long1 == (-2138784939L));
    }

    @Test
    public void ObjectUtils0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0642");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 55.0f + "'", float1 == 55.0f);
    }

    @Test
    public void ObjectUtils0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0643");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 1005632854);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1005632854L + "'", long1 == 1005632854L);
    }

    @Test
    public void ObjectUtils0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0644");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0645");
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
    public void ObjectUtils0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0646");
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
    public void ObjectUtils0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0647");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST(32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void ObjectUtils0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0648");
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
    public void ObjectUtils0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0649");
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
    public void ObjectUtils0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0650");
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
    public void ObjectUtils0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0651");
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
    public void ObjectUtils0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0652");
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(1119249155);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [1119249155]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0653");
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
    public void ObjectUtils0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0654");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void ObjectUtils0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0655");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = org.apache.commons.lang3.ObjectUtils.clone(typeArray1);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0656");
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
    public void ObjectUtils0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0657");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 1005632854, "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1005632854" + "'", str2.equals("1005632854"));
    }

    @Test
    public void ObjectUtils0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0658");
        java.io.Serializable[] serializableArray0 = null;
        java.io.Serializable serializable1 = org.apache.commons.lang3.ObjectUtils.firstNonNull(serializableArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void ObjectUtils0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0659");
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
    public void ObjectUtils0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0660");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("-55", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void ObjectUtils0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0661");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("55", "true", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-63) + "'", int3 == (-63));
    }

    @Test
    public void ObjectUtils0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0662");
        java.lang.Appendable appendable0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0663");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 3 + "'", short1 == (short) 3);
    }

    @Test
    public void ObjectUtils0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0664");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("35.0", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-46) + "'", int2 == (-46));
    }

    @Test
    public void ObjectUtils0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0665");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST(3201202L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3201202L + "'", long1 == 3201202L);
    }

    @Test
    public void ObjectUtils0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0666");
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
    public void ObjectUtils0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0667");
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
    public void ObjectUtils0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0668");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("true", "-1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 71 + "'", int2 == 71);
    }

    @Test
    public void ObjectUtils0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0669");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (short) 32, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32" + "'", str2.equals("32"));
    }

    @Test
    public void ObjectUtils0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0670");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 97 + "'", byte1 == (byte) 97);
    }

    @Test
    public void ObjectUtils0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0671");
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
    public void ObjectUtils0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0672");
        java.lang.Appendable appendable0 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement2 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.ObjectUtils.clone(annotatedElementArray1);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0673");
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
    public void ObjectUtils0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0674");
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
    public void ObjectUtils0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0675");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((-48));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -48 + "'", short1 == (short) -48);
    }

    @Test
    public void ObjectUtils0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0676");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("32", "1", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void ObjectUtils0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0677");
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
    public void ObjectUtils0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0678");
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(3277121);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [3277121]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0679");
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
    public void ObjectUtils0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0680");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void ObjectUtils0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0681");
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
    public void ObjectUtils0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0682");
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
    public void ObjectUtils0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0683");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1, null2, null3 };
        org.apache.commons.lang3.ObjectUtils.Null null5 = org.apache.commons.lang3.ObjectUtils.mode(nullArray4);
        java.lang.Object obj6 = org.apache.commons.lang3.ObjectUtils.mode((java.lang.Object[]) nullArray4);
        java.lang.Class<?> wildcardClass7 = nullArray4.getClass();
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
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ObjectUtils0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0684");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) (-51.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0685");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0686");
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(1017436136);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [1017436136]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0687");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull("55", "32");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "55" + "'", str2.equals("55"));
    }

    @Test
    public void ObjectUtils0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0688");
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
    public void ObjectUtils0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0689");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0690");
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
    public void ObjectUtils0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0691");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 3201202.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3201202.0" + "'", str1.equals("3201202.0"));
    }

    @Test
    public void ObjectUtils0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0692");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -5 + "'", short1 == (short) -5);
    }

    @Test
    public void ObjectUtils0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0693");
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
    public void ObjectUtils0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0694");
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
    public void ObjectUtils0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0695");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "48" + "'", str1.equals("48"));
    }

    @Test
    public void ObjectUtils0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0696");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void ObjectUtils0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0697");
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
    public void ObjectUtils0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0698");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.550056849E9d), obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0699");
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
    public void ObjectUtils0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0700");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (short) 0, "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0" + "'", str2.equals("0"));
    }

    @Test
    public void ObjectUtils0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0701");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 35 + "'", short1 == (short) 35);
    }

    @Test
    public void ObjectUtils0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0702");
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
    public void ObjectUtils0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0703");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("-1", "1.46437171E9", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4) + "'", int3 == (-4));
    }

    @Test
    public void ObjectUtils0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0704");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) 49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0705");
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
    public void ObjectUtils0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0706");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (-5.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-5.0" + "'", str1.equals("-5.0"));
    }

    @Test
    public void ObjectUtils0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0707");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 51 + "'", short1 == (short) 51);
    }

    @Test
    public void ObjectUtils0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0708");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class org.apache.commons.lang3.ObjectUtils$Null", "-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void ObjectUtils0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0709");
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
    public void ObjectUtils0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0710");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void ObjectUtils0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0711");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 3201202.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0712");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100.0" + "'", str1.equals("100.0"));
    }

    @Test
    public void ObjectUtils0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0713");
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
    public void ObjectUtils0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0714");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) (byte) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0715");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void ObjectUtils0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0716");
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
    public void ObjectUtils0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0717");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) 55L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0718");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) -48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -48 + "'", short1 == (short) -48);
    }

    @Test
    public void ObjectUtils0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0719");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void ObjectUtils0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0720");
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
    public void ObjectUtils0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0721");
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
    public void ObjectUtils0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0722");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.clone("3201202.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void ObjectUtils0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0723");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void ObjectUtils0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0724");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST(57.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void ObjectUtils0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0725");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((-2138784939L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2138784939L) + "'", long1 == (-2138784939L));
    }

    @Test
    public void ObjectUtils0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0726");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) 3201202.0f, (java.lang.Object) "97.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0727");
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
    public void ObjectUtils0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0728");
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
    public void ObjectUtils0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0729");
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
    public void ObjectUtils0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0730");
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray0 = null;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray1 = org.apache.commons.lang3.ObjectUtils.mode(nullArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(nullArray1);
    }

    @Test
    public void ObjectUtils0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0731");
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
    public void ObjectUtils0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0732");
        java.lang.StringBuilder stringBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        java.lang.Class<?> wildcardClass5 = null2.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.reflect.AnnotatedElement) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(wildcardClass5);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0733");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0734");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) wildcardClass3, (java.lang.Object) 0);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0735");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.CharSequence) "35.0", (java.lang.CharSequence) "2118744065");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "35.0" + "'", charSequence2.equals("35.0"));
    }

    @Test
    public void ObjectUtils0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0736");
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
    public void ObjectUtils0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0737");
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
    public void ObjectUtils0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0738");
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
    public void ObjectUtils0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0739");
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
    public void ObjectUtils0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0740");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-2.0f) + "'", float1 == (-2.0f));
    }

    @Test
    public void ObjectUtils0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0741");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (-5), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-5" + "'", str2.equals("-5"));
    }

    @Test
    public void ObjectUtils0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0742");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("false", "2118744065", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void ObjectUtils0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0743");
        java.lang.Appendable appendable0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) strArray3, "");
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
    public void ObjectUtils0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0744");
        java.lang.reflect.AnnotatedElement annotatedElement0 = null;
        java.lang.reflect.AnnotatedElement annotatedElement1 = org.apache.commons.lang3.ObjectUtils.CONST(annotatedElement0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement1);
    }

    @Test
    public void ObjectUtils0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0745");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        java.lang.Class<?> wildcardClass5 = null2.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.reflect.AnnotatedElement) wildcardClass5);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0746");
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
    public void ObjectUtils0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0747");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 3201202);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3201202.0d + "'", double1 == 3201202.0d);
    }

    @Test
    public void ObjectUtils0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0748");
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
    public void ObjectUtils0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0749");
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
    public void ObjectUtils0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0750");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0751");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-63));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-63.0f) + "'", float1 == (-63.0f));
    }

    @Test
    public void ObjectUtils0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0752");
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
    public void ObjectUtils0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0753");
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
    public void ObjectUtils0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0754");
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
    public void ObjectUtils0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0755");
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
    public void ObjectUtils0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0756");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("class [Ljava.lang.reflect.Type;", "100.0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
    }

    @Test
    public void ObjectUtils0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0757");
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
    public void ObjectUtils0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0758");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) -50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -50 + "'", byte1 == (byte) -50);
    }

    @Test
    public void ObjectUtils0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0759");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible("class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "class java.lang.Object" + "'", str1.equals("class java.lang.Object"));
    }

    @Test
    public void ObjectUtils0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0760");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-1.0", "31");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void ObjectUtils0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0761");
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
    public void ObjectUtils0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0762");
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
    public void ObjectUtils0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0763");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-1.0", "48");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void ObjectUtils0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0764");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("-1", "97.0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-12) + "'", int3 == (-12));
    }

    @Test
    public void ObjectUtils0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0765");
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
    public void ObjectUtils0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0766");
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
    public void ObjectUtils0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0767");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(objectUtils0, objectUtils1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils2);
    }

    @Test
    public void ObjectUtils0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0768");
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
    public void ObjectUtils0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0769");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0770");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.CONST("1.46437171E9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.46437171E9" + "'", str1.equals("1.46437171E9"));
    }

    @Test
    public void ObjectUtils0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0771");
        java.lang.StringBuilder stringBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray8 = org.apache.commons.lang3.ObjectUtils.CONST(objectUtilsArray7);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0772");
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
    public void ObjectUtils0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0773");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0774");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0775");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 49.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "49.0" + "'", str1.equals("49.0"));
    }

    @Test
    public void ObjectUtils0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0776");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-1756784299));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1756784299) + "'", int1 == (-1756784299));
    }

    @Test
    public void ObjectUtils0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0777");
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
    public void ObjectUtils0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0778");
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
    public void ObjectUtils0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0779");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 25.0f + "'", float1 == 25.0f);
    }

    @Test
    public void ObjectUtils0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0780");
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
    public void ObjectUtils0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0781");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray4);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray4);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.mode(strArray4);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0782");
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
    public void ObjectUtils0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0783");
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
    public void ObjectUtils0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0784");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0785");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 97 + "'", short1 == (short) 97);
    }

    @Test
    public void ObjectUtils0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0786");
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
    public void ObjectUtils0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0787");
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
    public void ObjectUtils0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0788");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "1.464371712E9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void ObjectUtils0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0789");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (byte) -55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-55.0d) + "'", double1 == (-55.0d));
    }

    @Test
    public void ObjectUtils0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0790");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (-2033316271), (java.lang.Object) (short) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0791");
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
    public void ObjectUtils0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0792");
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
    public void ObjectUtils0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0793");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement2 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.ObjectUtils.clone(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray5 = org.apache.commons.lang3.ObjectUtils.clone(annotatedElementArray1);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0794");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.ObjectUtils.CONST(strArray5);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0795");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.equals(obj0, (java.lang.Object) 49.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void ObjectUtils0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0796");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (short) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 3 + "'", byte1 == (byte) 3);
    }

    @Test
    public void ObjectUtils0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0797");
        org.apache.commons.lang3.ObjectUtils.Null null0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.clone(null0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(null1);
    }

    @Test
    public void ObjectUtils0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0798");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Comparable<java.lang.String>) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void ObjectUtils0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0799");
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
    public void ObjectUtils0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0800");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-1550056849));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1550056849L) + "'", long1 == (-1550056849L));
    }

    @Test
    public void ObjectUtils0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0801");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 1.464371712E9d, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.464371712E9" + "'", str2.equals("1.464371712E9"));
    }

    @Test
    public void ObjectUtils0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0802");
        java.lang.reflect.Type[][][] typeArray0 = null;
        java.lang.reflect.Type[][] typeArray1 = org.apache.commons.lang3.ObjectUtils.mode(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray1);
    }

    @Test
    public void ObjectUtils0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0803");
        java.io.Serializable serializable1 = org.apache.commons.lang3.ObjectUtils.clone((java.io.Serializable) 50L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void ObjectUtils0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0804");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void ObjectUtils0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0805");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.0d + "'", double1 == 31.0d);
    }

    @Test
    public void ObjectUtils0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0806");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 31L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0807");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 50 + "'", byte1 == (byte) 50);
    }

    @Test
    public void ObjectUtils0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0808");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.0d + "'", double1 == 13.0d);
    }

    @Test
    public void ObjectUtils0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0809");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST(35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void ObjectUtils0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0810");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 1.46437171E9f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0811");
        java.lang.Appendable appendable0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass2);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.reflect.Type) wildcardClass2);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0812");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 4.0f, "3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4.0" + "'", str2.equals("4.0"));
    }

    @Test
    public void ObjectUtils0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0813");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void ObjectUtils0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0814");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (-7));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-7" + "'", str1.equals("-7"));
    }

    @Test
    public void ObjectUtils0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0815");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) -48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-48L) + "'", long1 == (-48L));
    }

    @Test
    public void ObjectUtils0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0816");
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 10.0d, (java.lang.Object) (-8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0817");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void ObjectUtils0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0818");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void ObjectUtils0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0819");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (byte) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void ObjectUtils0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0820");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((-46));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -46 + "'", byte1 == (byte) -46);
    }

    @Test
    public void ObjectUtils0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0821");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Comparable<java.lang.String>) "97.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "97.0" + "'", strComparable1.equals("97.0"));
    }

    @Test
    public void ObjectUtils0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0822");
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
    public void ObjectUtils0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0823");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.reflect.GenericDeclaration) wildcardClass2);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0824");
        java.lang.Appendable appendable0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
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
    }

    @Test
    public void ObjectUtils0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0825");
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(1464371706);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [1464371706]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0826");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void ObjectUtils0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0827");
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
    public void ObjectUtils0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0828");
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
    public void ObjectUtils0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0829");
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
    public void ObjectUtils0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0830");
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
    public void ObjectUtils0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0831");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) -55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -55 + "'", byte1 == (byte) -55);
    }

    @Test
    public void ObjectUtils0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0832");
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
    public void ObjectUtils0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0833");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) -46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -46 + "'", short1 == (short) -46);
    }

    @Test
    public void ObjectUtils0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0834");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("3", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void ObjectUtils0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0835");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-1.0", "49.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void ObjectUtils0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0836");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 35 + "'", short1 == (short) 35);
    }

    @Test
    public void ObjectUtils0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0837");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void ObjectUtils0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0838");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] { typeArray1, typeArray2 };
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.ObjectUtils.mode(typeArray3);
        java.lang.reflect.Type[][] typeArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray3);
        java.lang.reflect.Type[][] typeArray6 = org.apache.commons.lang3.ObjectUtils.clone(typeArray5);
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.ObjectUtils.mode(typeArray6);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0839");
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
    public void ObjectUtils0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0840");
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
    public void ObjectUtils0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0841");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-306834496));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.06834496E8d) + "'", double1 == (-3.06834496E8d));
    }

    @Test
    public void ObjectUtils0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0842");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 2L);
    }

    @Test
    public void ObjectUtils0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0843");
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
    public void ObjectUtils0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0844");
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
    public void ObjectUtils0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0845");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) (-59L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0846");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 71.0f + "'", float1 == 71.0f);
    }

    @Test
    public void ObjectUtils0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0847");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0848");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 5 + "'", short1 == (short) 5);
    }

    @Test
    public void ObjectUtils0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0849");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("true", "-5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 71 + "'", int2 == 71);
    }

    @Test
    public void ObjectUtils0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0850");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST(1.01743616E9f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.01743616E9f + "'", float1 == 1.01743616E9f);
    }

    @Test
    public void ObjectUtils0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0851");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.clone(null1);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0852");
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
    public void ObjectUtils0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0853");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0854");
        java.lang.StringBuilder stringBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.clone(null1);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0855");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0856");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.CONST(null0);
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(null1);
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.clone(null2);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0857");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-25));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-25) + "'", int1 == (-25));
    }

    @Test
    public void ObjectUtils0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0858");
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((-561859767));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [-561859767]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0859");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 57.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0860");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void ObjectUtils0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0861");
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
    public void ObjectUtils0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0862");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1, null2, null3 };
        org.apache.commons.lang3.ObjectUtils.Null null5 = org.apache.commons.lang3.ObjectUtils.mode(nullArray4);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray4);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0863");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 5 + "'", short1 == (short) 5);
    }

    @Test
    public void ObjectUtils0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0864");
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
    public void ObjectUtils0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0865");
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
    public void ObjectUtils0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0866");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-561859767));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-561859767L) + "'", long1 == (-561859767L));
    }

    @Test
    public void ObjectUtils0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0867");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Comparable<java.lang.String>) "49.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void ObjectUtils0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0868");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-47));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-47) + "'", int1 == (-47));
    }

    @Test
    public void ObjectUtils0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0869");
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
    public void ObjectUtils0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0870");
        java.lang.StringBuilder stringBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtilsArray4);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) objectUtilsArray7);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0871");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-5", "1005632854");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void ObjectUtils0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0872");
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
    public void ObjectUtils0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0873");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Comparable<java.lang.String>) "1.464371712E9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "1.464371712E9" + "'", strComparable1.equals("1.464371712E9"));
    }

    @Test
    public void ObjectUtils0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0874");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2" + "'", str1.equals("2"));
    }

    @Test
    public void ObjectUtils0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0875");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 1017436136);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1017436136L + "'", long1 == 1017436136L);
    }

    @Test
    public void ObjectUtils0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0876");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "0", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 56 + "'", int3 == 56);
    }

    @Test
    public void ObjectUtils0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0877");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 3201202.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0878");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) (-2.138784939E9d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0879");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void ObjectUtils0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0880");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-1550056849));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1550056849) + "'", int1 == (-1550056849));
    }

    @Test
    public void ObjectUtils0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0881");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 55 + "'", short1 == (short) 55);
    }

    @Test
    public void ObjectUtils0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0882");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 49 + "'", short1 == (short) 49);
    }

    @Test
    public void ObjectUtils0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0883");
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
    public void ObjectUtils0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0884");
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
    public void ObjectUtils0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0885");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray4);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray4);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) strArray4);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0886");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((-8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -8 + "'", short1 == (short) -8);
    }

    @Test
    public void ObjectUtils0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0887");
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
    public void ObjectUtils0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0888");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (byte) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void ObjectUtils0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0889");
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
    public void ObjectUtils0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0890");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 3 + "'", byte1 == (byte) 3);
    }

    @Test
    public void ObjectUtils0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0891");
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
    public void ObjectUtils0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0892");
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
    public void ObjectUtils0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0893");
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
    public void ObjectUtils0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0894");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void ObjectUtils0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0895");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.CONST("3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3" + "'", str1.equals("3"));
    }

    @Test
    public void ObjectUtils0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0896");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement2 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.ObjectUtils.clone(annotatedElementArray1);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0897");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("1.46437171E9", "class [Ljava.lang.Object;", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-50) + "'", int3 == (-50));
    }

    @Test
    public void ObjectUtils0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0898");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1, null2, null3 };
        org.apache.commons.lang3.ObjectUtils.Null null5 = org.apache.commons.lang3.ObjectUtils.mode(nullArray4);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.Object[] objArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray6);
        boolean boolean8 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) nullArray4, (java.lang.Object) objArray6);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0899");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.CONST("class [Ljava.lang.Object;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "class [Ljava.lang.Object;" + "'", str1.equals("class [Ljava.lang.Object;"));
    }

    @Test
    public void ObjectUtils0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0900");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class org.apache.commons.lang3.ObjectUtils$Null", "-5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void ObjectUtils0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0901");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void ObjectUtils0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0902");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) 49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 49L + "'", long1 == 49L);
    }

    @Test
    public void ObjectUtils0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0903");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class [Ljava.lang.reflect.Type;", "32");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void ObjectUtils0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0904");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void ObjectUtils0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0905");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[] { null2 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray6 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray5 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray6);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray8 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray7);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0906");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (short) -8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-8" + "'", str1.equals("-8"));
    }

    @Test
    public void ObjectUtils0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0907");
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
    public void ObjectUtils0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0908");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("48", "3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void ObjectUtils0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0909");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0910");
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
    public void ObjectUtils0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0911");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-7", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-52) + "'", int2 == (-52));
    }

    @Test
    public void ObjectUtils0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0912");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 1119249155);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1119249155L + "'", long1 == 1119249155L);
    }

    @Test
    public void ObjectUtils0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0913");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("-1", "3", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-6) + "'", int3 == (-6));
    }

    @Test
    public void ObjectUtils0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0914");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0915");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 3277121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3277121.0d + "'", double1 == 3277121.0d);
    }

    @Test
    public void ObjectUtils0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0916");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void ObjectUtils0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0917");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.mode(objectUtilsArray4);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0918");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 49L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 49.0f + "'", float1 == 49.0f);
    }

    @Test
    public void ObjectUtils0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0919");
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((-2051775322));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [-2051775322]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0920");
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
    public void ObjectUtils0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0921");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.CharSequence) "32");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "32" + "'", charSequence1.equals("32"));
    }

    @Test
    public void ObjectUtils0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0922");
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
    public void ObjectUtils0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0923");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 55 + "'", int1 == 55);
    }

    @Test
    public void ObjectUtils0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0924");
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
    public void ObjectUtils0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0925");
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
    public void ObjectUtils0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0926");
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
    public void ObjectUtils0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0927");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("3", "100.0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void ObjectUtils0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0928");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 13L + "'", long1 == 13L);
    }

    @Test
    public void ObjectUtils0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0929");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 48 + "'", short1 == (short) 48);
    }

    @Test
    public void ObjectUtils0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0930");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-14425837));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4425837E7d) + "'", double1 == (-1.4425837E7d));
    }

    @Test
    public void ObjectUtils0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0931");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) -46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -46 + "'", byte1 == (byte) -46);
    }

    @Test
    public void ObjectUtils0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0932");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0933");
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
    public void ObjectUtils0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0934");
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
    public void ObjectUtils0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0935");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (-2051775322));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-2051775322" + "'", str1.equals("-2051775322"));
    }

    @Test
    public void ObjectUtils0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0936");
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
    public void ObjectUtils0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0937");
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
    public void ObjectUtils0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0938");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void ObjectUtils0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0939");
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
    public void ObjectUtils0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0940");
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
    public void ObjectUtils0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0941");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-12));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-12L) + "'", long1 == (-12L));
    }

    @Test
    public void ObjectUtils0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0942");
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
    public void ObjectUtils0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0943");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) (-2138784939));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0944");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("31", "100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void ObjectUtils0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0945");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (byte) -50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-50.0d) + "'", double1 == (-50.0d));
    }

    @Test
    public void ObjectUtils0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0946");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-5.0", "-2051775322");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void ObjectUtils0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0947");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "-2051775322");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void ObjectUtils0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0948");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray1.getClass();
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0949");
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
    public void ObjectUtils0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0950");
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
    public void ObjectUtils0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0951");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("-1.0", "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void ObjectUtils0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0952");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (short) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void ObjectUtils0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0953");
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
    public void ObjectUtils0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0954");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) (-2033316271));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0955");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 13L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 13.0f + "'", float1 == 13.0f);
    }

    @Test
    public void ObjectUtils0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0956");
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
    public void ObjectUtils0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0957");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 54L + "'", long1 == 54L);
    }

    @Test
    public void ObjectUtils0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0958");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-4));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-4.0f) + "'", float1 == (-4.0f));
    }

    @Test
    public void ObjectUtils0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0959");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-829723542));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-829723542L) + "'", long1 == (-829723542L));
    }

    @Test
    public void ObjectUtils0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0960");
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
    public void ObjectUtils0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0961");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) (-12L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0962");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0963");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-6));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-6.0f) + "'", float1 == (-6.0f));
    }

    @Test
    public void ObjectUtils0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0964");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-5L) + "'", long1 == (-5L));
    }

    @Test
    public void ObjectUtils0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0965");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        boolean boolean6 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) strArray3, (java.lang.Object) "1.0");
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.io.Serializable serializable8 = org.apache.commons.lang3.ObjectUtils.CONST((java.io.Serializable) strArray3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0966");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) "-55");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0967");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("", "100.0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-5) + "'", int3 == (-5));
    }

    @Test
    public void ObjectUtils0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0968");
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
    public void ObjectUtils0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0969");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) "100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0970");
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
    public void ObjectUtils0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0971");
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElementArray1);
    }

    @Test
    public void ObjectUtils0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0972");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-99682442));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.9682442E7d) + "'", double1 == (-9.9682442E7d));
    }

    @Test
    public void ObjectUtils0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0973");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("97.0", "-55", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
    }

    @Test
    public void ObjectUtils0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0974");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.ObjectUtils.CONST(strArray5);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0975");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.apache.commons.lang3.ObjectUtils.notEqual(obj0, (java.lang.Object) 49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void ObjectUtils0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0976");
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
    public void ObjectUtils0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0977");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0978");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 51L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 51.0f + "'", float1 == 51.0f);
    }

    @Test
    public void ObjectUtils0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0979");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST(54L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 54L + "'", long1 == 54L);
    }

    @Test
    public void ObjectUtils0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0980");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 50L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 50.0f + "'", float1 == 50.0f);
    }

    @Test
    public void ObjectUtils0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0981");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Comparable<java.lang.String>) "55");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "55" + "'", strComparable1.equals("55"));
    }

    @Test
    public void ObjectUtils0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0982");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((-51.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-51.0f) + "'", float1 == (-51.0f));
    }

    @Test
    public void ObjectUtils0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0983");
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
    public void ObjectUtils0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0984");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.CharSequence) "1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void ObjectUtils0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0985");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 2118744065);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2118744065L + "'", long1 == 2118744065L);
    }

    @Test
    public void ObjectUtils0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0986");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = org.apache.commons.lang3.ObjectUtils.clone(typeArray1);
        java.lang.Class<?> wildcardClass3 = typeArray1.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.reflect.GenericDeclaration) wildcardClass3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0987");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, (-1), (-1L), 100.0f };
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray5);
        java.lang.Class<?> wildcardClass7 = objArray5.getClass();
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) wildcardClass7);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0988");
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
    public void ObjectUtils0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0989");
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
    public void ObjectUtils0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0990");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("-8", "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-59) + "'", int3 == (-59));
    }

    @Test
    public void ObjectUtils0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0991");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void ObjectUtils0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0992");
        java.lang.StringBuilder stringBuilder0 = null;
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
    public void ObjectUtils0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0993");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (byte) -55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-55) + "'", int1 == (-55));
    }

    @Test
    public void ObjectUtils0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0994");
        java.lang.Appendable appendable0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        // The following exception was thrown during execution in ObjectUtils generation
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
    public void ObjectUtils0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0995");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("100", "3201202.0", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void ObjectUtils0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0996");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("35.0", "100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void ObjectUtils0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0997");
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
    public void ObjectUtils0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0998");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 3.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3.0" + "'", str1.equals("3.0"));
    }

    @Test
    public void ObjectUtils0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils0999");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("", "class [Ljava.lang.reflect.Type;", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-31) + "'", int3 == (-31));
    }

    @Test
    public void ObjectUtils1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils1.ObjectUtils1000");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(strComparable0, (java.lang.Comparable<java.lang.String>) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + "0" + "'", strComparable2.equals("0"));
    }
}
