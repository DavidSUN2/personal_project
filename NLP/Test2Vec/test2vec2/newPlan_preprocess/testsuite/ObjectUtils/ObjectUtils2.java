package ObjectUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ObjectUtils2 {

    public static boolean debug = false;

    @Test
    public void ObjectUtils1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1001");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray7 = new org.apache.commons.lang3.ObjectUtils.Null[][] {};
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(nullArray5, nullArray7);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray9 = org.apache.commons.lang3.ObjectUtils.mode(nullArray5);
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
    public void ObjectUtils1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1002");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "97" + "'", str1.equals("97"));
    }

    @Test
    public void ObjectUtils1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1003");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement1 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.ObjectUtils.clone(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.ObjectUtils.clone(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray5 = org.apache.commons.lang3.ObjectUtils.CONST(annotatedElementArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray5);
    }

    @Test
    public void ObjectUtils1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1004");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("35.0", "32", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void ObjectUtils1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1005");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray6 = org.apache.commons.lang3.ObjectUtils.CONST(objectUtilsArray4);
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
        org.junit.Assert.assertNotNull(objectUtilsArray6);
    }

    @Test
    public void ObjectUtils1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1006");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtilsArray3);
        java.lang.Object[] objArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) objectUtilsArray6);
        org.apache.commons.lang3.ObjectUtils objectUtils8 = org.apache.commons.lang3.ObjectUtils.mode(objectUtilsArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectUtils8);
    }

    @Test
    public void ObjectUtils1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1007");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.io.Serializable serializable7 = org.apache.commons.lang3.ObjectUtils.mode((java.io.Serializable[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.Object[] objArray9 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Object[]) strArray3);
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
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void ObjectUtils1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1008");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement1 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(annotatedElementArray0);
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray2);
    }

    @Test
    public void ObjectUtils1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1009");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.mode(objectUtilsArray3);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) objectUtils6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-172618668) + "'", int5 == (-172618668));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectUtils6);
    }

    @Test
    public void ObjectUtils1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1010");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("1005632854", "49.0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void ObjectUtils1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1011");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement1 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray0);
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) annotatedElement1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void ObjectUtils1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1012");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = null;
        java.lang.reflect.GenericDeclaration genericDeclaration1 = org.apache.commons.lang3.ObjectUtils.firstNonNull(genericDeclarationArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration1);
    }

    @Test
    public void ObjectUtils1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1013");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] { typeArray1, typeArray2 };
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.ObjectUtils.mode(typeArray3);
        java.lang.reflect.Type[][] typeArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray3);
        java.lang.reflect.Type[][] typeArray6 = org.apache.commons.lang3.ObjectUtils.clone(typeArray5);
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.ObjectUtils.mode(typeArray6);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) typeArray7);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray7);
    }

    @Test
    public void ObjectUtils1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1014");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 2 + "'", short1 == (short) 2);
    }

    @Test
    public void ObjectUtils1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1015");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.ObjectUtils.clone(typeArray0);
        java.lang.Class<?> wildcardClass2 = typeArray0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.reflect.GenericDeclaration) wildcardClass2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) genericDeclaration3, "class org.apache.commons.lang3.ObjectUtils");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "class [Ljava.lang.reflect.Type;" + "'", str5.equals("class [Ljava.lang.reflect.Type;"));
    }

    @Test
    public void ObjectUtils1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1016");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-1756784299));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.75678426E9f) + "'", float1 == (-1.75678426E9f));
    }

    @Test
    public void ObjectUtils1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1017");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(null2);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) null2);
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
    }

    @Test
    public void ObjectUtils1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1018");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.Object obj1 = null;
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.ObjectUtils.clone(typeArray2);
        java.lang.Class<?> wildcardClass4 = typeArray2.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass4, "1.46437171E9");
        boolean boolean8 = org.apache.commons.lang3.ObjectUtils.notEqual(obj1, (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "class [Ljava.lang.reflect.Type;" + "'", str7.equals("class [Ljava.lang.reflect.Type;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void ObjectUtils1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1019");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 71, "31");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "71" + "'", str2.equals("71"));
    }

    @Test
    public void ObjectUtils1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1020");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 1017436136);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.017436136E9d + "'", double1 == 1.017436136E9d);
    }

    @Test
    public void ObjectUtils1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1021");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.io.Serializable serializable7 = org.apache.commons.lang3.ObjectUtils.mode((java.io.Serializable[]) strArray3);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Object[]) strArray3);
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
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void ObjectUtils1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1022");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("3", "class [Ljava.lang.Object;", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-48) + "'", int3 == (-48));
    }

    @Test
    public void ObjectUtils1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1023");
        java.lang.reflect.Type[][][] typeArray0 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray1 = org.apache.commons.lang3.ObjectUtils.CONST(typeArray0);
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) typeArray0);
        java.lang.reflect.Type[][][] typeArray3 = org.apache.commons.lang3.ObjectUtils.clone(typeArray0);
        java.lang.reflect.Type[][] typeArray4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray4);
    }

    @Test
    public void ObjectUtils1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1024");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible("a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a" + "'", str1.equals("a"));
    }

    @Test
    public void ObjectUtils1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1025");
        java.lang.StringBuilder stringBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[] { null2 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray6 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray5 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray6);
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(nullArray6);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) nullArray8);
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
    public void ObjectUtils1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1026");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) -46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -46 + "'", short1 == (short) -46);
    }

    @Test
    public void ObjectUtils1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1027");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 1017436136);
    }

    @Test
    public void ObjectUtils1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1028");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (short) -8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-8.0f) + "'", float1 == (-8.0f));
    }

    @Test
    public void ObjectUtils1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1029");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.Object obj8 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[]) strArray3);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "1" + "'", obj8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ObjectUtils1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1030");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = org.apache.commons.lang3.ObjectUtils.clone(typeArray1);
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) typeArray1);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) typeArray1, "1");
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) typeArray1);
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
    public void ObjectUtils1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1031");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        int int4 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3201202 + "'", int4 == 3201202);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
    }

    @Test
    public void ObjectUtils1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1032");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-31));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-31.0d) + "'", double1 == (-31.0d));
    }

    @Test
    public void ObjectUtils1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1033");
        java.lang.Object[] objArray0 = null;
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objArray1);
    }

    @Test
    public void ObjectUtils1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1034");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = org.apache.commons.lang3.ObjectUtils.mode(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(nullArray5);
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
    public void ObjectUtils1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1035");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) strArray2, "");
        java.lang.String[] strArray8 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray2);
        java.lang.String[] strArray9 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
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
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void ObjectUtils1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1036");
        java.lang.Comparable<java.lang.String> strComparable2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.Comparable<java.lang.String>) "false", (java.lang.Comparable<java.lang.String>) "32");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable2 + "' != '" + "false" + "'", strComparable2.equals("false"));
    }

    @Test
    public void ObjectUtils1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1037");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        boolean boolean9 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) str7, (java.lang.Object) 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "class java.lang.Object" + "'", str4.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "class java.lang.Object" + "'", str6.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ObjectUtils1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1038");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("0", "2118744065");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void ObjectUtils1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1039");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("1", "class [Ljava.lang.reflect.Type;", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-50) + "'", int3 == (-50));
    }

    @Test
    public void ObjectUtils1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1040");
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(481125985);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -128 and 127: [481125985]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1041");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) -46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -46 + "'", byte1 == (byte) -46);
    }

    @Test
    public void ObjectUtils1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1042");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void ObjectUtils1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1043");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(nullArray5);
        int int8 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) nullArray5);
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
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1692265280 + "'", int8 == 1692265280);
    }

    @Test
    public void ObjectUtils1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1044");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray5 = org.apache.commons.lang3.ObjectUtils.clone(objectUtilsArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray5);
    }

    @Test
    public void ObjectUtils1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1045");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "false" + "'", str1.equals("false"));
    }

    @Test
    public void ObjectUtils1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1046");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-1756784299));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.756784299E9d) + "'", double1 == (-1.756784299E9d));
    }

    @Test
    public void ObjectUtils1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1047");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (short) 51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 51 + "'", byte1 == (byte) 51);
    }

    @Test
    public void ObjectUtils1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1048");
        java.lang.String[] strArray4 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray4);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray4);
        boolean boolean7 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-50.0d), (java.lang.Object) int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3277121 + "'", int6 == 3277121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void ObjectUtils1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1049");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
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
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ObjectUtils1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1050");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (short) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 97 + "'", byte1 == (byte) 97);
    }

    @Test
    public void ObjectUtils1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1051");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray4);
        int int7 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray4);
        java.io.Serializable serializable8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.io.Serializable) 32, (java.io.Serializable) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.max(strArray4);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 32 + "'", serializable8.equals(32));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ObjectUtils1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1052");
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((-306834496));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -128 and 127: [-306834496]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1053");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, (-1), (-1L), 100.0f };
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray4);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray4);
        java.lang.Class<?> wildcardClass7 = objArray4.getClass();
        java.lang.reflect.Type type8 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.reflect.Type) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-306834496) + "'", int5 == (-306834496));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-306834496) + "'", int6 == (-306834496));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type8);
    }

    @Test
    public void ObjectUtils1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1054");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
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
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ObjectUtils1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1055");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("55", "2118744065", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void ObjectUtils1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1056");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray8 = org.apache.commons.lang3.ObjectUtils.clone(objectUtilsArray4);
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
        org.junit.Assert.assertNotNull(objectUtils6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray8);
    }

    @Test
    public void ObjectUtils1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1057");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] { typeArray0, typeArray1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.ObjectUtils.mode(typeArray2);
        java.lang.reflect.Type[][] typeArray4 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray2);
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.ObjectUtils.mode(typeArray2);
        java.lang.reflect.Type[][] typeArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray2);
        java.lang.reflect.Type[][] typeArray7 = org.apache.commons.lang3.ObjectUtils.CONST(typeArray6);
        java.lang.reflect.Type[][] typeArray8 = org.apache.commons.lang3.ObjectUtils.clone(typeArray7);
        java.lang.reflect.Type[] typeArray9 = org.apache.commons.lang3.ObjectUtils.firstNonNull(typeArray8);
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
        org.junit.Assert.assertNull(typeArray5);
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
    public void ObjectUtils1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1058");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 3.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void ObjectUtils1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1059");
        java.lang.Appendable appendable0 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement2 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.ObjectUtils.clone(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray5 = org.apache.commons.lang3.ObjectUtils.clone(annotatedElementArray1);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) annotatedElementArray1);
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
    public void ObjectUtils1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1060");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 56 + "'", byte1 == (byte) 56);
    }

    @Test
    public void ObjectUtils1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1061");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("", "-55");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void ObjectUtils1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1062");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) strArray2);
        java.lang.Object obj5 = org.apache.commons.lang3.ObjectUtils.mode((java.lang.Object[]) strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void ObjectUtils1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1063");
        java.lang.Appendable appendable0 = null;
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = org.apache.commons.lang3.ObjectUtils.clone(typeArray1);
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray2);
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.ObjectUtils.clone(typeArray3);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) typeArray3);
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
        org.junit.Assert.assertNotNull(typeArray4);
    }

    @Test
    public void ObjectUtils1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1064");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement2 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.ObjectUtils.clone(annotatedElementArray1);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray5 = org.apache.commons.lang3.ObjectUtils.clone(annotatedElementArray1);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) annotatedElementArray5);
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
    public void ObjectUtils1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1065");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.CONST(strComparable0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void ObjectUtils1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1066");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] { typeArray1, typeArray2 };
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.ObjectUtils.mode(typeArray3);
        java.lang.reflect.Type[][] typeArray5 = org.apache.commons.lang3.ObjectUtils.clone(typeArray3);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
    }

    @Test
    public void ObjectUtils1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1067");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) objArray5);
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
    }

    @Test
    public void ObjectUtils1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1068");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray2 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1 };
        org.apache.commons.lang3.ObjectUtils objectUtils3 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray2);
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) objectUtilsArray2);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray6 = org.apache.commons.lang3.ObjectUtils.CONST(objectUtilsArray2);
        org.apache.commons.lang3.ObjectUtils objectUtils7 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray6);
        java.lang.Class<?> wildcardClass8 = objectUtils7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ObjectUtils1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1069");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) "class [Ljava.lang.reflect.Type;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "class [Ljava.lang.reflect.Type;" + "'", str1.equals("class [Ljava.lang.reflect.Type;"));
    }

    @Test
    public void ObjectUtils1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1070");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString(obj0, "-7");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-7" + "'", str2.equals("-7"));
    }

    @Test
    public void ObjectUtils1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1071");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-389202921));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-389202921) + "'", int1 == (-389202921));
    }

    @Test
    public void ObjectUtils1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1072");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class org.apache.commons.lang3.ObjectUtils$Null", "1.46437171E9");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void ObjectUtils1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1073");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("class java.lang.Object", "2", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
    }

    @Test
    public void ObjectUtils1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1074");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class org.apache.commons.lang3.ObjectUtils", "-7");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void ObjectUtils1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1075");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST(55L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 55L + "'", long1 == 55L);
    }

    @Test
    public void ObjectUtils1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1076");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int7 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
    }

    @Test
    public void ObjectUtils1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1077");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.io.Serializable serializable5 = org.apache.commons.lang3.ObjectUtils.mode((java.io.Serializable[]) strArray3);
        boolean boolean6 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (short) 51, (java.lang.Object) serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void ObjectUtils1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1078");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = org.apache.commons.lang3.ObjectUtils.clone(typeArray1);
        java.lang.Object[] objArray3 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Object[]) typeArray2);
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.ObjectUtils.clone(typeArray4);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) typeArray4);
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(typeArray2, typeArray4);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) typeArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
    }

    @Test
    public void ObjectUtils1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1079");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.ObjectUtils.clone(strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray5);
        boolean boolean8 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) 356296810, (java.lang.Object) strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray5);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void ObjectUtils1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1080");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 56 + "'", short1 == (short) 56);
    }

    @Test
    public void ObjectUtils1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1081");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void ObjectUtils1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1082");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void ObjectUtils1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1083");
        java.lang.reflect.Type[][][][][] typeArray0 = new java.lang.reflect.Type[][][][][] {};
        java.lang.reflect.Type[][][][] typeArray1 = org.apache.commons.lang3.ObjectUtils.firstNonNull(typeArray0);
        java.lang.reflect.Type[][][][][] typeArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray0);
        java.lang.Class<?> wildcardClass3 = typeArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ObjectUtils1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1084");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray3);
        boolean boolean8 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-3.06834496E8d), (java.lang.Object) strArray7);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void ObjectUtils1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1085");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        java.lang.Class<?> wildcardClass5 = null2.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type type7 = org.apache.commons.lang3.ObjectUtils.mode(typeArray6);
        int int8 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) typeArray6);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) int8);
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
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1486371082 + "'", int8 == 1486371082);
    }

    @Test
    public void ObjectUtils1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1086");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.ObjectUtils.clone(typeArray0);
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Object[]) typeArray1);
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
    }

    @Test
    public void ObjectUtils1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1087");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = org.apache.commons.lang3.ObjectUtils.mode(nullArray5);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) nullArray5);
        java.lang.Object[] objArray9 = org.apache.commons.lang3.ObjectUtils.mode((java.lang.Object[][]) nullArray5);
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
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void ObjectUtils1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1088");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (short) -46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-46.0d) + "'", double1 == (-46.0d));
    }

    @Test
    public void ObjectUtils1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1089");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 49.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1090");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
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
    public void ObjectUtils1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1091");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) (-389202921));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1092");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ObjectUtils1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1093");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("31", "1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void ObjectUtils1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1094");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.Class<?> wildcardClass2 = objArray0.getClass();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.Object[] objArray4 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray3);
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(wildcardClass2, wildcardClass5);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass5);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "class [Ljava.lang.Object;" + "'", str7.equals("class [Ljava.lang.Object;"));
    }

    @Test
    public void ObjectUtils1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1095");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) (-2L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1096");
        java.lang.String[] strArray6 = new java.lang.String[] { "1", "1", "hi!", "1", "hi!", "1" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray6);
        java.io.Serializable serializable8 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.io.Serializable[]) strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + "1" + "'", serializable8.equals("1"));
    }

    @Test
    public void ObjectUtils1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1097");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) strArray2);
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
    }

    @Test
    public void ObjectUtils1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1098");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("-5", "3.0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-6) + "'", int3 == (-6));
    }

    @Test
    public void ObjectUtils1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1099");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((-50L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-50L) + "'", long1 == (-50L));
    }

    @Test
    public void ObjectUtils1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1100");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 57L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void ObjectUtils1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1101");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("true", "35.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65 + "'", int2 == 65);
    }

    @Test
    public void ObjectUtils1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1102");
        java.lang.Object obj0 = null;
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = org.apache.commons.lang3.ObjectUtils.clone(typeArray1);
        java.lang.Object[] objArray3 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Object[]) typeArray2);
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.ObjectUtils.clone(typeArray2);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals(obj0, (java.lang.Object) typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ObjectUtils1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1103");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("48", "32", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void ObjectUtils1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1104");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((-25));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -25 + "'", byte1 == (byte) -25);
    }

    @Test
    public void ObjectUtils1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1105");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("31", "48", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void ObjectUtils1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1106");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 54L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.0d + "'", double1 == 54.0d);
    }

    @Test
    public void ObjectUtils1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1107");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.Class<?> wildcardClass2 = objArray1.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement3 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.reflect.AnnotatedElement) wildcardClass2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass2, "1.46437171E9");
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) str5);
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
    }

    @Test
    public void ObjectUtils1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1108");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.CharSequence) "class org.apache.commons.lang3.ObjectUtils");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void ObjectUtils1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1109");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("71", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-42) + "'", int2 == (-42));
    }

    @Test
    public void ObjectUtils1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1110");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) (byte) -3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1111");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.CharSequence) "-7");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "-7" + "'", charSequence1.equals("-7"));
    }

    @Test
    public void ObjectUtils1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1112");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        int int4 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ObjectUtils1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1113");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        int int4 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3201202 + "'", int4 == 3201202);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void ObjectUtils1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1114");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) 56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 56 + "'", byte1 == (byte) 56);
    }

    @Test
    public void ObjectUtils1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1115");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((-1550056849L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1550056849L) + "'", long1 == (-1550056849L));
    }

    @Test
    public void ObjectUtils1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1116");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray3 = new org.apache.commons.lang3.ObjectUtils.Null[] { null0, null1, null2 };
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.mode(nullArray3);
        java.lang.Object obj5 = org.apache.commons.lang3.ObjectUtils.mode((java.lang.Object[]) nullArray3);
        java.lang.Class<?> wildcardClass6 = nullArray3.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.reflect.AnnotatedElement) wildcardClass6);
        java.io.Serializable serializable8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.io.Serializable) wildcardClass6);
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
        org.junit.Assert.assertNotNull(annotatedElement7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void ObjectUtils1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1117");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("hi!", "-7", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
    }

    @Test
    public void ObjectUtils1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1118");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((-59));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -59 + "'", byte1 == (byte) -59);
    }

    @Test
    public void ObjectUtils1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1119");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("1.46437171E9", "71");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void ObjectUtils1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1120");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) strArray3, "3.0");
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
    }

    @Test
    public void ObjectUtils1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1121");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) (-561859767L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-561859767" + "'", str1.equals("-561859767"));
    }

    @Test
    public void ObjectUtils1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1122");
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(1032340634);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [1032340634]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1123");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        boolean boolean7 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) objectUtilsArray3, (java.lang.Object) 52.0d);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray8 = org.apache.commons.lang3.ObjectUtils.clone(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils9 = org.apache.commons.lang3.ObjectUtils.mode(objectUtilsArray8);
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
        org.junit.Assert.assertNull(objectUtils9);
    }

    @Test
    public void ObjectUtils1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1124");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("32", "-1.0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void ObjectUtils1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1125");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.CONST(objectUtils5);
        java.lang.Class<?> wildcardClass7 = objectUtils5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ObjectUtils1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1126");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] { typeArray0, typeArray1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.ObjectUtils.mode(typeArray2);
        java.lang.reflect.Type[][] typeArray4 = org.apache.commons.lang3.ObjectUtils.clone(typeArray2);
        java.lang.reflect.Type[][] typeArray5 = org.apache.commons.lang3.ObjectUtils.CONST(typeArray2);
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
    }

    @Test
    public void ObjectUtils1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1127");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.mode(objectUtilsArray3);
        java.lang.Class<?> wildcardClass7 = objectUtilsArray3.getClass();
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.ObjectUtils.clone(wildcardClass7);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 135469655 + "'", int5 == 135469655);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectUtils6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void ObjectUtils1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1128");
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray0 = new org.apache.commons.lang3.ObjectUtils.Null[] {};
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(nullArray0);
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[] { null2, null3, null4 };
        org.apache.commons.lang3.ObjectUtils.Null null6 = org.apache.commons.lang3.ObjectUtils.mode(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null null8 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray9 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(nullArray1, nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray9);
    }

    @Test
    public void ObjectUtils1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1129");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] { typeArray0, typeArray1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.ObjectUtils.mode(typeArray2);
        java.lang.reflect.Type[][] typeArray4 = org.apache.commons.lang3.ObjectUtils.clone(typeArray2);
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(typeArray2);
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
    }

    @Test
    public void ObjectUtils1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1130");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) strArray2, (java.lang.Object) "1.0");
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ObjectUtils1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1131");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-25));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-25.0d) + "'", double1 == (-25.0d));
    }

    @Test
    public void ObjectUtils1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1132");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Object[]) strArray2);
        boolean boolean8 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) objArray6, (java.lang.Object) 2118744065);
        int int9 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1480090625 + "'", int5 == 1480090625);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1480090625 + "'", int9 == 1480090625);
    }

    @Test
    public void ObjectUtils1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1133");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 4.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1134");
        java.lang.Appendable appendable0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) strArray3);
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "class java.lang.Object" + "'", str6.equals("class java.lang.Object"));
    }

    @Test
    public void ObjectUtils1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1135");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        int int4 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1136");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("-5.0", "0", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void ObjectUtils1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1137");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST(25.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 25.0f + "'", float1 == 25.0f);
    }

    @Test
    public void ObjectUtils1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1138");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] { typeArray0, typeArray1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.ObjectUtils.mode(typeArray2);
        java.lang.reflect.Type[][] typeArray4 = org.apache.commons.lang3.ObjectUtils.clone(typeArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) typeArray2);
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
    }

    @Test
    public void ObjectUtils1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1139");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray2 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1 };
        org.apache.commons.lang3.ObjectUtils objectUtils3 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray2);
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray2);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils5);
    }

    @Test
    public void ObjectUtils1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1140");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        boolean boolean6 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) strArray3, (java.lang.Object) "1.0");
        java.lang.Object[] objArray7 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Object[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) str8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "class java.lang.Object" + "'", str8.equals("class java.lang.Object"));
    }

    @Test
    public void ObjectUtils1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1141");
        java.lang.Object obj2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.Object) 71, (java.lang.Object) 50.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 71 + "'", obj2.equals(71));
    }

    @Test
    public void ObjectUtils1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1142");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void ObjectUtils1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1143");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 51 + "'", short1 == (short) 51);
    }

    @Test
    public void ObjectUtils1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1144");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("1005632854", "-1", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void ObjectUtils1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1145");
        java.lang.String[] strArray3 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.min(strArray3);
        boolean boolean6 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) strArray3, (java.lang.Object) "1.0");
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        boolean boolean8 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) 55.0f, (java.lang.Object) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ObjectUtils1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1146");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-63));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-63L) + "'", long1 == (-63L));
    }

    @Test
    public void ObjectUtils1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1147");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = org.apache.commons.lang3.ObjectUtils.mode(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(nullArray7);
        int int9 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) nullArray8);
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
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512934869 + "'", int9 == 512934869);
    }

    @Test
    public void ObjectUtils1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1148");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("-5.0", "class org.apache.commons.lang3.ObjectUtils$Null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-54) + "'", int2 == (-54));
    }

    @Test
    public void ObjectUtils1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1149");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1150");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 65.0d + "'", double1 == 65.0d);
    }

    @Test
    public void ObjectUtils1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1151");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        java.lang.Class<?> wildcardClass4 = null1.getClass();
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] { wildcardClass4 };
        java.lang.reflect.Type type6 = org.apache.commons.lang3.ObjectUtils.mode(typeArray5);
        int int7 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) typeArray5);
        int int8 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) typeArray5);
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
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1486371082 + "'", int7 == 1486371082);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1486371082 + "'", int8 == 1486371082);
    }

    @Test
    public void ObjectUtils1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1152");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.Object obj8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull((java.lang.Object) str6, (java.lang.Object) 2118744065L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
    }

    @Test
    public void ObjectUtils1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1153");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (-306834496), (java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(wildcardClass2);
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.reflect.GenericDeclaration) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = genericDeclaration6.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement8 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.reflect.AnnotatedElement) genericDeclaration6);
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
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement8);
    }

    @Test
    public void ObjectUtils1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1154");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) strArray2, (java.lang.Object) "1.0");
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Object[]) strArray2);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) objArray6, "55");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void ObjectUtils1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1155");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) 2118744065L);
    }

    @Test
    public void ObjectUtils1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1156");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) 65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1157");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-31));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-31L) + "'", long1 == (-31L));
    }

    @Test
    public void ObjectUtils1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1158");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 35L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void ObjectUtils1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1159");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 31.0f + "'", float1 == 31.0f);
    }

    @Test
    public void ObjectUtils1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1160");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ObjectUtils1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1161");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 57.0f + "'", float1 == 57.0f);
    }

    @Test
    public void ObjectUtils1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1162");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("", "71", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void ObjectUtils1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1163");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) strArray2);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray2);
        int int7 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray6);
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
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1589842058 + "'", int7 == 1589842058);
    }

    @Test
    public void ObjectUtils1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1164");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("1.46437171E9", "-1.0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void ObjectUtils1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1165");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 32 + "'", short1 == (short) 32);
    }

    @Test
    public void ObjectUtils1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1166");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 32 + "'", short1 == (short) 32);
    }

    @Test
    public void ObjectUtils1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1167");
        java.lang.reflect.Type[][][][][] typeArray0 = new java.lang.reflect.Type[][][][][] {};
        java.lang.reflect.Type[][][][] typeArray1 = org.apache.commons.lang3.ObjectUtils.firstNonNull(typeArray0);
        java.lang.reflect.Type[][][][][] typeArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray0);
        java.lang.reflect.Type[][][][][] typeArray3 = org.apache.commons.lang3.ObjectUtils.CONST(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
    }

    @Test
    public void ObjectUtils1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1168");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) strArray2, (java.lang.Object) "1.0");
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Object[]) strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        int int9 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "class java.lang.Object" + "'", str7.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-389202921) + "'", int9 == (-389202921));
    }

    @Test
    public void ObjectUtils1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1169");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-14425837));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.4425837E7f) + "'", float1 == (-1.4425837E7f));
    }

    @Test
    public void ObjectUtils1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1170");
        java.io.Serializable serializable1 = org.apache.commons.lang3.ObjectUtils.clone((java.io.Serializable) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void ObjectUtils1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1171");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 54 + "'", short1 == (short) 54);
    }

    @Test
    public void ObjectUtils1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1172");
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray0 = new org.apache.commons.lang3.ObjectUtils.Null[] {};
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(nullArray0);
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.mode(nullArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(null2);
    }

    @Test
    public void ObjectUtils1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1173");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) (-3.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1174");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray3 = new org.apache.commons.lang3.ObjectUtils.Null[] { null0, null1, null2 };
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.mode(nullArray3);
        java.lang.Class<?> wildcardClass5 = nullArray3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ObjectUtils1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1175");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.Object obj6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Object) strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ObjectUtils1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1176");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) nullArray6);
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
    }

    @Test
    public void ObjectUtils1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1177");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "class java.lang.Object" + "'", str9.equals("class java.lang.Object"));
    }

    @Test
    public void ObjectUtils1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1178");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
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
        org.junit.Assert.assertNotNull(objectUtils6);
    }

    @Test
    public void ObjectUtils1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1179");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] { typeArray0, typeArray1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.ObjectUtils.mode(typeArray2);
        java.lang.reflect.Type[][] typeArray4 = org.apache.commons.lang3.ObjectUtils.clone(typeArray2);
        java.lang.Object obj5 = org.apache.commons.lang3.ObjectUtils.mode((java.lang.Object[]) typeArray4);
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
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void ObjectUtils1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1180");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.ObjectUtils.clone(typeArray0);
        java.lang.reflect.Type[] typeArray2 = org.apache.commons.lang3.ObjectUtils.clone(typeArray1);
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.ObjectUtils.clone(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
    }

    @Test
    public void ObjectUtils1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1181");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(356296810);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 356296810 + "'", int1 == 356296810);
    }

    @Test
    public void ObjectUtils1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1182");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) -59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -59 + "'", byte1 == (byte) -59);
    }

    @Test
    public void ObjectUtils1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1183");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) 54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 54L + "'", long1 == 54L);
    }

    @Test
    public void ObjectUtils1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1184");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("-5.0", "class org.apache.commons.lang3.ObjectUtils$Null", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-54) + "'", int3 == (-54));
    }

    @Test
    public void ObjectUtils1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1185");
        java.lang.reflect.Type[][][] typeArray0 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray1 = org.apache.commons.lang3.ObjectUtils.CONST(typeArray0);
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) typeArray0);
        int int3 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void ObjectUtils1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1186");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, (-1), (-1L), 100.0f };
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray4);
        java.lang.Class<?> wildcardClass6 = objArray4.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.reflect.AnnotatedElement) wildcardClass6);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) annotatedElement7, "class [Ljava.lang.Object;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-306834496) + "'", int5 == (-306834496));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "class [Ljava.lang.Object;" + "'", str9.equals("class [Ljava.lang.Object;"));
    }

    @Test
    public void ObjectUtils1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1187");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][][] typeArray3 = new java.lang.reflect.Type[][][] { typeArray0, typeArray1, typeArray2 };
        java.lang.reflect.Type[][][] typeArray4 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray3);
        java.lang.reflect.Type[][] typeArray5 = org.apache.commons.lang3.ObjectUtils.mode(typeArray3);
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
        org.junit.Assert.assertNull(typeArray5);
    }

    @Test
    public void ObjectUtils1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1188");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.ObjectUtils.mode((java.io.Serializable[]) strArray4);
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
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void ObjectUtils1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1189");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) 1692265280);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1190");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("49.0", "100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void ObjectUtils1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1191");
        java.lang.StringBuilder stringBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1, null2, null3 };
        org.apache.commons.lang3.ObjectUtils.Null null5 = org.apache.commons.lang3.ObjectUtils.mode(nullArray4);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray4);
        org.apache.commons.lang3.ObjectUtils.Null null7 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray4);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) null7);
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
    public void ObjectUtils1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1192");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray1.getClass();
        java.io.Serializable serializable4 = org.apache.commons.lang3.ObjectUtils.CONST((java.io.Serializable) objArray1);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) serializable4);
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
        org.junit.Assert.assertNotNull(serializable4);
    }

    @Test
    public void ObjectUtils1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1193");
        org.apache.commons.lang3.ObjectUtils objectUtils0 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray3 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils0, objectUtils1, objectUtils2 };
        org.apache.commons.lang3.ObjectUtils objectUtils4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray3);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtilsArray3);
        java.lang.Object[] objArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) objectUtilsArray6);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) objectUtilsArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtilsArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void ObjectUtils1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1194");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.Class<?> wildcardClass2 = objArray1.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement3 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.reflect.AnnotatedElement) wildcardClass2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.reflect.GenericDeclaration) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
    }

    @Test
    public void ObjectUtils1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1195");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("-55", "-55", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void ObjectUtils1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1196");
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(3201202);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [3201202]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1197");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "class java.lang.Object" + "'", str4.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "class java.lang.Object" + "'", str6.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void ObjectUtils1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1198");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement1 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray0);
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Object[]) annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray3);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(annotatedElementArray3);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray6 = org.apache.commons.lang3.ObjectUtils.clone(annotatedElementArray3);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray7 = org.apache.commons.lang3.ObjectUtils.clone(annotatedElementArray3);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(annotatedElementArray0, annotatedElementArray7);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray8);
    }

    @Test
    public void ObjectUtils1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1199");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "class java.lang.Object" + "'", str4.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "class java.lang.Object" + "'", str6.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "class java.lang.Object" + "'", str7.equals("class java.lang.Object"));
    }

    @Test
    public void ObjectUtils1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1200");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) -3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -3 + "'", short1 == (short) -3);
    }

    @Test
    public void ObjectUtils1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1201");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) "true");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1202");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) (-1756784299));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1203");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 516960060);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.16960064E8f + "'", float1 == 5.16960064E8f);
    }

    @Test
    public void ObjectUtils1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1204");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 31.0d, "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "31.0" + "'", str2.equals("31.0"));
    }

    @Test
    public void ObjectUtils1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1205");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void ObjectUtils1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1206");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (short) -3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-3.0f) + "'", float1 == (-3.0f));
    }

    @Test
    public void ObjectUtils1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1207");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST(52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void ObjectUtils1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1208");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -25 + "'", byte1 == (byte) -25);
    }

    @Test
    public void ObjectUtils1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1209");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-46));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-46) + "'", int1 == (-46));
    }

    @Test
    public void ObjectUtils1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1210");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-51));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-51L) + "'", long1 == (-51L));
    }

    @Test
    public void ObjectUtils1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1211");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("4.0", "97");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void ObjectUtils1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1212");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) strArray3);
        boolean boolean7 = org.apache.commons.lang3.ObjectUtils.equals(obj0, (java.lang.Object) objArray6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ObjectUtils1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1213");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.ObjectUtils.clone(typeArray0);
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Object[]) typeArray1);
        java.lang.Class<?> wildcardClass3 = typeArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ObjectUtils1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1214");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.reflect.Type[][][] typeArray1 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray2 = org.apache.commons.lang3.ObjectUtils.CONST(typeArray1);
        java.lang.Object[] objArray3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.Object[]) typeArray1);
        java.lang.reflect.Type[][][] typeArray4 = org.apache.commons.lang3.ObjectUtils.clone(typeArray1);
        boolean boolean6 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) typeArray4, (java.lang.Object) "0");
        java.lang.reflect.Type[][] typeArray7 = org.apache.commons.lang3.ObjectUtils.mode(typeArray4);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) typeArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray7);
    }

    @Test
    public void ObjectUtils1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1215");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("1.0", "1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void ObjectUtils1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1216");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) "false");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1217");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass1);
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ObjectUtils1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1218");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) (byte) -46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1219");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-829723542));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-829723542) + "'", int1 == (-829723542));
    }

    @Test
    public void ObjectUtils1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1220");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        java.lang.Class<?> wildcardClass5 = null2.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.reflect.AnnotatedElement) wildcardClass5);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) annotatedElement6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
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
    public void ObjectUtils1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1221");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(wildcardClass2, wildcardClass4);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.reflect.Type) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type6);
    }

    @Test
    public void ObjectUtils1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1222");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 4 + "'", short1 == (short) 4);
    }

    @Test
    public void ObjectUtils1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1223");
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = org.apache.commons.lang3.ObjectUtils.clone(typeArray1);
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.ObjectUtils.clone(typeArray2);
        java.lang.Class<?> wildcardClass4 = typeArray2.getClass();
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) (short) 10, (java.lang.Object) wildcardClass4);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ObjectUtils1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1224");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) objArray1);
        int int3 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti(objArray1);
        java.lang.Class<?> wildcardClass4 = objArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ObjectUtils1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1225");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 25 + "'", short1 == (short) 25);
    }

    @Test
    public void ObjectUtils1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1226");
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray0 = null;
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray1 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(nullArray1);
    }

    @Test
    public void ObjectUtils1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1227");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("49.0", "71", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void ObjectUtils1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1228");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) "-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1229");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) 48.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "48.0" + "'", str1.equals("48.0"));
    }

    @Test
    public void ObjectUtils1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1230");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) (-2138784939L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1231");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1, null2, null3 };
        org.apache.commons.lang3.ObjectUtils.Null null5 = org.apache.commons.lang3.ObjectUtils.mode(nullArray4);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray4);
        java.lang.Object[] objArray7 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Object[]) nullArray6);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) objArray7);
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
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void ObjectUtils1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1232");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void ObjectUtils1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1233");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("100.0", "-2051775322");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void ObjectUtils1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1234");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) 897479465, (java.lang.Object) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void ObjectUtils1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1235");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) (-47));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1236");
        java.lang.StringBuilder stringBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils objectUtils6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray8 = org.apache.commons.lang3.ObjectUtils.clone(objectUtilsArray4);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) objectUtilsArray4);
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
    public void ObjectUtils1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1237");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray7 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray8 = org.apache.commons.lang3.ObjectUtils.mode(nullArray5);
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
    public void ObjectUtils1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1238");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray5);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) strArray6, "100");
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
    }

    @Test
    public void ObjectUtils1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1239");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("4.0", "1005632854");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void ObjectUtils1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1240");
        java.lang.Appendable appendable0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.ObjectUtils.CONST(strArray3);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull((java.lang.Object[][]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.firstNonNull(strArray3);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) strArray7);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void ObjectUtils1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1241");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        int int4 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void ObjectUtils1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1242");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        int int4 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void ObjectUtils1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1243");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ObjectUtils.mode(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.ObjectUtils.CONST(strArray2);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) strArray2, "a");
        java.lang.String str9 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1277725466 + "'", int5 == 1277725466);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1277725466 + "'", int6 == 1277725466);
    }

    @Test
    public void ObjectUtils1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1244");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 1032340634);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1032340634L + "'", long1 == 1032340634L);
    }

    @Test
    public void ObjectUtils1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1245");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-3L) + "'", long1 == (-3L));
    }

    @Test
    public void ObjectUtils1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1246");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST(512934869);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512934869 + "'", int1 == 512934869);
    }

    @Test
    public void ObjectUtils1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1247");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (-2L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void ObjectUtils1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1248");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement1 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(annotatedElementArray0);
        java.lang.Class<?> wildcardClass3 = annotatedElementArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ObjectUtils1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1249");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils3 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray4 = new org.apache.commons.lang3.ObjectUtils[] { objectUtils1, objectUtils2, objectUtils3 };
        org.apache.commons.lang3.ObjectUtils objectUtils5 = org.apache.commons.lang3.ObjectUtils.firstNonNull(objectUtilsArray4);
        org.apache.commons.lang3.ObjectUtils[] objectUtilsArray6 = org.apache.commons.lang3.ObjectUtils.CONST(objectUtilsArray4);
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
        org.junit.Assert.assertNotNull(objectUtilsArray6);
    }

    @Test
    public void ObjectUtils1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1250");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] { typeArray0, typeArray1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.ObjectUtils.mode(typeArray2);
        java.lang.reflect.Type[][] typeArray4 = org.apache.commons.lang3.ObjectUtils.clone(typeArray2);
        java.lang.reflect.Type[][] typeArray5 = org.apache.commons.lang3.ObjectUtils.clone(typeArray4);
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
    }

    @Test
    public void ObjectUtils1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1251");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray3 = new org.apache.commons.lang3.ObjectUtils.Null[] { null0, null1, null2 };
        org.apache.commons.lang3.ObjectUtils.Null null4 = org.apache.commons.lang3.ObjectUtils.mode(nullArray3);
        java.lang.Object obj5 = org.apache.commons.lang3.ObjectUtils.mode((java.lang.Object[]) nullArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.toString(obj5);
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
    }

    @Test
    public void ObjectUtils1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1252");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        int int4 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void ObjectUtils1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1253");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) 31L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 31.0f + "'", float1 == 31.0f);
    }

    @Test
    public void ObjectUtils1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1254");
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1, null2, null3 };
        org.apache.commons.lang3.ObjectUtils.Null null5 = org.apache.commons.lang3.ObjectUtils.mode(nullArray4);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray4);
        java.lang.Object[] objArray7 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Object[]) nullArray6);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray8 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(nullArray0, nullArray6);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray9 = org.apache.commons.lang3.ObjectUtils.clone(nullArray6);
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
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nullArray9);
    }

    @Test
    public void ObjectUtils1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1255");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.clone("97");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void ObjectUtils1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1256");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils objectUtils1 = new org.apache.commons.lang3.ObjectUtils();
        org.apache.commons.lang3.ObjectUtils objectUtils2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objectUtils1);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) objectUtils1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objectUtils2);
    }

    @Test
    public void ObjectUtils1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1257");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((-31L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-31L) + "'", long1 == (-31L));
    }

    @Test
    public void ObjectUtils1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1258");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (short) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void ObjectUtils1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1259");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.clone(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ObjectUtils1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1260");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] { typeArray0, typeArray1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.ObjectUtils.mode(typeArray2);
        java.lang.reflect.Type[][] typeArray4 = org.apache.commons.lang3.ObjectUtils.clone(typeArray2);
        java.lang.reflect.Type[][] typeArray5 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray4);
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
    }

    @Test
    public void ObjectUtils1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1261");
        java.lang.CharSequence charSequence1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible((java.lang.CharSequence) "97.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence1 + "' != '" + "97.0" + "'", charSequence1.equals("97.0"));
    }

    @Test
    public void ObjectUtils1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1262");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("48", "3.0", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void ObjectUtils1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1263");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement1 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement annotatedElement3 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement3);
    }

    @Test
    public void ObjectUtils1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1264");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (-99682442));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-99682442L) + "'", long1 == (-99682442L));
    }

    @Test
    public void ObjectUtils1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1265");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass1);
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "class java.lang.Object" + "'", str3.equals("class java.lang.Object"));
    }

    @Test
    public void ObjectUtils1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1266");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((-853627178));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-853627178) + "'", int1 == (-853627178));
    }

    @Test
    public void ObjectUtils1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1267");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT(52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 52 + "'", short1 == (short) 52);
    }

    @Test
    public void ObjectUtils1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1268");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1, null2, null3 };
        org.apache.commons.lang3.ObjectUtils.Null null5 = org.apache.commons.lang3.ObjectUtils.mode(nullArray4);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.CONST(nullArray4);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) nullArray6);
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
    public void ObjectUtils1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1269");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("-5", "32", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-6) + "'", int3 == (-6));
    }

    @Test
    public void ObjectUtils1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1270");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.Class<?> wildcardClass2 = objArray1.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement3 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.reflect.AnnotatedElement) wildcardClass2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) annotatedElement3);
        boolean boolean6 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) str4, (java.lang.Object) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "class [Ljava.lang.Object;" + "'", str4.equals("class [Ljava.lang.Object;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void ObjectUtils1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1271");
        java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Comparable<java.lang.String>) "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable1 + "' != '" + "true" + "'", strComparable1.equals("true"));
    }

    @Test
    public void ObjectUtils1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1272");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.ObjectUtils.clone(typeArray0);
        java.lang.reflect.Type[] typeArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray1);
        int int3 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) typeArray2);
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
    public void ObjectUtils1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1273");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((-99682442L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-99682442L) + "'", long1 == (-99682442L));
    }

    @Test
    public void ObjectUtils1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1274");
        java.lang.reflect.Type[][][] typeArray0 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray1 = org.apache.commons.lang3.ObjectUtils.CONST(typeArray0);
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) typeArray0, "true");
        java.lang.reflect.Type[][] typeArray4 = org.apache.commons.lang3.ObjectUtils.firstNonNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray4);
    }

    @Test
    public void ObjectUtils1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1275");
        java.lang.reflect.Type[][][] typeArray0 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray1 = org.apache.commons.lang3.ObjectUtils.CONST(typeArray0);
        java.lang.reflect.Type[][][] typeArray2 = org.apache.commons.lang3.ObjectUtils.clone(typeArray0);
        java.lang.reflect.Type[][][] typeArray3 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
    }

    @Test
    public void ObjectUtils1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1276");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("class org.apache.commons.lang3.ObjectUtils$Null", "false", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void ObjectUtils1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1277");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("100", "-2051775322", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void ObjectUtils1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1278");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String[] strArray9 = org.apache.commons.lang3.ObjectUtils.clone(strArray2);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void ObjectUtils1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1279");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) (byte) 4);
    }

    @Test
    public void ObjectUtils1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1280");
        org.apache.commons.lang3.ObjectUtils.Null null0 = org.apache.commons.lang3.ObjectUtils.NULL;
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) null0);
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) null0, "71");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(null0);
    }

    @Test
    public void ObjectUtils1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1281");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (byte) -59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -59 + "'", byte1 == (byte) -59);
    }

    @Test
    public void ObjectUtils1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1282");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (short) -8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -8 + "'", byte1 == (byte) -8);
    }

    @Test
    public void ObjectUtils1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1283");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) (-306834496L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1284");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 56L + "'", long1 == 56L);
    }

    @Test
    public void ObjectUtils1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1285");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        int int5 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3201202 + "'", int5 == 3201202);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ObjectUtils1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1286");
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((-1756784299));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -32768 and 32767: [-1756784299]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1287");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ObjectUtils.CONST(wildcardClass1);
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) wildcardClass1);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ObjectUtils1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1288");
        java.lang.StringBuffer stringBuffer0 = null;
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = org.apache.commons.lang3.ObjectUtils.clone(typeArray1);
        java.lang.Object[] objArray3 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.Object[]) typeArray2);
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.ObjectUtils.clone(typeArray2);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) typeArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
    }

    @Test
    public void ObjectUtils1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1289");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray0);
        java.lang.Class<?> wildcardClass2 = objArray0.getClass();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.Object[] objArray4 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray3);
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(wildcardClass2, wildcardClass5);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) wildcardClass6);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "class [Ljava.lang.Object;" + "'", str7.equals("class [Ljava.lang.Object;"));
    }

    @Test
    public void ObjectUtils1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1290");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "1" };
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.median(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.Object obj6 = org.apache.commons.lang3.ObjectUtils.clone((java.lang.Object) strArray3);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.max(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ObjectUtils1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1291");
        java.lang.String str1 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) "100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100.0" + "'", str1.equals("100.0"));
    }

    @Test
    public void ObjectUtils1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1292");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        java.lang.Class<?> wildcardClass5 = null2.getClass();
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) wildcardClass5);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) wildcardClass5);
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
    }

    @Test
    public void ObjectUtils1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1293");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) (byte) 50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 50L + "'", long1 == 50L);
    }

    @Test
    public void ObjectUtils1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1294");
        java.lang.reflect.Type[][][][] typeArray0 = new java.lang.reflect.Type[][][][] {};
        java.lang.reflect.Type[][][][] typeArray1 = org.apache.commons.lang3.ObjectUtils.CONST(typeArray0);
        java.lang.reflect.Type[][][][] typeArray2 = new java.lang.reflect.Type[][][][] {};
        java.lang.reflect.Type[][][][] typeArray3 = org.apache.commons.lang3.ObjectUtils.CONST(typeArray2);
        java.lang.reflect.Type[][][][] typeArray4 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(typeArray1, typeArray3);
        java.lang.reflect.Type[][][] typeArray5 = org.apache.commons.lang3.ObjectUtils.mode(typeArray4);
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
        org.junit.Assert.assertNull(typeArray5);
    }

    @Test
    public void ObjectUtils1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1295");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] { typeArray0, typeArray1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.ObjectUtils.mode(typeArray2);
        java.lang.reflect.Type[][] typeArray4 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray2);
        java.lang.reflect.Type[][] typeArray5 = org.apache.commons.lang3.ObjectUtils.clone(typeArray4);
        java.lang.reflect.Type[] typeArray6 = org.apache.commons.lang3.ObjectUtils.mode(typeArray4);
        java.io.Serializable serializable7 = org.apache.commons.lang3.ObjectUtils.mode((java.io.Serializable[]) typeArray4);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
    }

    @Test
    public void ObjectUtils1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1296");
        long long1 = org.apache.commons.lang3.ObjectUtils.CONST((long) 1464371706);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1464371706L + "'", long1 == 1464371706L);
    }

    @Test
    public void ObjectUtils1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1297");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1298");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("55", "100.0", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void ObjectUtils1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1299");
        org.apache.commons.lang3.ObjectUtils.Null null1 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.CONST(null1);
        boolean boolean3 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null1);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray4 = new org.apache.commons.lang3.ObjectUtils.Null[] { null1 };
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray5 = new org.apache.commons.lang3.ObjectUtils.Null[][] { nullArray4 };
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray6 = org.apache.commons.lang3.ObjectUtils.firstNonNull(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[] nullArray7 = org.apache.commons.lang3.ObjectUtils.mode(nullArray5);
        org.apache.commons.lang3.ObjectUtils.Null[][] nullArray8 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(nullArray5);
        int int9 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) nullArray8);
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
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 132368605 + "'", int9 == 132368605);
    }

    @Test
    public void ObjectUtils1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1300");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(wildcardClass1);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) wildcardClass1, (java.lang.Object) (-2138784939L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void ObjectUtils1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1301");
        java.lang.String str2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull("-55", "4.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-55" + "'", str2.equals("-55"));
    }

    @Test
    public void ObjectUtils1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1302");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) (-63.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1303");
        java.lang.reflect.Type[][][][][][] typeArray0 = new java.lang.reflect.Type[][][][][][] {};
        java.lang.reflect.Type[][][][][] typeArray1 = org.apache.commons.lang3.ObjectUtils.firstNonNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(typeArray1);
    }

    @Test
    public void ObjectUtils1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1304");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) null2);
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
    }

    @Test
    public void ObjectUtils1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1305");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("3.0", "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-48) + "'", int2 == (-48));
    }

    @Test
    public void ObjectUtils1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1306");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        boolean boolean5 = org.apache.commons.lang3.ObjectUtils.equals((java.lang.Object) strArray2, (java.lang.Object) "1.0");
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.ObjectUtils.clone(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "class java.lang.Object" + "'", str6.equals("class java.lang.Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void ObjectUtils1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1307");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) (short) 48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.0d + "'", double1 == 48.0d);
    }

    @Test
    public void ObjectUtils1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1308");
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE(1005632854);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Supplied value must be a valid byte literal between -128 and 127: [1005632854]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1309");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST_BYTE((int) (short) 48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 48 + "'", byte1 == (byte) 48);
    }

    @Test
    public void ObjectUtils1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1310");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 3277121L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3277121.0d + "'", double1 == 3277121.0d);
    }

    @Test
    public void ObjectUtils1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1311");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("class [Ljava.lang.reflect.Type;", "-2051775322");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void ObjectUtils1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1312");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement4 = org.apache.commons.lang3.ObjectUtils.CONST((java.lang.reflect.AnnotatedElement) wildcardClass3);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(strBuilder0, (java.lang.Object) wildcardClass3);
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
    public void ObjectUtils1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1313");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (short) 56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 56 + "'", short1 == (short) 56);
    }

    @Test
    public void ObjectUtils1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1314");
        java.lang.StringBuilder stringBuilder0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[] strArray4 = org.apache.commons.lang3.ObjectUtils.mode(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray4);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.ObjectUtils.min(strArray4);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuilder0, (java.lang.Object) str7);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ObjectUtils1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1315");
        int int1 = org.apache.commons.lang3.ObjectUtils.CONST((int) (short) 56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 56 + "'", int1 == 56);
    }

    @Test
    public void ObjectUtils1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1316");
        double double1 = org.apache.commons.lang3.ObjectUtils.CONST((double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void ObjectUtils1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1317");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement1 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.ObjectUtils.clone(annotatedElementArray0);
        java.lang.Class<?> wildcardClass4 = annotatedElementArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ObjectUtils1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1318");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (short) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 97 + "'", short1 == (short) 97);
    }

    @Test
    public void ObjectUtils1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1319");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("97", "0", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void ObjectUtils1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1320");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("-8", "false", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-57) + "'", int3 == (-57));
    }

    @Test
    public void ObjectUtils1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1321");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) (byte) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 4 + "'", short1 == (short) 4);
    }

    @Test
    public void ObjectUtils1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1322");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.ObjectUtils.clone(typeArray0);
        java.lang.reflect.Type[] typeArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray1);
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.ObjectUtils.clone(typeArray2);
        int int4 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void ObjectUtils1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1323");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST_SHORT((int) (byte) 56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 56 + "'", short1 == (short) 56);
    }

    @Test
    public void ObjectUtils1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1324");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1325");
        java.lang.String[] strArray2 = new java.lang.String[] { "class java.lang.Object", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.min(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.median(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void ObjectUtils1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1326");
        int int3 = org.apache.commons.lang3.ObjectUtils.compare("false", "35.0", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 51 + "'", int3 == 51);
    }

    @Test
    public void ObjectUtils1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1327");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] { typeArray0, typeArray1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.ObjectUtils.mode(typeArray2);
        java.lang.reflect.Type[][] typeArray4 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray2);
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.ObjectUtils.mode(typeArray2);
        java.lang.reflect.Type[][] typeArray6 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(typeArray2);
        java.lang.reflect.Type[][] typeArray7 = org.apache.commons.lang3.ObjectUtils.CONST(typeArray6);
        java.lang.reflect.Type[][] typeArray8 = org.apache.commons.lang3.ObjectUtils.clone(typeArray7);
        java.lang.reflect.Type[][] typeArray9 = org.apache.commons.lang3.ObjectUtils.clone(typeArray8);
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
        org.junit.Assert.assertNull(typeArray5);
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
    public void ObjectUtils1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1328");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "1" };
        java.lang.String str3 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        int int4 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.max(strArray2);
        java.lang.String str8 = org.apache.commons.lang3.ObjectUtils.toString((java.lang.Object) str6, "49.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3201202 + "'", int4 == 3201202);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ObjectUtils1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1329");
        short short1 = org.apache.commons.lang3.ObjectUtils.CONST((short) 48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 48 + "'", short1 == (short) 48);
    }

    @Test
    public void ObjectUtils1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1330");
        float float1 = org.apache.commons.lang3.ObjectUtils.CONST((float) (-51L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-51.0f) + "'", float1 == (-51.0f));
    }

    @Test
    public void ObjectUtils1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1331");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement annotatedElement1 = org.apache.commons.lang3.ObjectUtils.firstNonNull(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = org.apache.commons.lang3.ObjectUtils.cloneIfPossible(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.ObjectUtils.clone(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.ObjectUtils.clone(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement annotatedElement5 = org.apache.commons.lang3.ObjectUtils.mode(annotatedElementArray0);
        int int6 = org.apache.commons.lang3.ObjectUtils.hashCodeMulti((java.lang.Object[]) annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(annotatedElement5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void ObjectUtils1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1332");
        int int2 = org.apache.commons.lang3.ObjectUtils.compare("100.0", "31.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void ObjectUtils1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1333");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(appendable0, (java.lang.Object) (byte) -3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ObjectUtils1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1334");
        byte byte1 = org.apache.commons.lang3.ObjectUtils.CONST((byte) -50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -50 + "'", byte1 == (byte) -50);
    }

    @Test
    public void ObjectUtils1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObjectUtils2.ObjectUtils1335");
        java.lang.StringBuffer stringBuffer0 = null;
        org.apache.commons.lang3.ObjectUtils.Null null2 = org.apache.commons.lang3.ObjectUtils.NULL;
        org.apache.commons.lang3.ObjectUtils.Null null3 = org.apache.commons.lang3.ObjectUtils.CONST(null2);
        boolean boolean4 = org.apache.commons.lang3.ObjectUtils.notEqual((java.lang.Object) (-1.0d), (java.lang.Object) null2);
        java.lang.Class<?> wildcardClass5 = null2.getClass();
        java.lang.String str6 = org.apache.commons.lang3.ObjectUtils.identityToString((java.lang.Object) wildcardClass5);
        // The following exception was thrown during execution in ObjectUtils generation
        try {
            org.apache.commons.lang3.ObjectUtils.identityToString(stringBuffer0, (java.lang.Object) str6);
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
    }
}
