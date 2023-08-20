package TypeUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TypeUtils0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test01");
        java.lang.reflect.Type type0 = null;
        boolean boolean1 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(type0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test02");
        java.lang.reflect.WildcardType wildcardType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(wildcardType0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        java.lang.reflect.Type type5 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass4, (java.lang.reflect.Type) wildcardClass7);
        boolean boolean9 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test04");
        java.lang.reflect.WildcardType wildcardType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(wildcardType0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test05");
        java.lang.reflect.ParameterizedType parameterizedType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> wildcardTypeVariableMap1 = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(parameterizedType0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test06");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass4);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass5);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass5);
        boolean boolean8 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) (-1), type7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test07");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass4);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass5);
        boolean boolean7 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) 10.0d, (java.lang.reflect.Type) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test08");
        java.lang.reflect.Type type0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        boolean boolean3 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type0, (java.lang.reflect.Type) wildcardClass2);
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(type0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test09");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils1 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass3, (java.lang.reflect.Type) wildcardClass5);
        boolean boolean7 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) typeUtils1, (java.lang.reflect.Type) wildcardClass3);
        boolean boolean8 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) 100, (java.lang.reflect.Type) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test10");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass1 = typeUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test11");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) typeUtils0, (java.lang.reflect.Type) wildcardClass2);
        java.lang.Class<?> wildcardClass7 = typeUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test12");
        java.lang.reflect.Type type0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        boolean boolean3 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type0, (java.lang.reflect.Type) wildcardClass2);
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.Type type5 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass2);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(type5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test13");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        java.lang.reflect.Type type5 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass4, (java.lang.reflect.Type) wildcardClass7);
        java.lang.reflect.Type type9 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type9);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test14");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] { wildcardClass1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray2);
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray3);
        java.lang.Class<?> wildcardClass5 = typeArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
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
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test15");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] { wildcardClass1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray2);
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray3);
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray3);
        java.lang.Class<?> wildcardClass6 = typeArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test16");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        java.lang.reflect.Type type5 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test17");
        java.lang.reflect.Type type0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        boolean boolean3 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type0, (java.lang.reflect.Type) wildcardClass2);
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.Type type5 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass2);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test18");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) typeUtils0, (java.lang.reflect.Type) wildcardClass2);
        boolean boolean7 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass2);
        boolean boolean8 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.Type type9 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type9);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test19");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        java.lang.reflect.Type type5 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass4);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass4);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass4);
        boolean boolean8 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test20");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) typeUtils0, (java.lang.reflect.Type) wildcardClass2);
        boolean boolean7 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.Type type8 = null;
        boolean boolean9 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass2, type8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test21");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass3, (java.lang.reflect.Type) wildcardClass5);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass6);
        boolean boolean8 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass6);
        java.lang.reflect.Type type9 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type9);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test22");
        java.lang.reflect.Type[] typeArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test23");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass4);
        boolean boolean7 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) (short) 100, (java.lang.reflect.Type) wildcardClass4);
        java.lang.reflect.Type type8 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass4);
        java.lang.reflect.Type type9 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type9);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test24");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.reflect.Type[] typeArray3 = new java.lang.reflect.Type[] { wildcardClass2 };
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray3);
        java.lang.Class<?> wildcardClass5 = typeArray3.getClass();
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass5);
        boolean boolean7 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) (byte) 0, (java.lang.reflect.Type) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test25");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] { wildcardClass1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray2);
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray3);
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray3);
        java.lang.reflect.Type[] typeArray6 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray3);
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray3);
        java.lang.Class<?> wildcardClass8 = typeArray7.getClass();
        boolean boolean9 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test26");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) typeUtils0, (java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.Type type8 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.Type type9 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(type8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type9);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test27");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass4);
        boolean boolean7 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) (short) 100, (java.lang.reflect.Type) wildcardClass4);
        boolean boolean8 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test28");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) (short) 100, (java.lang.reflect.Type) wildcardClass5);
        java.lang.reflect.Type[] typeArray7 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray7);
        java.lang.Class<?> wildcardClass9 = typeArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test29");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        java.lang.reflect.Type type5 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass4, (java.lang.reflect.Type) wildcardClass7);
        boolean boolean9 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test30");
        java.lang.reflect.Type type0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type0, (java.lang.reflect.Type) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test31");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils1 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass3, (java.lang.reflect.Type) wildcardClass5);
        boolean boolean7 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) typeUtils1, (java.lang.reflect.Type) wildcardClass3);
        boolean boolean8 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) 10.0f, (java.lang.reflect.Type) wildcardClass3);
        boolean boolean9 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test32");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) (short) 100, (java.lang.reflect.Type) wildcardClass5);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type7);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test33");
        java.lang.reflect.Type type0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        boolean boolean3 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type0, (java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass2);
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(type4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test34");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test35");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] { wildcardClass1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray2);
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray3);
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray3);
        java.lang.reflect.Type[] typeArray6 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray3);
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray3);
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
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
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test36");
        java.lang.reflect.Type type0 = null;
        java.lang.reflect.Type type1 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(type0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test37");
        java.lang.reflect.Type type1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type1, (java.lang.reflect.Type) wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass3);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass3);
        boolean boolean7 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) (short) 100, (java.lang.reflect.Type) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test38");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test39");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        java.lang.reflect.Type type5 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass4);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass4);
        boolean boolean7 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass4);
        java.lang.reflect.Type type8 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type8);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test40");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) (short) 100, (java.lang.reflect.Type) wildcardClass5);
        boolean boolean7 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test41");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] { wildcardClass1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray2);
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray2);
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray4);
        java.lang.Class<?> wildcardClass6 = typeArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test42");
        java.lang.reflect.Type type1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type1, (java.lang.reflect.Type) wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass3);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) "hi!", (java.lang.reflect.Type) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test43");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] { wildcardClass1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray2);
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray3);
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray3);
        java.lang.reflect.Type[] typeArray6 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray3);
        java.lang.Class<?> wildcardClass7 = typeArray6.getClass();
        boolean boolean8 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test44");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] { wildcardClass1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray2);
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray2);
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray4);
        java.lang.reflect.Type[] typeArray6 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray4);
        java.lang.Class<?> wildcardClass7 = typeArray4.getClass();
        java.lang.reflect.Type type8 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test45");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils1 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass3, (java.lang.reflect.Type) wildcardClass5);
        boolean boolean7 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) typeUtils1, (java.lang.reflect.Type) wildcardClass3);
        boolean boolean8 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) 10.0f, (java.lang.reflect.Type) wildcardClass3);
        java.lang.reflect.Type type9 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(type9);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TypeUtils0.test46");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] { wildcardClass1 };
        java.lang.reflect.Type[] typeArray3 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray2);
        java.lang.reflect.Type[] typeArray4 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray3);
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray3);
        java.lang.reflect.Type[] typeArray6 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray5);
        java.lang.reflect.Type type7 = null;
        boolean boolean8 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) typeArray6, type7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }
}

