package ClassUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClassUtils0 {

    public static boolean debug = false;

    @Test
    public void ClassUtils0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0001");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0002");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void ClassUtils0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0003");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) 0.0d, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Double" + "'", str2.equals("Double"));
    }

    @Test
    public void ClassUtils0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0004");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0005");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class<?>[] wildcardClassArray1 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClassArray1);
    }

    @Test
    public void ClassUtils0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0006");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("Double");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Double" + "'", str1.equals("Double"));
    }

    @Test
    public void ClassUtils0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0007");
        char char0 = org.apache.commons.lang3.ClassUtils.INNER_CLASS_SEPARATOR_CHAR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '$' + "'", char0 == '$');
    }

    @Test
    public void ClassUtils0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0008");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) (short) 10, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Short" + "'", str2.equals("Short"));
    }

    @Test
    public void ClassUtils0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0009");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) 0L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Long" + "'", str2.equals("Long"));
    }

    @Test
    public void ClassUtils0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0010");
        java.lang.String str0 = org.apache.commons.lang3.ClassUtils.INNER_CLASS_SEPARATOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "$" + "'", str0.equals("$"));
    }

    @Test
    public void ClassUtils0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0011");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("Double");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Double" + "'", str1.equals("Double"));
    }

    @Test
    public void ClassUtils0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0012");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("$");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "." + "'", str1.equals("."));
    }

    @Test
    public void ClassUtils0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0013");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) 10L, "$");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Long" + "'", str2.equals("Long"));
    }

    @Test
    public void ClassUtils0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0014");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) 10, ".");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Integer" + "'", str2.equals("Integer"));
    }

    @Test
    public void ClassUtils0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0015");
        java.lang.String str0 = org.apache.commons.lang3.ClassUtils.PACKAGE_SEPARATOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "." + "'", str0.equals("."));
    }

    @Test
    public void ClassUtils0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0016");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, ".");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0017");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Double");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Double");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0018");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("Long");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Long");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0019");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0020");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class<?>[] wildcardClassArray1 = null;
        boolean boolean3 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray1, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void ClassUtils0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0021");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "Short", "org.apache.commons.lang3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0022");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "Long", "Double");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0023");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Short", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Short");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0024");
        char char0 = org.apache.commons.lang3.ClassUtils.PACKAGE_SEPARATOR_CHAR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '.' + "'", char0 == '.');
    }

    @Test
    public void ClassUtils0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0025");
        org.apache.commons.lang3.ClassUtils classUtils0 = new org.apache.commons.lang3.ClassUtils();
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) classUtils0, "hi!");
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "hi!", "Double");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3" + "'", str2.equals("org.apache.commons.lang3"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "java.lang" + "'", str4.equals("java.lang"));
    }

    @Test
    public void ClassUtils0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0026");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) 'a', "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Character" + "'", str2.equals("Character"));
    }

    @Test
    public void ClassUtils0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0027");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass(".");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0028");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) (short) 0, ".");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0029");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("Long");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Long" + "'", str1.equals("Long"));
    }

    @Test
    public void ClassUtils0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0030");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) ' ', "Integer");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Character" + "'", str2.equals("Character"));
    }

    @Test
    public void ClassUtils0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0031");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Double", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Double");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0032");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("String", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: String");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0033");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) 100.0d, "$");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Double" + "'", str2.equals("Double"));
    }

    @Test
    public void ClassUtils0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0034");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray7, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.lang" + "'", str9.equals("java.lang"));
    }

    @Test
    public void ClassUtils0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0035");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("$");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0036");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("Class[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Class[]" + "'", str1.equals("Class[]"));
    }

    @Test
    public void ClassUtils0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0037");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("Class[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0038");
        org.apache.commons.lang3.ClassUtils classUtils0 = new org.apache.commons.lang3.ClassUtils();
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) classUtils0, "hi!");
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) str2, "Class[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3" + "'", str2.equals("org.apache.commons.lang3"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "String" + "'", str4.equals("String"));
    }

    @Test
    public void ClassUtils0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0039");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("Long");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0040");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "java.lang");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java/lang");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0041");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0042");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Short");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Short");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0043");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "Double", "String");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0044");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) '#', "Double");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Character" + "'", str2.equals("Character"));
    }

    @Test
    public void ClassUtils0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0045");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?> wildcardClass8 = wildcardClassArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ClassUtils0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0046");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("Double");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0047");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "Double", "Class[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0048");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName(".");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0049");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("org.apache.commons.lang3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "lang3" + "'", str1.equals("lang3"));
    }

    @Test
    public void ClassUtils0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0050");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("Short");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Short" + "'", str1.equals("Short"));
    }

    @Test
    public void ClassUtils0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0051");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray6, "Integer");
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Class[]" + "'", str8.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0052");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "java.lang", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java/lang");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0053");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Integer", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Integer");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0054");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "String", "java.lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0055");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Long", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Long");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0056");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("Class[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0057");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0058");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "$", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: $");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0059");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("Integer");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Integer" + "'", str1.equals("Integer"));
    }

    @Test
    public void ClassUtils0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0060");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) '.', "$");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0061");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "org.apache.commons.lang3");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org/apache/commons/lang3");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0062");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Class[]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [LClass;");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0063");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "");
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Class[]" + "'", str8.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0064");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "", "$");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0065");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0066");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("String", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: String");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0067");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("Character");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Character");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0068");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("$");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: $");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0069");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Double", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Double");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0070");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("String");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: String");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0071");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "String", ".");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0072");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("java.lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "lang" + "'", str1.equals("lang"));
    }

    @Test
    public void ClassUtils0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0073");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("Class[]");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Class");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0074");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Class[]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Class");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0075");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("lang");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: lang");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0076");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("java.lang", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java.lang");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0077");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) (byte) 100, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Byte" + "'", str2.equals("Byte"));
    }

    @Test
    public void ClassUtils0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0078");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("Long");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0079");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("lang3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "lang3" + "'", str1.equals("lang3"));
    }

    @Test
    public void ClassUtils0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0080");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "java.lang", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "java.lang" + "'", str7.equals("java.lang"));
    }

    @Test
    public void ClassUtils0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0081");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Integer", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Integer");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0082");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("Integer");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Integer" + "'", str1.equals("Integer"));
    }

    @Test
    public void ClassUtils0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0083");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) 10.0d, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Double" + "'", str2.equals("Double"));
    }

    @Test
    public void ClassUtils0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0084");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "lang");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: lang");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0085");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("lang3");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: lang3");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0086");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "Class[]", "java.lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0087");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "Double", "Short");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0088");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("Short");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Short" + "'", str1.equals("Short"));
    }

    @Test
    public void ClassUtils0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0089");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0090");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0091");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getPackageName(obj0, "org.apache.commons.lang3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "java.lang" + "'", str3.equals("java.lang"));
    }

    @Test
    public void ClassUtils0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0092");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0093");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) "java.lang", "String");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0094");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0095");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("Character");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0096");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) 1, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Integer" + "'", str2.equals("Integer"));
    }

    @Test
    public void ClassUtils0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0097");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) (-1L), "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0098");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Integer", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Integer");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0099");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Integer");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Integer");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0100");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) true, "Byte");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0101");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Long", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Long");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0102");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray6, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Class[]" + "'", str9.equals("Class[]"));
    }

    @Test
    public void ClassUtils0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0103");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(obj0, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void ClassUtils0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0104");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Byte", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Byte");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0105");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) '.', "Long");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Character" + "'", str2.equals("Character"));
    }

    @Test
    public void ClassUtils0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0106");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Byte", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Byte");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0107");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Byte");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Byte");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0108");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0109");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Long", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Long");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0110");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("java.lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "lang" + "'", str1.equals("lang"));
    }

    @Test
    public void ClassUtils0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0111");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "");
        java.lang.Class<?> wildcardClass9 = wildcardClassArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Class[]" + "'", str8.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ClassUtils0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0112");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("Byte");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Byte");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0113");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("Byte");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0114");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0115");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) 10, ".");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0116");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("String");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "String" + "'", str1.equals("String"));
    }

    @Test
    public void ClassUtils0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0117");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("Character");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0118");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("String");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "String" + "'", str1.equals("String"));
    }

    @Test
    public void ClassUtils0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0119");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) "hi!", "java.lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0120");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName(".");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0121");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0122");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) (short) 100, "org.apache.commons.lang3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Short" + "'", str2.equals("Short"));
    }

    @Test
    public void ClassUtils0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0123");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "Character", "Class[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0124");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Class[]");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [LClass;");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0125");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0126");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "$", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: $");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0127");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0128");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Class[]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Class");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0129");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Character");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Character");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0130");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ClassUtils0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0131");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(obj0, "Short");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Short" + "'", str2.equals("Short"));
    }

    @Test
    public void ClassUtils0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0132");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("String");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0133");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("Byte");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0134");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) true, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0135");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?> wildcardClass6 = wildcardClassArray5.getClass();
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClass6, "lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "java.lang" + "'", str8.equals("java.lang"));
    }

    @Test
    public void ClassUtils0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0136");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0137");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "lang" + "'", str1.equals("lang"));
    }

    @Test
    public void ClassUtils0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0138");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) 100.0f, "Double");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Float" + "'", str2.equals("Float"));
    }

    @Test
    public void ClassUtils0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0139");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("lang3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0140");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?> wildcardClass6 = wildcardClassArray5.getClass();
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClass6, "Long");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Class" + "'", str8.equals("Class"));
    }

    @Test
    public void ClassUtils0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0141");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "lang" + "'", str1.equals("lang"));
    }

    @Test
    public void ClassUtils0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0142");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "Object", "String");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0143");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("Class[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Class[]" + "'", str1.equals("Class[]"));
    }

    @Test
    public void ClassUtils0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0144");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "lang3");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: lang3");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0145");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) (byte) 0, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Byte" + "'", str2.equals("Byte"));
    }

    @Test
    public void ClassUtils0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0146");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<java.lang.Class<?>> wildcardClassList1 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClassList1);
    }

    @Test
    public void ClassUtils0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0147");
        java.lang.String[] strArray4 = new java.lang.String[] { ".", "Object", "Character", "Short" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.Class<?>> wildcardClassList7 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList5);
        java.lang.Class<?> wildcardClass8 = wildcardClassList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ClassUtils0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0148");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("java.lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "java" + "'", str1.equals("java"));
    }

    @Test
    public void ClassUtils0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0149");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ArrayList", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ArrayList");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0150");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = null;
        boolean boolean6 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray2, wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClassArray7);
    }

    @Test
    public void ClassUtils0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0151");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName(obj0, "Float");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Float" + "'", str2.equals("Float"));
    }

    @Test
    public void ClassUtils0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0152");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("ArrayList");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0153");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Long");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Long");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0154");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("Class");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Class" + "'", str1.equals("Class"));
    }

    @Test
    public void ClassUtils0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0155");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void ClassUtils0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0156");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) (byte) -1, "Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0157");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("Float");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Float" + "'", str1.equals("Float"));
    }

    @Test
    public void ClassUtils0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0158");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray6, "Integer");
        java.lang.Class<?> wildcardClass9 = wildcardClassArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Class[]" + "'", str8.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ClassUtils0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0159");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("org.apache.commons.lang3");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org.apache.commons.lang3");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0160");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) 100L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0161");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("lang3", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: lang3");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0162");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "java.lang", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java/lang");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0163");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) ".", "Double");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0164");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("$");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "." + "'", str1.equals("."));
    }

    @Test
    public void ClassUtils0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0165");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) 100.0f, "org.apache.commons.lang3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0166");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Character", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Character");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0167");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("org.apache.commons.lang3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "org.apache.commons" + "'", str1.equals("org.apache.commons"));
    }

    @Test
    public void ClassUtils0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0168");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Float", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Float");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0169");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0170");
        java.lang.String[] strArray4 = new java.lang.String[] { ".", "Object", "Character", "Short" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.Class<?>> wildcardClassList7 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList5);
        java.util.List<java.lang.Class<?>> wildcardClassList8 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList5);
        java.util.List<java.lang.Class<?>> wildcardClassList9 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList9);
    }

    @Test
    public void ClassUtils0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0171");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClass1, "Short");
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "Short", "String");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "java.lang" + "'", str3.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
    }

    @Test
    public void ClassUtils0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0172");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0173");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "Class[]");
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Class[]" + "'", str8.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0174");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) 0.0f, "ArrayList");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Float" + "'", str2.equals("Float"));
    }

    @Test
    public void ClassUtils0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0175");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "Object", "Long");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0176");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("org.apache.commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "commons" + "'", str1.equals("commons"));
    }

    @Test
    public void ClassUtils0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0177");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "ClassUtils", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0178");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray3, "Float");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.lang" + "'", str9.equals("java.lang"));
    }

    @Test
    public void ClassUtils0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0179");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("String");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0180");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "org.apache.commons.lang3", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org/apache/commons/lang3");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0181");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("Short");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0182");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("Float");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Float" + "'", str1.equals("Float"));
    }

    @Test
    public void ClassUtils0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0183");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Character", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Character");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0184");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Class[]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [LClass;");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0185");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Object" + "'", str1.equals("Object"));
    }

    @Test
    public void ClassUtils0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0186");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?> wildcardClass6 = wildcardClassArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ClassUtils0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0187");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) 10.0f, "ClassUtils");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Float" + "'", str2.equals("Float"));
    }

    @Test
    public void ClassUtils0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0188");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) 100L, "java");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0189");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName(obj0, "hi!");
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) str2, "Double");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Object" + "'", str2.equals("Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "String" + "'", str4.equals("String"));
    }

    @Test
    public void ClassUtils0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0190");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("org.apache.commons");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org.apache.commons");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0191");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = null;
        boolean boolean6 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray2, wildcardClassArray5);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray5, "Integer");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Integer" + "'", str8.equals("Integer"));
    }

    @Test
    public void ClassUtils0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0192");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?> wildcardClass6 = wildcardClassArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ClassUtils0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0193");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("Long");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Long" + "'", str1.equals("Long"));
    }

    @Test
    public void ClassUtils0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0194");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) 1.0f, "lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0195");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0196");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("org.apache.commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "org.apache" + "'", str1.equals("org.apache"));
    }

    @Test
    public void ClassUtils0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0197");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("java");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0198");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) 1.0f, "Integer");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Float" + "'", str2.equals("Float"));
    }

    @Test
    public void ClassUtils0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0199");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ClassUtils0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0200");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0201");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "org.apache", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org/apache");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0202");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("Class");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Class");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0203");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Class", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Class");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0204");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) 0.0d, "ClassUtils");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Double" + "'", str2.equals("Double"));
    }

    @Test
    public void ClassUtils0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0205");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) (short) 0, "Integer");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Short" + "'", str2.equals("Short"));
    }

    @Test
    public void ClassUtils0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0206");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) '.', "org.apache.commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Character" + "'", str2.equals("Character"));
    }

    @Test
    public void ClassUtils0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0207");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("org.apache.commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "org.apache" + "'", str1.equals("org.apache"));
    }

    @Test
    public void ClassUtils0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0208");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) 1, "java");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0209");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "ClassUtils", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0210");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "Integer", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0211");
        java.lang.String[] strArray1 = new java.lang.String[] { "$" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.Class<?>> wildcardClassList4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList5 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList6 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) strList2, "ClassUtils");
        java.util.List<java.lang.Class<?>> wildcardClassList9 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ArrayList" + "'", str8.equals("ArrayList"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList9);
    }

    @Test
    public void ClassUtils0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0212");
        java.lang.String[] strArray1 = new java.lang.String[] { "$" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.Class<?>> wildcardClassList4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassList4, ".");
        java.lang.Class<?> wildcardClass7 = wildcardClassList4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ArrayList" + "'", str6.equals("ArrayList"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ClassUtils0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0213");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) (short) -1, "Float");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Short" + "'", str2.equals("Short"));
    }

    @Test
    public void ClassUtils0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0214");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(".");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0215");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("Float");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0216");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0217");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "java.lang", "Short");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "String" + "'", str7.equals("String"));
    }

    @Test
    public void ClassUtils0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0218");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0219");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("org.apache", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org.apache");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0220");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ClassUtils0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0221");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("java");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "java" + "'", str1.equals("java"));
    }

    @Test
    public void ClassUtils0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0222");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) 10.0f, "String");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0223");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("$", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: $");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0224");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("Float");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0225");
        java.lang.String[] strArray1 = new java.lang.String[] { "$" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.Class<?>> wildcardClassList4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList5 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList6 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList7 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList8 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList9 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList9);
    }

    @Test
    public void ClassUtils0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0226");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("org.apache.commons.lang3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "org.apache.commons" + "'", str1.equals("org.apache.commons"));
    }

    @Test
    public void ClassUtils0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0227");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0228");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray3, ".");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0229");
        java.lang.String[] strArray3 = new java.lang.String[] { "lang3", "commons", "Float" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<java.lang.Class<?>> wildcardClassList6 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList4);
        java.lang.Class<?> wildcardClass7 = strList4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ClassUtils0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0230");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Object");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Object");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0231");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Float", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Float");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0232");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) (byte) 100, "Long");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Byte" + "'", str2.equals("Byte"));
    }

    @Test
    public void ClassUtils0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0233");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray3, "$");
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Class[]" + "'", str8.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0234");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("Byte");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Byte" + "'", str1.equals("Byte"));
    }

    @Test
    public void ClassUtils0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0235");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0236");
        java.lang.String[] strArray1 = new java.lang.String[] { "$" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.Class<?>> wildcardClassList4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList5 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.Class<?> wildcardClass6 = wildcardClassList5.getClass();
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassList5, "Float");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ArrayList" + "'", str8.equals("ArrayList"));
    }

    @Test
    public void ClassUtils0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0237");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0238");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray3, ".");
        java.lang.Class<?> wildcardClass6 = wildcardClassArray3.getClass();
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClass6, "org.apache.commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Class" + "'", str8.equals("Class"));
    }

    @Test
    public void ClassUtils0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0239");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("java");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0240");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName(obj0, "Character");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Character" + "'", str2.equals("Character"));
    }

    @Test
    public void ClassUtils0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0241");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "$");
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) str5, "commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "java.lang" + "'", str7.equals("java.lang"));
    }

    @Test
    public void ClassUtils0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0242");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("ClassUtils");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ClassUtils" + "'", str1.equals("ClassUtils"));
    }

    @Test
    public void ClassUtils0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0243");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray6);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray7, "lang3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Class[]" + "'", str9.equals("Class[]"));
    }

    @Test
    public void ClassUtils0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0244");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("Class");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0245");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Float");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Float");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0246");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) '4', "lang3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Character" + "'", str2.equals("Character"));
    }

    @Test
    public void ClassUtils0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0247");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0248");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray3, ".");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray7, "lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.lang" + "'", str9.equals("java.lang"));
    }

    @Test
    public void ClassUtils0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0249");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0250");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Float", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Float");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0251");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "Double", "Integer");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0252");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("lang3", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: lang3");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0253");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("Double");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Double");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0254");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0255");
        org.apache.commons.lang3.ClassUtils classUtils0 = new org.apache.commons.lang3.ClassUtils();
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) classUtils0, "Integer");
        java.lang.Class<?> wildcardClass3 = classUtils0.getClass();
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) classUtils0, "Float");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ClassUtils" + "'", str2.equals("ClassUtils"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3" + "'", str5.equals("org.apache.commons.lang3"));
    }

    @Test
    public void ClassUtils0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0256");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Object", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Object");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0257");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "Class[]");
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Class[]" + "'", str8.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0258");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "$");
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, ".");
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) str7, "Byte");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Class[]" + "'", str7.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "String" + "'", str9.equals("String"));
    }

    @Test
    public void ClassUtils0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0259");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("$");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0260");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, ".", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0261");
        java.lang.String[] strArray1 = new java.lang.String[] { "$" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.Class<?>> wildcardClassList4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strList2, "ArrayList");
        java.util.List<java.lang.Class<?>> wildcardClassList7 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassList7, "java.lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ArrayList" + "'", str6.equals("ArrayList"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ArrayList" + "'", str9.equals("ArrayList"));
    }

    @Test
    public void ClassUtils0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0262");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = null;
        boolean boolean6 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray2, wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray2);
        java.lang.Class<?> wildcardClass8 = wildcardClassArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ClassUtils0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0263");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray4, "lang3");
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray7, "Float");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "java.lang" + "'", str6.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.lang" + "'", str9.equals("java.lang"));
    }

    @Test
    public void ClassUtils0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0264");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("Short");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0265");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) "commons", "java");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0266");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "lang", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: lang");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0267");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray5, "String");
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "String", "org.apache");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Class[]" + "'", str7.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.lang" + "'", str9.equals("java.lang"));
    }

    @Test
    public void ClassUtils0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0268");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Object", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Object");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0269");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Long", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Long");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0270");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray3, ".");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray6, "Byte");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.lang" + "'", str9.equals("java.lang"));
    }

    @Test
    public void ClassUtils0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0271");
        java.lang.String[] strArray1 = new java.lang.String[] { "$" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.Class<?>> wildcardClassList4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strList2, "ArrayList");
        java.util.List<java.lang.Class<?>> wildcardClassList7 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) strList2, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ArrayList" + "'", str6.equals("ArrayList"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.util" + "'", str9.equals("java.util"));
    }

    @Test
    public void ClassUtils0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0272");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(obj0, "Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Object" + "'", str2.equals("Object"));
    }

    @Test
    public void ClassUtils0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0273");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) '.', "lang3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Character" + "'", str2.equals("Character"));
    }

    @Test
    public void ClassUtils0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0274");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray3, ".");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0275");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) ' ', "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0276");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("java");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "java" + "'", str1.equals("java"));
    }

    @Test
    public void ClassUtils0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0277");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("Character");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Character" + "'", str1.equals("Character"));
    }

    @Test
    public void ClassUtils0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0278");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("Short");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Short");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0279");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("java.lang");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java.lang");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0280");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0281");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("java.util");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "java" + "'", str1.equals("java"));
    }

    @Test
    public void ClassUtils0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0282");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray4, "lang3");
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?> wildcardClass8 = wildcardClassArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "java.lang" + "'", str6.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ClassUtils0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0283");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) 10.0f, "Byte");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0284");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "java.util", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java/util");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0285");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) (short) 100, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Short" + "'", str2.equals("Short"));
    }

    @Test
    public void ClassUtils0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0286");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) ".", "Long");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0287");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray3, "Byte");
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Class[]" + "'", str8.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0288");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Short", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Short");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0289");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "String");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: String");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0290");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "java.util", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java/util");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0291");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Double", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Double");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0292");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0293");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName(obj0, "");
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "", "java");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "String" + "'", str4.equals("String"));
    }

    @Test
    public void ClassUtils0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0294");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("org.apache.commons.lang3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "lang3" + "'", str1.equals("lang3"));
    }

    @Test
    public void ClassUtils0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0295");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("org.apache");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org.apache");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0296");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = null;
        boolean boolean8 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void ClassUtils0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0297");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = null;
        boolean boolean6 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray2, wildcardClassArray5);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) boolean6, "org.apache.commons.lang3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Boolean" + "'", str8.equals("Boolean"));
    }

    @Test
    public void ClassUtils0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0298");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0299");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("lang3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0300");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "commons" + "'", str1.equals("commons"));
    }

    @Test
    public void ClassUtils0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0301");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("Double");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0302");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) "ArrayList", "String");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0303");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0304");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("Float");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Float");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0305");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0306");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Boolean", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Boolean");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0307");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "org.apache");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org/apache");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0308");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("org.apache.commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "commons" + "'", str1.equals("commons"));
    }

    @Test
    public void ClassUtils0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0309");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("commons");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: commons");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0310");
        java.lang.String[] strArray4 = new java.lang.String[] { ".", "Object", "Character", "Short" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.Class<?>> wildcardClassList7 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList5);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strList5, "java.lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ArrayList" + "'", str9.equals("ArrayList"));
    }

    @Test
    public void ClassUtils0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0311");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "String", "commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0312");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "commons" + "'", str1.equals("commons"));
    }

    @Test
    public void ClassUtils0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0313");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) 10L, "java.lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0314");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = null;
        boolean boolean6 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray2, wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray2);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray2, "Character");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Class[]" + "'", str9.equals("Class[]"));
    }

    @Test
    public void ClassUtils0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0315");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0316");
        java.lang.String[] strArray1 = new java.lang.String[] { "$" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.Class<?>> wildcardClassList4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList5 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList6 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassList6, "Float");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "java.util" + "'", str8.equals("java.util"));
    }

    @Test
    public void ClassUtils0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0317");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray7, "Class[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Class[]" + "'", str9.equals("Class[]"));
    }

    @Test
    public void ClassUtils0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0318");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "hi!", "Long");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0319");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) (byte) 0, "Class");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Byte" + "'", str2.equals("Byte"));
    }

    @Test
    public void ClassUtils0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0320");
        java.lang.Object[] objArray0 = null;
        java.lang.Class<?>[] wildcardClassArray1 = org.apache.commons.lang3.ClassUtils.toClass(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClassArray1);
    }

    @Test
    public void ClassUtils0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0321");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray6);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray7, "org.apache");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.lang" + "'", str9.equals("java.lang"));
    }

    @Test
    public void ClassUtils0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0322");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("ClassUtils");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0323");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "org.apache.commons.lang3", "org.apache.commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0324");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "Class", "Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0325");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(obj0, "Double");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Double" + "'", str2.equals("Double"));
    }

    @Test
    public void ClassUtils0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0326");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ClassUtils0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0327");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray6, "Boolean");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Class[]" + "'", str8.equals("Class[]"));
    }

    @Test
    public void ClassUtils0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0328");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("Boolean");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Boolean" + "'", str1.equals("Boolean"));
    }

    @Test
    public void ClassUtils0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0329");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("java.util");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "util" + "'", str1.equals("util"));
    }

    @Test
    public void ClassUtils0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0330");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "Class[]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0331");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) "String", "Character");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0332");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("Integer");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0333");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("Class");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Class" + "'", str1.equals("Class"));
    }

    @Test
    public void ClassUtils0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0334");
        java.lang.String[] strArray1 = new java.lang.String[] { "$" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.Class<?>> wildcardClassList4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strList2, "ArrayList");
        java.util.List<java.lang.Class<?>> wildcardClassList7 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList8 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList9 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ArrayList" + "'", str6.equals("ArrayList"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList9);
    }

    @Test
    public void ClassUtils0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0335");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0336");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0337");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?> wildcardClass8 = wildcardClassArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ClassUtils0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0338");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?> wildcardClass5 = wildcardClassArray4.getClass();
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClass5, "$");
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) str7, "Boolean");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Class" + "'", str7.equals("Class"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.lang" + "'", str9.equals("java.lang"));
    }

    @Test
    public void ClassUtils0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0339");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(".");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0340");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) 100L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Long" + "'", str2.equals("Long"));
    }

    @Test
    public void ClassUtils0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0341");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("util");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0342");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("$", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: $");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0343");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("Boolean");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0344");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) (byte) -1, "org.apache");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Byte" + "'", str2.equals("Byte"));
    }

    @Test
    public void ClassUtils0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0345");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?> wildcardClass5 = wildcardClassArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ClassUtils0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0346");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("org.apache");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "org" + "'", str1.equals("org"));
    }

    @Test
    public void ClassUtils0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0347");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray7, ".");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.lang" + "'", str9.equals("java.lang"));
    }

    @Test
    public void ClassUtils0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0348");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0349");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray3, ".");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray6, "Boolean");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Class[]" + "'", str9.equals("Class[]"));
    }

    @Test
    public void ClassUtils0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0350");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("java.util");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "util" + "'", str1.equals("util"));
    }

    @Test
    public void ClassUtils0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0351");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) "org.apache.commons", "org");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0352");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        boolean boolean7 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray6);
        java.lang.Class<?> wildcardClass8 = wildcardClassArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ClassUtils0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0353");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) "org", "String");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0354");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("Class");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0355");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "lang3", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: lang3");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0356");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) 0.0f, "org.apache.commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Float" + "'", str2.equals("Float"));
    }

    @Test
    public void ClassUtils0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0357");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName(obj0, "hi!");
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) "hi!", "java.lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Object" + "'", str2.equals("Object"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "String" + "'", str4.equals("String"));
    }

    @Test
    public void ClassUtils0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0358");
        java.lang.String[] strArray1 = new java.lang.String[] { "$" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.Class<?>> wildcardClassList4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList5 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList6 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList7 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassList7, "Integer");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.util" + "'", str9.equals("java.util"));
    }

    @Test
    public void ClassUtils0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0359");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("commons", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: commons");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0360");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) (byte) 100, "Character");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Byte" + "'", str2.equals("Byte"));
    }

    @Test
    public void ClassUtils0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0361");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray5, "String");
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) str7, "Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Class[]" + "'", str7.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.lang" + "'", str9.equals("java.lang"));
    }

    @Test
    public void ClassUtils0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0362");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Boolean", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Boolean");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0363");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("ClassUtils", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ClassUtils");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0364");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("ClassUtils");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0365");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray6, "Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.lang" + "'", str9.equals("java.lang"));
    }

    @Test
    public void ClassUtils0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0366");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Short", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Short");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0367");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?> wildcardClass6 = wildcardClassArray5.getClass();
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray5, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "java.lang" + "'", str8.equals("java.lang"));
    }

    @Test
    public void ClassUtils0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0368");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("org");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0369");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) (byte) 100, "commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0370");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "java.util", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0371");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) 1L, "Class[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Long" + "'", str2.equals("Long"));
    }

    @Test
    public void ClassUtils0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0372");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray7, "Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Class[]" + "'", str9.equals("Class[]"));
    }

    @Test
    public void ClassUtils0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0373");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "java", "util");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0374");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "commons", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: commons");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0375");
        java.lang.String[] strArray3 = new java.lang.String[] { "lang3", "commons", "Float" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<java.lang.Class<?>> wildcardClassList6 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList4);
        java.util.List<java.lang.Class<?>> wildcardClassList7 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList4);
        java.lang.Class<?> wildcardClass8 = wildcardClassList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ClassUtils0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0376");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("Byte");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Byte" + "'", str1.equals("Byte"));
    }

    @Test
    public void ClassUtils0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0377");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "Character", "Byte");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0378");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) 0.0d, "java");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Double" + "'", str2.equals("Double"));
    }

    @Test
    public void ClassUtils0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0379");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray4, "Double");
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Class[]" + "'", str8.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0380");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) (byte) 1, "lang3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0381");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(obj0, "commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "commons" + "'", str2.equals("commons"));
    }

    @Test
    public void ClassUtils0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0382");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(obj0, "org.apache");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache" + "'", str2.equals("org.apache"));
    }

    @Test
    public void ClassUtils0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0383");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) 0L, "commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0384");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(".", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0385");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("java.lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "java" + "'", str1.equals("java"));
    }

    @Test
    public void ClassUtils0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0386");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("Character");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Character" + "'", str1.equals("Character"));
    }

    @Test
    public void ClassUtils0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0387");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray3, ".");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray3, "String");
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Class[]" + "'", str8.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0388");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName(obj0, "lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "lang" + "'", str2.equals("lang"));
    }

    @Test
    public void ClassUtils0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0389");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Short", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Short");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0390");
        java.lang.String[] strArray1 = new java.lang.String[] { "$" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.Class<?>> wildcardClassList4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList5 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList6 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList7 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassList7, "Class[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ArrayList" + "'", str9.equals("ArrayList"));
    }

    @Test
    public void ClassUtils0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0391");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) 100.0d, "Byte");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Double" + "'", str2.equals("Double"));
    }

    @Test
    public void ClassUtils0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0392");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("lang", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: lang");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0393");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray4, "lang3");
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray7, "Long");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "java.lang" + "'", str6.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Class[]" + "'", str9.equals("Class[]"));
    }

    @Test
    public void ClassUtils0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0394");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray3, ".");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?> wildcardClass7 = wildcardClassArray6.getClass();
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClass7, "ClassUtils");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Class" + "'", str9.equals("Class"));
    }

    @Test
    public void ClassUtils0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0395");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0396");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("org.apache.commons", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org.apache.commons");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0397");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "util", "Short");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0398");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("Object");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Object");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0399");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("ClassUtils");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ClassUtils" + "'", str1.equals("ClassUtils"));
    }

    @Test
    public void ClassUtils0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0400");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("ArrayList");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ArrayList" + "'", str1.equals("ArrayList"));
    }

    @Test
    public void ClassUtils0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0401");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("java.util");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "java" + "'", str1.equals("java"));
    }

    @Test
    public void ClassUtils0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0402");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray7, "lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Class[]" + "'", str9.equals("Class[]"));
    }

    @Test
    public void ClassUtils0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0403");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(obj0, "ClassUtils");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ClassUtils" + "'", str2.equals("ClassUtils"));
    }

    @Test
    public void ClassUtils0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0404");
        java.lang.String[] strArray1 = new java.lang.String[] { "$" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.Class<?>> wildcardClassList4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassList4, "java.lang");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "java.lang", "java.util");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ArrayList" + "'", str6.equals("ArrayList"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "java.lang" + "'", str8.equals("java.lang"));
    }

    @Test
    public void ClassUtils0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0405");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ArrayList");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ArrayList");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0406");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray6, "Boolean");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.lang" + "'", str9.equals("java.lang"));
    }

    @Test
    public void ClassUtils0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0407");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName(obj0, "java.util");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.util" + "'", str2.equals("java.util"));
    }

    @Test
    public void ClassUtils0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0408");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0409");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray4, "Double");
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Class[]" + "'", str8.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0410");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray8 = null;
        boolean boolean9 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void ClassUtils0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0411");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) 10.0f, "Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0412");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("ArrayList");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0413");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "lang", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: lang");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0414");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(obj0, "org.apache.commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons" + "'", str2.equals("org.apache.commons"));
    }

    @Test
    public void ClassUtils0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0415");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("org");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "org" + "'", str1.equals("org"));
    }

    @Test
    public void ClassUtils0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0416");
        java.lang.String[] strArray1 = new java.lang.String[] { "$" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.Class<?>> wildcardClassList4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList5 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) strList2, "lang3");
        java.util.List<java.lang.Class<?>> wildcardClassList8 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList9 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "java.util" + "'", str7.equals("java.util"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList9);
    }

    @Test
    public void ClassUtils0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0417");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class<?>[] wildcardClassArray1 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClassArray1);
    }

    @Test
    public void ClassUtils0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0418");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) 1, "util");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Integer" + "'", str2.equals("Integer"));
    }

    @Test
    public void ClassUtils0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0419");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray4, "hi!");
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray4, "Boolean");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Class[]" + "'", str7.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Class[]" + "'", str9.equals("Class[]"));
    }

    @Test
    public void ClassUtils0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0420");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("org.apache", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org.apache");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0421");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) (-1), "Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Integer" + "'", str2.equals("Integer"));
    }

    @Test
    public void ClassUtils0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0422");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("java.util", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java.util");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0423");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("util", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: util");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0424");
        org.apache.commons.lang3.ClassUtils classUtils0 = new org.apache.commons.lang3.ClassUtils();
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) classUtils0, "Integer");
        java.lang.Class<?> wildcardClass3 = classUtils0.getClass();
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) classUtils0, "Float");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ClassUtils" + "'", str2.equals("ClassUtils"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3" + "'", str5.equals("org.apache.commons.lang3"));
    }

    @Test
    public void ClassUtils0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0425");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "Integer");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "java.lang" + "'", str8.equals("java.lang"));
    }

    @Test
    public void ClassUtils0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0426");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0427");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(obj0, "commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "commons" + "'", str2.equals("commons"));
    }

    @Test
    public void ClassUtils0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0428");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray4, "lang3");
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray7, "Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "java.lang" + "'", str6.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.lang" + "'", str9.equals("java.lang"));
    }

    @Test
    public void ClassUtils0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0429");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("ClassUtils");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ClassUtils");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0430");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) "java.util", "Byte");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "String" + "'", str2.equals("String"));
    }

    @Test
    public void ClassUtils0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0431");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?> wildcardClass7 = wildcardClassArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ClassUtils0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0432");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) (-1.0d), "Boolean");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0433");
        java.lang.String[] strArray4 = new java.lang.String[] { ".", "Object", "Character", "Short" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.Class<?>> wildcardClassList7 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList5);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassList7, "lang3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ArrayList" + "'", str9.equals("ArrayList"));
    }

    @Test
    public void ClassUtils0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0434");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName(obj0, "util");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "util" + "'", str2.equals("util"));
    }

    @Test
    public void ClassUtils0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0435");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0436");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray4, "hi!");
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) "hi!", "Boolean");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Class[]" + "'", str7.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "String" + "'", str9.equals("String"));
    }

    @Test
    public void ClassUtils0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0437");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Float", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Float");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0438");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(obj0, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void ClassUtils0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0439");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) 1, "ClassUtils");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0440");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?> wildcardClass8 = wildcardClassArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ClassUtils0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0441");
        java.lang.String[] strArray3 = new java.lang.String[] { "lang3", "commons", "Float" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<java.lang.Class<?>> wildcardClassList6 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList4);
        java.util.List<java.lang.Class<?>> wildcardClassList7 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList4);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassList7, "Character");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ArrayList" + "'", str9.equals("ArrayList"));
    }

    @Test
    public void ClassUtils0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0442");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = null;
        boolean boolean6 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray2, wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray2);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray7, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Class[]" + "'", str9.equals("Class[]"));
    }

    @Test
    public void ClassUtils0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0443");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("org.apache.commons.lang3", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org.apache.commons.lang3");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0444");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray3, "Boolean");
        java.lang.Class<?> wildcardClass9 = wildcardClassArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Class[]" + "'", str8.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ClassUtils0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0445");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray3, "org");
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "java.lang" + "'", str8.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0446");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("ClassUtils", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ClassUtils");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0447");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray3, ".");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0448");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "util");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: util");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0449");
        java.lang.String[] strArray1 = new java.lang.String[] { "$" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.Class<?>> wildcardClassList4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList5 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList6 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList7 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassList7, "ArrayList");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.util" + "'", str9.equals("java.util"));
    }

    @Test
    public void ClassUtils0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0450");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("org");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "org" + "'", str1.equals("org"));
    }

    @Test
    public void ClassUtils0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0451");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) 100.0f, "lang3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Float" + "'", str2.equals("Float"));
    }

    @Test
    public void ClassUtils0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0452");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "Short");
        java.lang.Class<?> wildcardClass9 = wildcardClassArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "java.lang" + "'", str8.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ClassUtils0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0453");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(obj0, "util");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Object" + "'", str3.equals("Object"));
    }

    @Test
    public void ClassUtils0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0454");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) (-1.0d), "Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Double" + "'", str2.equals("Double"));
    }

    @Test
    public void ClassUtils0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0455");
        java.lang.String[] strArray1 = new java.lang.String[] { "$" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.Class<?>> wildcardClassList4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassList4, ".");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassList4, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ArrayList" + "'", str6.equals("ArrayList"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ArrayList" + "'", str8.equals("ArrayList"));
    }

    @Test
    public void ClassUtils0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0456");
        java.lang.String[] strArray3 = new java.lang.String[] { "lang3", "commons", "Float" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<java.lang.Class<?>> wildcardClassList6 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList4);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassList6, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "java.util" + "'", str8.equals("java.util"));
    }

    @Test
    public void ClassUtils0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0457");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray2, "ArrayList");
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray2);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray2, "ClassUtils");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Class[]" + "'", str6.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.lang" + "'", str9.equals("java.lang"));
    }

    @Test
    public void ClassUtils0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0458");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "commons", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: commons");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0459");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray6, "commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.lang" + "'", str9.equals("java.lang"));
    }

    @Test
    public void ClassUtils0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0460");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray7, "Double");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Class[]" + "'", str9.equals("Class[]"));
    }

    @Test
    public void ClassUtils0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0461");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "org.apache.commons", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org/apache/commons");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0462");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Byte", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Byte");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0463");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("java", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0464");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) str5, "org.apache.commons");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "String" + "'", str7.equals("String"));
    }

    @Test
    public void ClassUtils0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0465");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("java.util");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java.util");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0466");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0467");
        java.lang.String[] strArray1 = new java.lang.String[] { "Long" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.Class<?>> wildcardClassList4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.util.List<java.lang.Class<?>> wildcardClassList5 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassList5, "");
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "", "Integer");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ArrayList" + "'", str7.equals("ArrayList"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.lang" + "'", str9.equals("java.lang"));
    }

    @Test
    public void ClassUtils0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0468");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray4, "hi!");
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) str7, "Double");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Class[]" + "'", str7.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "String" + "'", str9.equals("String"));
    }

    @Test
    public void ClassUtils0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0469");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("java");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0470");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray6, ".");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.lang" + "'", str9.equals("java.lang"));
    }

    @Test
    public void ClassUtils0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0471");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ClassUtils0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0472");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
    }

    @Test
    public void ClassUtils0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0473");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName(obj0, "Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Object" + "'", str2.equals("Object"));
    }

    @Test
    public void ClassUtils0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0474");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) 100.0f, "ClassUtils");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Float" + "'", str2.equals("Float"));
    }

    @Test
    public void ClassUtils0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0475");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = null;
        boolean boolean6 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray2, wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray2);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray7, ".");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Class[]" + "'", str9.equals("Class[]"));
    }

    @Test
    public void ClassUtils0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0476");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0477");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClass1, "hi!");
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "hi!", "java.lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "java.lang" + "'", str3.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "String" + "'", str5.equals("String"));
    }

    @Test
    public void ClassUtils0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0478");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "String", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: String");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0479");
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("java", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0480");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0481");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray3, "org.apache.commons");
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "org.apache.commons", "Character");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Class[]" + "'", str7.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "String" + "'", str9.equals("String"));
    }

    @Test
    public void ClassUtils0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0482");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray3, "java.lang");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?> wildcardClass8 = wildcardClassArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "java.lang" + "'", str5.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ClassUtils0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0483");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = null;
        boolean boolean6 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray2, wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray2);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray2, "java.lang");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "java.lang" + "'", str9.equals("java.lang"));
    }

    @Test
    public void ClassUtils0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0484");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) (byte) 1, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
    }

    @Test
    public void ClassUtils0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0485");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray2, "ArrayList");
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Class[]" + "'", str6.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0486");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = null;
        boolean boolean6 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray2, wildcardClassArray5);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray5, "Character");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Character" + "'", str8.equals("Character"));
    }

    @Test
    public void ClassUtils0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0487");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray7, "Class[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Class[]" + "'", str9.equals("Class[]"));
    }

    @Test
    public void ClassUtils0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0488");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "org.apache.commons");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org/apache/commons");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0489");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.Class<?> wildcardClass5 = wildcardClassArray4.getClass();
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray4, "Character");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "java.lang" + "'", str7.equals("java.lang"));
    }

    @Test
    public void ClassUtils0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0490");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName(obj0, "");
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) str2, "String");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "java.lang" + "'", str2.equals("java.lang"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "String" + "'", str4.equals("String"));
    }

    @Test
    public void ClassUtils0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0491");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("Boolean");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0492");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray3, ".");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray3);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray3, "String");
        java.lang.Class<?> wildcardClass9 = wildcardClassArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Class[]" + "'", str8.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ClassUtils0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0493");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) wildcardClassArray4, "org.apache.commons");
        java.lang.Class<?> wildcardClass9 = wildcardClassArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Class[]" + "'", str8.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ClassUtils0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0494");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray3, "$");
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Class[]" + "'", str5.equals("Class[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray9);
    }

    @Test
    public void ClassUtils0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0495");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Integer", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Integer");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0496");
        java.lang.String[] strArray1 = new java.lang.String[] { "$" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.Class<?>> wildcardClassList4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getSimpleName((java.lang.Object) strList2, "Class");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) strList2, "java.util");
        java.util.List<java.lang.Class<?>> wildcardClassList9 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ArrayList" + "'", str6.equals("ArrayList"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ArrayList" + "'", str8.equals("ArrayList"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassList9);
    }

    @Test
    public void ClassUtils0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0497");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("util");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ClassUtils0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0498");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in ClassUtils generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ClassUtils");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ClassUtils");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void ClassUtils0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0499");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getSimpleName(obj0, "Integer");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Integer" + "'", str2.equals("Integer"));
    }

    @Test
    public void ClassUtils0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ClassUtils0.ClassUtils0500");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray5);
        boolean boolean8 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray7);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

