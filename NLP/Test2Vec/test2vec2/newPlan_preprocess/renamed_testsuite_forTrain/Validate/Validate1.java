
package Validate;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Validate1 {

    public static boolean debug = false;

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test501");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] { wildcardClass3 };
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.Validate.notEmpty(typeArray4);
        java.lang.reflect.Type[] typeArray6 = org.apache.commons.lang3.Validate.notEmpty(typeArray5);
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notNull(typeArray5);
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.notNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test502");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray1);
        org.apache.commons.lang3.Validate[] validateArray6 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray7 = org.apache.commons.lang3.Validate.noNullElements(validateArray6);
        org.apache.commons.lang3.Validate.validState(true, "hi!", (java.lang.Object[]) validateArray7);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray9 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray2, "", (java.lang.Object[]) validateArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test503");
        org.apache.commons.lang3.Validate[][][] validateArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate[][][] validateArray1 = org.apache.commons.lang3.Validate.noNullElements(validateArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test504");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) 100);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test505");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) strArray4);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.lang.Comparable<java.lang.String>[] strComparableArray9 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test506");
        java.lang.Comparable[][] comparableArray1 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][]) comparableArray1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String>[][] strComparableArray4 = org.apache.commons.lang3.Validate.validIndex(strComparableArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test507");
        org.apache.commons.lang3.Validate validate0 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate3 = org.apache.commons.lang3.Validate.notNull(validate0, "hi!", objArray2);
        org.apache.commons.lang3.Validate validate4 = org.apache.commons.lang3.Validate.notNull(validate0);
        java.lang.Class<?> wildcardClass5 = validate0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test508");
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray2);
        java.lang.String str4 = org.apache.commons.lang3.Validate.notBlank("hi!", "hi!", (java.lang.Object[]) charSequenceArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[][] charSequenceArray5 = org.apache.commons.lang3.Validate.notEmpty(charSequenceArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test509");
        org.apache.commons.lang3.Validate.isTrue(true, "", (-1L));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test510");
        java.lang.Comparable[][][] comparableArray5 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray5;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "hi!", (java.lang.Object[]) strComparableArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "", (java.lang.Object[]) strComparableArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test511");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "", strComparable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test512");
        org.apache.commons.lang3.Validate.isTrue(true, "", 100.0d);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test513");
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray6 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray5);
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (java.lang.Object[]) charSequenceArray6);
        java.lang.Object[][] objArray8 = org.apache.commons.lang3.Validate.notNull((java.lang.Object[][]) charSequenceArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) 'a', "", (java.lang.Object[]) charSequenceArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: ");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test514");
        java.lang.Comparable[][][][] comparableArray1 = new java.lang.Comparable[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[]) strComparableArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test515");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Comparable<java.lang.String>[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.Validate.validIndex("", (int) (short) -1, "", (java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: ");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test516");
        java.lang.Object[][][][] objArray0 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray1 = org.apache.commons.lang3.Validate.noNullElements(objArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[][][] serializableArray2 = org.apache.commons.lang3.Validate.notEmpty((java.io.Serializable[][][]) objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test517");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.Comparable[][] comparableArray3 = new java.lang.Comparable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][]) comparableArray3;
        strComparableArray4[0] = strArray1;
        java.lang.Comparable<java.lang.String>[][] strComparableArray7 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][] strComparableArray8 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray7);
        java.lang.Class<?> wildcardClass9 = strComparableArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test518");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence4 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "", "hi!", (java.lang.Object[]) annotatedElementArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray3);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test519");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] { charSequenceArray3 };
        java.lang.CharSequence[][] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray4);
        java.lang.CharSequence[][] charSequenceArray6 = org.apache.commons.lang3.Validate.notEmpty(charSequenceArray4);
        java.lang.CharSequence[][] charSequenceArray7 = org.apache.commons.lang3.Validate.notNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test520");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "hi!", (java.lang.Comparable<java.lang.String>) "", "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test521");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "hi!", "hi!", (java.lang.Object[]) strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test522");
        java.lang.Comparable[][][] comparableArray5 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray5;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray8 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "", "hi!", (java.lang.Object[]) strComparableArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test523");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence charSequence5 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) strArray4);
        java.io.Serializable serializable6 = org.apache.commons.lang3.Validate.notNull((java.io.Serializable) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + "hi!" + "'", serializable6.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test524");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.Object[] objArray2 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray3 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray0, "", objArray2);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration[] genericDeclarationArray6 = org.apache.commons.lang3.Validate.validIndex(genericDeclarationArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test525");
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray2);
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (java.lang.Object[]) charSequenceArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[] serializableArray6 = org.apache.commons.lang3.Validate.validIndex((java.io.Serializable[]) charSequenceArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test526");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test527");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Object[] objArray6 = null;
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray3, "hi!", objArray6);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) strArray3);
        java.lang.CharSequence[] charSequenceArray9 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test528");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test529");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test530");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] { charSequenceArray5 };
        java.lang.CharSequence[][] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray6);
        java.lang.CharSequence[][] charSequenceArray8 = org.apache.commons.lang3.Validate.notEmpty(charSequenceArray6);
        org.apache.commons.lang3.Validate.validState(true, "hi!", (java.lang.Object[]) charSequenceArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test531");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[][] typeArray1 = org.apache.commons.lang3.Validate.notEmpty(typeArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test532");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.CharSequence charSequence6 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "hi!", (java.lang.Object[]) strComparableArray4);
        java.io.Serializable[][] serializableArray7 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][]) strComparableArray4);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.Validate.notNull((java.lang.Object[]) serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test533");
        java.lang.Object[] objArray3 = null;
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "", "", objArray3);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test534");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (java.lang.Object[]) typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test535");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.notNull(strArray4);
        java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (short) 0, "hi!", (java.lang.Object[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[] charSequenceArray9 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence[]) strArray4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test536");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.Comparable<java.lang.String>[] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Comparable<java.lang.String>[]) strArray1);
        java.lang.Class<?> wildcardClass4 = strComparableArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test537");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "hi!", strComparable2, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test538");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test539");
        org.apache.commons.lang3.Validate validate0 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate3 = org.apache.commons.lang3.Validate.notNull(validate0, "hi!", objArray2);
        java.lang.Class<?> wildcardClass4 = validate0.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.Validate.notNull(wildcardClass4);
        java.lang.reflect.AnnotatedElement annotatedElement6 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.AnnotatedElement) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = annotatedElement6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test540");
        org.apache.commons.lang3.Validate[][] validateArray0 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray1 = org.apache.commons.lang3.Validate.noNullElements(validateArray0);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.Object[] objArray5 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray6 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray3, "", objArray5);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray7 = org.apache.commons.lang3.Validate.notNull(genericDeclarationArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate[][] validateArray8 = org.apache.commons.lang3.Validate.notEmpty(validateArray0, "hi!", (java.lang.Object[]) genericDeclarationArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test541");
        java.lang.Object[][][][][] objArray0 = new java.lang.Object[][][][][] {};
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Object[][][][][] objArray5 = org.apache.commons.lang3.Validate.noNullElements(objArray0, "", (java.lang.Object[]) strArray4);
        java.io.Serializable[][][][] serializableArray6 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][][][]) objArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[][][][] serializableArray8 = org.apache.commons.lang3.Validate.validIndex(serializableArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test542");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.notNull(strArray4);
        java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (short) 0, "hi!", (java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass8 = charSequence7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test543");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        java.lang.reflect.Type type7 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.Type) wildcardClass6);
        java.lang.reflect.GenericDeclaration genericDeclaration8 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.GenericDeclaration) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test544");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        org.apache.commons.lang3.Validate.isTrue(true, "", (java.lang.Object[]) charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test545");
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray4);
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (java.lang.Object[]) charSequenceArray5);
        java.lang.Object[][] objArray7 = org.apache.commons.lang3.Validate.notNull((java.lang.Object[][]) charSequenceArray5);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "hi!", (java.lang.Object[]) charSequenceArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[][] charSequenceArray9 = org.apache.commons.lang3.Validate.notEmpty(charSequenceArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test546");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.Validate.validIndex(annotatedElementArray1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray2);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test547");
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray2);
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (java.lang.Object[]) charSequenceArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[][] charSequenceArray6 = org.apache.commons.lang3.Validate.validIndex(charSequenceArray3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test548");
        org.apache.commons.lang3.Validate[][] validateArray0 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray1 = org.apache.commons.lang3.Validate.noNullElements(validateArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate[][] validateArray7 = org.apache.commons.lang3.Validate.notEmpty(validateArray0, "", (java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test549");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test550");
        org.apache.commons.lang3.Validate[][] validateArray4 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray5 = org.apache.commons.lang3.Validate.noNullElements(validateArray4);
        java.lang.CharSequence charSequence6 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) validateArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "hi!", (java.lang.Object[]) validateArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test551");
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray2);
        java.lang.String str4 = org.apache.commons.lang3.Validate.notEmpty("hi!", "hi!", (java.lang.Object[]) charSequenceArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][] objArray6 = org.apache.commons.lang3.Validate.validIndex((java.lang.Object[][]) charSequenceArray2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test552");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test553");
        org.apache.commons.lang3.Validate[] validateArray4 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray5 = org.apache.commons.lang3.Validate.noNullElements(validateArray4);
        org.apache.commons.lang3.Validate[] validateArray6 = org.apache.commons.lang3.Validate.notNull(validateArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "hi!", "", (java.lang.Object[]) validateArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray6);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test554");
        java.lang.Comparable[][][] comparableArray5 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray5;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        java.lang.String str8 = org.apache.commons.lang3.Validate.notBlank("hi!", "hi!", (java.lang.Object[]) strComparableArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "", "", (java.lang.Object[]) strComparableArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test555");
        java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test556");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        java.lang.CharSequence[] charSequenceArray8 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "hi!", "", (java.lang.Object[]) charSequenceArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test557");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Comparable<java.lang.String>[] strComparableArray5 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.Validate.notEmpty("", "", (java.lang.Object[]) strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test558");
        java.lang.Comparable[][][][] comparableArray1 = new java.lang.Comparable[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String>[][][][] strComparableArray4 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test559");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Object[][][] objArray4 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[][][]) strComparableArray2);
        java.io.Serializable[][] serializableArray5 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][]) strComparableArray2);
        java.io.Serializable[] serializableArray6 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[]) strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test560");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] { charSequenceArray5 };
        java.lang.CharSequence[][] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray6);
        java.lang.String str8 = org.apache.commons.lang3.Validate.notNull("", "hi!", (java.lang.Object[]) charSequenceArray6);
        java.lang.Object[][] objArray9 = org.apache.commons.lang3.Validate.notNull((java.lang.Object[][]) charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test561");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray4);
        org.apache.commons.lang3.Validate.validState(true, "", (java.lang.Object[]) strArray4);
        java.lang.CharSequence[] charSequenceArray8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test562");
        org.apache.commons.lang3.Validate validate0 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate3 = org.apache.commons.lang3.Validate.notNull(validate0, "hi!", objArray2);
        org.apache.commons.lang3.Validate validate4 = org.apache.commons.lang3.Validate.notNull(validate0);
        java.lang.Class<?> wildcardClass5 = validate4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test563");
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray4);
        java.lang.String str6 = org.apache.commons.lang3.Validate.notEmpty("hi!", "hi!", (java.lang.Object[]) charSequenceArray4);
        java.lang.Object[][] objArray7 = org.apache.commons.lang3.Validate.notNull((java.lang.Object[][]) charSequenceArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.Validate.notBlank("", "", (java.lang.Object[]) objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test564");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = null;
        org.apache.commons.lang3.Validate[][] validateArray4 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray5 = org.apache.commons.lang3.Validate.noNullElements(validateArray4);
        org.apache.commons.lang3.Validate.validState(true, "", (java.lang.Object[]) validateArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement[] annotatedElementArray7 = org.apache.commons.lang3.Validate.notEmpty(annotatedElementArray0, "", (java.lang.Object[]) validateArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: ");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test565");
        org.apache.commons.lang3.Validate[] validateArray2 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray3 = org.apache.commons.lang3.Validate.noNullElements(validateArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "", (java.lang.Object[]) validateArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray3);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test566");
        java.lang.Comparable[][][][] comparableArray1 = new java.lang.Comparable[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray5 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.lang.Object[] objArray7 = null;
        java.lang.Object[][][][] objArray8 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[][][][]) strComparableArray3, "", objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test567");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        org.apache.commons.lang3.Validate.inclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", (java.lang.Object[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.Validate.notEmpty(strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test568");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.Comparable[][] comparableArray3 = new java.lang.Comparable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][]) comparableArray3;
        strComparableArray4[0] = strArray1;
        java.lang.Comparable<java.lang.String>[][] strComparableArray7 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray4);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[]) strComparableArray4);
        java.lang.Class<?> wildcardClass9 = strComparableArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test569");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray5 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray6 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray0, annotatedElementArray1, annotatedElementArray2, annotatedElementArray3, annotatedElementArray4, annotatedElementArray5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement[][] annotatedElementArray8 = org.apache.commons.lang3.Validate.validIndex(annotatedElementArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray6);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test570");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test571");
        java.lang.Comparable<java.lang.String>[][] strComparableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String>[][] strComparableArray2 = org.apache.commons.lang3.Validate.validIndex(strComparableArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test572");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("", "hi!", strComparable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test573");
        java.lang.Object[][][][] objArray0 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray1 = org.apache.commons.lang3.Validate.noNullElements(objArray0);
        java.lang.Object[][][][] objArray2 = org.apache.commons.lang3.Validate.notNull(objArray1);
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
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test574");
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray4);
        java.lang.String str6 = org.apache.commons.lang3.Validate.notBlank("hi!", "hi!", (java.lang.Object[]) charSequenceArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.Validate.notEmpty("", "hi!", (java.lang.Object[]) charSequenceArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test575");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", 1L);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test576");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.String str6 = org.apache.commons.lang3.Validate.notBlank("hi!", "hi!", (java.lang.Object[]) strComparableArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][] objArray8 = org.apache.commons.lang3.Validate.validIndex((java.lang.Object[][]) strComparableArray5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test577");
        java.lang.Comparable[][][][] comparableArray1 = new java.lang.Comparable[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.lang.Class<?> wildcardClass5 = strComparableArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test578");
        java.lang.Object[] objArray4 = null;
        org.apache.commons.lang3.Validate.inclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "", "", objArray4);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test579");
        org.apache.commons.lang3.Validate[][] validateArray0 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray1 = org.apache.commons.lang3.Validate.noNullElements(validateArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate[][] validateArray2 = org.apache.commons.lang3.Validate.notEmpty(validateArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray1);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test580");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.notEmpty(typeArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.Validate.notBlank("", "hi!", (java.lang.Object[]) typeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test581");
        java.lang.CharSequence charSequence0 = null;
        java.lang.Object[] objArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence4 = org.apache.commons.lang3.Validate.validIndex(charSequence0, 100, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test582");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test583");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (java.lang.Object[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test584");
        java.lang.Object[][][][] objArray4 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray5 = org.apache.commons.lang3.Validate.noNullElements(objArray4);
        java.lang.String str6 = org.apache.commons.lang3.Validate.notEmpty("hi!", "", (java.lang.Object[]) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (java.lang.Object[]) objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test585");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) (byte) 100);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test586");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.Comparable[][] comparableArray3 = new java.lang.Comparable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][]) comparableArray3;
        strComparableArray4[0] = strArray1;
        java.lang.Comparable<java.lang.String>[][] strComparableArray7 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][] strComparableArray8 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray7);
        java.lang.Object[][] objArray9 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[][]) strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test587");
        java.lang.Comparable[][][][] comparableArray1 = new java.lang.Comparable[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Comparable<java.lang.String>[]) strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][][][] objArray9 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[][][][]) strComparableArray2, "", (java.lang.Object[]) strComparableArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test588");
        org.apache.commons.lang3.Validate[] validateArray4 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray5 = org.apache.commons.lang3.Validate.noNullElements(validateArray4);
        org.apache.commons.lang3.Validate.validState(true, "hi!", (java.lang.Object[]) validateArray5);
        org.apache.commons.lang3.Validate[] validateArray7 = org.apache.commons.lang3.Validate.notNull(validateArray5);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test589");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.CharSequence[] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.notNull(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.validIndex(strArray4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test590");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] { charSequenceArray5 };
        java.lang.CharSequence[][] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "", "", (java.lang.Object[]) charSequenceArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test591");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test592");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] { charSequenceArray5 };
        java.lang.CharSequence[][] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "", "hi!", (java.lang.Object[]) charSequenceArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test593");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) 1L);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test594");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test595");
        java.lang.reflect.Type[][][] typeArray0 = new java.lang.reflect.Type[][][] {};
        org.apache.commons.lang3.Validate[] validateArray2 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray3 = org.apache.commons.lang3.Validate.noNullElements(validateArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[][][] typeArray4 = org.apache.commons.lang3.Validate.notEmpty(typeArray0, "hi!", (java.lang.Object[]) validateArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray3);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test596");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test597");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) (short) 100);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test598");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) 10.0f);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test599");
        java.lang.Object[][][][][] objArray3 = new java.lang.Object[][][][][] {};
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        java.lang.Object[][][][][] objArray8 = org.apache.commons.lang3.Validate.noNullElements(objArray3, "", (java.lang.Object[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "hi!", "hi!", (java.lang.Object[]) strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test600");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test601");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.Object[] objArray5 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray6 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray3, "", objArray5);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray7 = org.apache.commons.lang3.Validate.notNull(genericDeclarationArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.Validate.validIndex("", (int) (byte) -1, "hi!", (java.lang.Object[]) genericDeclarationArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: hi!");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test602");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray5);
        java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (byte) 0, "hi!", (java.lang.Object[]) strArray5);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[]) strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test603");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Object[] objArray6 = null;
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray3, "hi!", objArray6);
        java.lang.String str8 = org.apache.commons.lang3.Validate.notBlank("hi!", "hi!", objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test604");
        java.io.Serializable[][] serializableArray0 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray1 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray2 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray3 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray4 = new java.io.Serializable[][] {};
        java.io.Serializable[][][] serializableArray5 = new java.io.Serializable[][][] { serializableArray0, serializableArray1, serializableArray2, serializableArray3, serializableArray4 };
        java.io.Serializable[][][] serializableArray6 = org.apache.commons.lang3.Validate.noNullElements(serializableArray5);
        java.io.Serializable[][] serializableArray7 = org.apache.commons.lang3.Validate.notEmpty((java.io.Serializable[][]) serializableArray6);
        java.io.Serializable[] serializableArray8 = org.apache.commons.lang3.Validate.notNull((java.io.Serializable[]) serializableArray7);
        java.lang.Class<?> wildcardClass9 = serializableArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test605");
        java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("hi!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test606");
        java.io.Serializable[][][][] serializableArray0 = new java.io.Serializable[][][][] {};
        java.io.Serializable[][][][] serializableArray1 = new java.io.Serializable[][][][] {};
        java.io.Serializable[][][][] serializableArray2 = new java.io.Serializable[][][][] {};
        java.io.Serializable[][][][][] serializableArray3 = new java.io.Serializable[][][][][] { serializableArray0, serializableArray1, serializableArray2 };
        org.apache.commons.lang3.Validate[][] validateArray5 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray6 = org.apache.commons.lang3.Validate.noNullElements(validateArray5);
        org.apache.commons.lang3.Validate[][] validateArray7 = org.apache.commons.lang3.Validate.notNull(validateArray5);
        java.io.Serializable[][][][][] serializableArray8 = org.apache.commons.lang3.Validate.notEmpty(serializableArray3, "", (java.lang.Object[]) validateArray5);
        java.io.Serializable[][][][] serializableArray9 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][][][]) serializableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test607");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.CharSequence[] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        java.lang.Object[] objArray6 = null;
        java.lang.Object obj7 = org.apache.commons.lang3.Validate.notNull((java.lang.Object) wildcardClass4, "hi!", objArray6);
        java.lang.reflect.Type type8 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.Type) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "class [Ljava.lang.String;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test608");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.notNull(strArray4);
        java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (short) 0, "hi!", (java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test609");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.notNull(strArray4);
        java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (short) 0, "hi!", (java.lang.Object[]) strArray4);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test610");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.CharSequence[] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray2);
        java.lang.CharSequence[] charSequenceArray4 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray2);
        java.lang.Object[] objArray6 = null;
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray2, "hi!", objArray6);
        java.lang.Class<?> wildcardClass8 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test611");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.CharSequence[] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.notNull(strArray2);
        java.lang.Comparable<java.lang.String>[] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Comparable<java.lang.String>[]) strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test612");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray4);
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test613");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "", "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test614");
        java.io.Serializable[][][][] serializableArray4 = new java.io.Serializable[][][][] {};
        java.io.Serializable[][][][][] serializableArray5 = new java.io.Serializable[][][][][] { serializableArray4 };
        java.io.Serializable[][][][][] serializableArray6 = org.apache.commons.lang3.Validate.noNullElements(serializableArray5);
        java.io.Serializable[][][][][] serializableArray7 = org.apache.commons.lang3.Validate.noNullElements(serializableArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", (java.lang.Object[]) serializableArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test615");
        org.apache.commons.lang3.Validate[] validateArray3 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray4 = org.apache.commons.lang3.Validate.noNullElements(validateArray3);
        org.apache.commons.lang3.Validate[] validateArray5 = org.apache.commons.lang3.Validate.notNull(validateArray4);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "hi!", "hi!", (java.lang.Object[]) validateArray4);
        org.apache.commons.lang3.Validate[] validateArray7 = org.apache.commons.lang3.Validate.noNullElements(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test616");
        java.lang.Comparable[][][] comparableArray4 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray4;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray5);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.notNull(strComparableArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.Validate.validIndex("", (-1), "hi!", (java.lang.Object[]) strComparableArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: hi!");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test617");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test618");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.CharSequence[] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray2);
        java.lang.CharSequence[] charSequenceArray4 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray2);
        java.lang.Object[] objArray6 = null;
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray2, "hi!", objArray6);
        java.lang.CharSequence[] charSequenceArray8 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test619");
        java.io.Serializable[][][][] serializableArray2 = new java.io.Serializable[][][][] {};
        java.io.Serializable[][][][][] serializableArray3 = new java.io.Serializable[][][][][] { serializableArray2 };
        java.io.Serializable[][][][][] serializableArray4 = org.apache.commons.lang3.Validate.noNullElements(serializableArray3);
        java.io.Serializable[][][][] serializableArray5 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][][][]) serializableArray3);
        java.lang.CharSequence charSequence6 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test620");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable1 = org.apache.commons.lang3.Validate.notNull(strComparable0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test621");
        org.apache.commons.lang3.Validate validate3 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate6 = org.apache.commons.lang3.Validate.notNull(validate3, "hi!", objArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.Validate.validIndex("", (int) (short) 0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: hi!");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate6);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test622");
        java.lang.Object[][][][][] objArray2 = new java.lang.Object[][][][][] {};
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.Object[][][][][] objArray7 = org.apache.commons.lang3.Validate.noNullElements(objArray2, "", (java.lang.Object[]) strArray6);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test623");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) '4');
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test624");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) 0.0f);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test625");
        org.apache.commons.lang3.Validate[] validateArray5 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray6 = org.apache.commons.lang3.Validate.noNullElements(validateArray5);
        org.apache.commons.lang3.Validate[] validateArray7 = org.apache.commons.lang3.Validate.notNull(validateArray6);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "hi!", "hi!", (java.lang.Object[]) validateArray6);
        org.apache.commons.lang3.Validate.isTrue(true, "", (java.lang.Object[]) validateArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test626");
        java.lang.Object[][][][][] objArray0 = new java.lang.Object[][][][][] {};
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Object[][][][][] objArray5 = org.apache.commons.lang3.Validate.noNullElements(objArray0, "", (java.lang.Object[]) strArray4);
        java.io.Serializable[][][][] serializableArray6 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][][][]) objArray0);
        java.io.Serializable[][][] serializableArray7 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][][]) objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test627");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) (short) 100);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test628");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test629");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test630");
        org.apache.commons.lang3.Validate[][] validateArray2 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray3 = org.apache.commons.lang3.Validate.noNullElements(validateArray2);
        org.apache.commons.lang3.Validate[][] validateArray4 = org.apache.commons.lang3.Validate.notNull(validateArray2);
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (java.lang.Object[]) validateArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate[][] validateArray7 = org.apache.commons.lang3.Validate.validIndex(validateArray4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test631");
        java.lang.String[][] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[][] strArray1 = org.apache.commons.lang3.Validate.notEmpty(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated array is empty");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test632");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.Comparable<java.lang.String>[] strComparableArray3 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray1);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.Object[] objArray7 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray8 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray5, "", objArray7);
        java.io.Serializable serializable9 = org.apache.commons.lang3.Validate.notNull((java.io.Serializable) strComparableArray3, "hi!", objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test633");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray4);
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray8 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test634");
        org.apache.commons.lang3.Validate[][] validateArray4 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray5 = org.apache.commons.lang3.Validate.noNullElements(validateArray4);
        org.apache.commons.lang3.Validate[][] validateArray6 = org.apache.commons.lang3.Validate.notNull(validateArray4);
        org.apache.commons.lang3.Validate[][] validateArray7 = org.apache.commons.lang3.Validate.notNull(validateArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", (java.lang.Object[]) validateArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test635");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test636");
        org.apache.commons.lang3.Validate[][] validateArray2 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray3 = org.apache.commons.lang3.Validate.noNullElements(validateArray2);
        org.apache.commons.lang3.Validate[][] validateArray4 = org.apache.commons.lang3.Validate.notNull(validateArray2);
        org.apache.commons.lang3.Validate.validState(true, "", (java.lang.Object[]) validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test637");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] { charSequenceArray5 };
        java.lang.CharSequence[][] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "", "hi!", (java.lang.Object[]) charSequenceArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test638");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = org.apache.commons.lang3.Validate.validIndex((java.lang.Object[]) strArray7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test639");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.io.Serializable[][][][] serializableArray4 = new java.io.Serializable[][][][] {};
        java.io.Serializable[][][][][] serializableArray5 = new java.io.Serializable[][][][][] { serializableArray4 };
        java.io.Serializable[][][][][] serializableArray6 = org.apache.commons.lang3.Validate.noNullElements(serializableArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("", "hi!", strComparable2, "hi!", (java.lang.Object[]) serializableArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test640");
        java.lang.Object[][][][][][] objArray0 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray1 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray2 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray3 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray4 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray5 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][][] objArray6 = new java.lang.Object[][][][][][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][][][][][][] objArray8 = org.apache.commons.lang3.Validate.validIndex(objArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test641");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.Comparable<java.lang.String> strComparable6 = org.apache.commons.lang3.Validate.notNull((java.lang.Comparable<java.lang.String>) "", "", (java.lang.Object[]) charSequenceArray5);
        java.lang.Class<?> wildcardClass7 = charSequenceArray5.getClass();
        java.lang.Class<?> wildcardClass8 = org.apache.commons.lang3.Validate.notNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test642");
        java.io.Serializable[][][][] serializableArray2 = new java.io.Serializable[][][][] {};
        java.io.Serializable[][][][][] serializableArray3 = new java.io.Serializable[][][][][] { serializableArray2 };
        java.io.Serializable[][][][][] serializableArray4 = org.apache.commons.lang3.Validate.noNullElements(serializableArray3);
        java.io.Serializable[][][][][] serializableArray5 = org.apache.commons.lang3.Validate.noNullElements(serializableArray4);
        java.lang.String str6 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test643");
        java.lang.Object[][][][][] objArray2 = new java.lang.Object[][][][][] {};
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.Object[][][][][] objArray7 = org.apache.commons.lang3.Validate.noNullElements(objArray2, "", (java.lang.Object[]) strArray6);
        java.io.Serializable[][][][] serializableArray8 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][][][]) objArray2);
        java.lang.String str9 = org.apache.commons.lang3.Validate.notEmpty("hi!", "", (java.lang.Object[]) objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test644");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test645");
        java.lang.Comparable[][][] comparableArray1 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String>[][][] strComparableArray7 = org.apache.commons.lang3.Validate.validIndex(strComparableArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test646");
        org.apache.commons.lang3.Validate[][] validateArray0 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray1 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray2 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray3 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray4 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][][] validateArray5 = new org.apache.commons.lang3.Validate[][][] { validateArray0, validateArray1, validateArray2, validateArray3, validateArray4 };
        org.apache.commons.lang3.Validate[][][] validateArray6 = org.apache.commons.lang3.Validate.notEmpty(validateArray5);
        org.apache.commons.lang3.Validate[][][] validateArray7 = org.apache.commons.lang3.Validate.notEmpty(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test647");
        org.apache.commons.lang3.Validate[][] validateArray4 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray5 = org.apache.commons.lang3.Validate.noNullElements(validateArray4);
        org.apache.commons.lang3.Validate[][] validateArray6 = org.apache.commons.lang3.Validate.notNull(validateArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", (java.lang.Object[]) validateArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray6);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test648");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test649");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "", "hi!", (java.lang.Object[]) strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test650");
        java.lang.Comparable[][][][] comparableArray4 = new java.lang.Comparable[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray5 = (java.lang.Comparable<java.lang.String>[][][][]) comparableArray4;
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray6 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray5);
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray7 = org.apache.commons.lang3.Validate.notNull(strComparableArray6);
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray8 = org.apache.commons.lang3.Validate.notNull(strComparableArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.Validate.validIndex("hi!", 10, "hi!", (java.lang.Object[]) strComparableArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: hi!");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test651");
        java.lang.Object[] objArray2 = null;
        java.lang.Object obj3 = org.apache.commons.lang3.Validate.notNull((java.lang.Object) 100.0f, "", objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test652");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Object[][][] objArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[][][]) strComparableArray4);
        java.io.Serializable[][] serializableArray7 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][]) strComparableArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (java.lang.Object[]) strComparableArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test653");
        java.io.Serializable[][][][][][] serializableArray0 = new java.io.Serializable[][][][][][] {};
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, (short) 100, "hi!" };
        java.lang.String str8 = org.apache.commons.lang3.Validate.notBlank("hi!", "hi!", objArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[][][][][][] serializableArray9 = org.apache.commons.lang3.Validate.notEmpty(serializableArray0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test654");
        java.lang.Comparable[][][][] comparableArray1 = new java.lang.Comparable[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][][][] objArray5 = org.apache.commons.lang3.Validate.validIndex((java.lang.Object[][][][]) strComparableArray2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test655");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.io.Serializable[] serializableArray7 = org.apache.commons.lang3.Validate.notEmpty((java.io.Serializable[]) strArray6);
        java.lang.CharSequence[] charSequenceArray8 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        java.lang.Class<?> wildcardClass9 = charSequenceArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test656");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray6 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray7 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray4, genericDeclarationArray5, genericDeclarationArray6 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray8 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "", "hi!", (java.lang.Object[]) genericDeclarationArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test657");
        java.lang.Object[][][][][] objArray2 = new java.lang.Object[][][][][] {};
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.Object[][][][][] objArray7 = org.apache.commons.lang3.Validate.noNullElements(objArray2, "", (java.lang.Object[]) strArray6);
        java.io.Serializable[][][][] serializableArray8 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][][][]) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "", "hi!", (java.lang.Object[]) objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test658");
        java.lang.Object[][][][] objArray3 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray4 = org.apache.commons.lang3.Validate.noNullElements(objArray3);
        java.lang.Object[][][][] objArray5 = org.apache.commons.lang3.Validate.notNull(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "hi!", "hi!", (java.lang.Object[]) objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test659");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) (byte) -1);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test660");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "hi!", "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test661");
        java.lang.CharSequence charSequence0 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray6 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray3, genericDeclarationArray4, genericDeclarationArray5 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray7 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.validIndex(charSequence0, (int) '4', "", (java.lang.Object[]) genericDeclarationArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test662");
        java.lang.Object[][][][][] objArray0 = new java.lang.Object[][][][][] {};
        java.lang.Object[][][][][] objArray1 = new java.lang.Object[][][][][] {};
        java.lang.Object[][][][][][] objArray2 = new java.lang.Object[][][][][][] { objArray0, objArray1 };
        java.lang.Object[][][][] objArray4 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray5 = org.apache.commons.lang3.Validate.noNullElements(objArray4);
        java.lang.Object[][][][][][] objArray6 = org.apache.commons.lang3.Validate.noNullElements(objArray2, "", (java.lang.Object[]) objArray4);
        java.lang.Object[][] objArray7 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[][]) objArray6);
        java.io.Serializable[] serializableArray8 = org.apache.commons.lang3.Validate.notEmpty((java.io.Serializable[]) objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test663");
        java.io.Serializable[][][][] serializableArray2 = new java.io.Serializable[][][][] {};
        java.io.Serializable[][][][][] serializableArray3 = new java.io.Serializable[][][][][] { serializableArray2 };
        java.io.Serializable[][][][][] serializableArray4 = org.apache.commons.lang3.Validate.noNullElements(serializableArray3);
        java.io.Serializable[][][][] serializableArray5 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][][][]) serializableArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "", (java.lang.Object[]) serializableArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test664");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.noNullElements(typeArray6);
        java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test665");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][][] strComparableArray6 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        org.apache.commons.lang3.Validate.validState(true, "hi!", (java.lang.Object[]) strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test666");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test667");
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray4);
        org.apache.commons.lang3.Validate.isTrue(true, "", (java.lang.Object[]) charSequenceArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (java.lang.Object[]) charSequenceArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test668");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test669");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray4);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray6);
        org.apache.commons.lang3.Validate.validState(true, "hi!", (java.lang.Object[]) charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test670");
        java.lang.CharSequence[][][] charSequenceArray0 = new java.lang.CharSequence[][][] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[][][] charSequenceArray2 = org.apache.commons.lang3.Validate.validIndex(charSequenceArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test671");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test672");
        java.lang.CharSequence charSequence0 = null;
        java.io.Serializable[][][][] serializableArray3 = new java.io.Serializable[][][][] {};
        java.io.Serializable[][][][][] serializableArray4 = new java.io.Serializable[][][][][] { serializableArray3 };
        java.io.Serializable[][][][][] serializableArray5 = org.apache.commons.lang3.Validate.noNullElements(serializableArray4);
        java.io.Serializable[][][][] serializableArray6 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][][][]) serializableArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern(charSequence0, "hi!", "hi!", (java.lang.Object[]) serializableArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test673");
        java.io.Serializable[][][][] serializableArray0 = new java.io.Serializable[][][][] {};
        java.io.Serializable[][][][][] serializableArray1 = new java.io.Serializable[][][][][] { serializableArray0 };
        java.io.Serializable[][][][][] serializableArray2 = org.apache.commons.lang3.Validate.noNullElements(serializableArray1);
        java.io.Serializable[][][][][] serializableArray3 = org.apache.commons.lang3.Validate.noNullElements(serializableArray2);
        java.io.Serializable[][][][][] serializableArray4 = org.apache.commons.lang3.Validate.notNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test674");
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray4);
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (java.lang.Object[]) charSequenceArray5);
        java.lang.Object[][] objArray7 = org.apache.commons.lang3.Validate.notNull((java.lang.Object[][]) charSequenceArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.Validate.notBlank("", "hi!", (java.lang.Object[]) charSequenceArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test675");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.Object[] objArray2 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray3 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray0, "", objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = org.apache.commons.lang3.Validate.notEmpty(genericDeclarationArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test676");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] { charSequenceArray5 };
        java.lang.CharSequence[][] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray6);
        java.lang.CharSequence[][] charSequenceArray8 = org.apache.commons.lang3.Validate.notEmpty(charSequenceArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.Validate.notBlank("", "hi!", (java.lang.Object[]) charSequenceArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test677");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence5 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "", (int) (short) -1, "", (java.lang.Object[]) annotatedElementArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: ");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray4);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test678");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray5 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("", "hi!", strComparable2, "", (java.lang.Object[]) annotatedElementArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test679");
        org.apache.commons.lang3.Validate[] validateArray0 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray1 = org.apache.commons.lang3.Validate.noNullElements(validateArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate[] validateArray3 = org.apache.commons.lang3.Validate.validIndex(validateArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray1);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test680");
        org.apache.commons.lang3.Validate[] validateArray5 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray6 = org.apache.commons.lang3.Validate.noNullElements(validateArray5);
        org.apache.commons.lang3.Validate.isTrue(true, "", (java.lang.Object[]) validateArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "", "", (java.lang.Object[]) validateArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray6);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test681");
        java.io.Serializable[][][][][] serializableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[][][][][] serializableArray1 = org.apache.commons.lang3.Validate.notEmpty(serializableArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated array is empty");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test682");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.Object[] objArray2 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray3 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray0, "", objArray2);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray0);
        java.lang.Class<?> wildcardClass5 = genericDeclarationArray0.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.Validate.notNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test683");
        java.lang.Object[][][][][] objArray0 = new java.lang.Object[][][][][] {};
        java.lang.Object[][][][][] objArray1 = new java.lang.Object[][][][][] {};
        java.lang.Object[][][][][][] objArray2 = new java.lang.Object[][][][][][] { objArray0, objArray1 };
        java.lang.Object[][][][] objArray4 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray5 = org.apache.commons.lang3.Validate.noNullElements(objArray4);
        java.lang.Object[][][][][][] objArray6 = org.apache.commons.lang3.Validate.noNullElements(objArray2, "", (java.lang.Object[]) objArray4);
        java.lang.Object[][] objArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[][]) objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test684");
        org.apache.commons.lang3.Validate validate4 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate7 = org.apache.commons.lang3.Validate.notNull(validate4, "hi!", objArray6);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "", objArray6);
        java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "hi!", "", objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test685");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("", "", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test686");
        java.lang.Comparable[][][][] comparableArray5 = new java.lang.Comparable[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray6 = (java.lang.Comparable<java.lang.String>[][][][]) comparableArray5;
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray6);
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray8 = org.apache.commons.lang3.Validate.notNull(strComparableArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "hi!", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", (java.lang.Object[]) strComparableArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test687");
        java.io.Serializable[][][][] serializableArray2 = new java.io.Serializable[][][][] {};
        java.io.Serializable[][][][][] serializableArray3 = new java.io.Serializable[][][][][] { serializableArray2 };
        java.io.Serializable[][][][][] serializableArray4 = org.apache.commons.lang3.Validate.noNullElements(serializableArray3);
        java.io.Serializable[][][][][] serializableArray5 = org.apache.commons.lang3.Validate.noNullElements(serializableArray4);
        java.io.Serializable[][][][] serializableArray6 = org.apache.commons.lang3.Validate.notEmpty((java.io.Serializable[][][][]) serializableArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "", "hi!", (java.lang.Object[]) serializableArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test688");
        org.apache.commons.lang3.Validate[][] validateArray0 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray1 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][][] validateArray2 = new org.apache.commons.lang3.Validate[][][] { validateArray0, validateArray1 };
        org.apache.commons.lang3.Validate[][][] validateArray4 = org.apache.commons.lang3.Validate.validIndex(validateArray2, (int) (byte) 1);
        org.apache.commons.lang3.Validate[][][] validateArray5 = org.apache.commons.lang3.Validate.notNull(validateArray2);
        java.lang.Class<?> wildcardClass6 = validateArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test689");
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray2);
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (java.lang.Object[]) charSequenceArray3);
        java.lang.Class<?> wildcardClass5 = charSequenceArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test690");
        java.io.Serializable[][][][] serializableArray0 = new java.io.Serializable[][][][] {};
        java.io.Serializable[][][][][] serializableArray1 = new java.io.Serializable[][][][][] { serializableArray0 };
        java.io.Serializable[][][][][] serializableArray2 = org.apache.commons.lang3.Validate.noNullElements(serializableArray1);
        java.io.Serializable[][][][] serializableArray3 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][][][]) serializableArray1);
        java.lang.Object[][][][][] objArray4 = org.apache.commons.lang3.Validate.notNull((java.lang.Object[][][][][]) serializableArray1);
        java.io.Serializable[][][][] serializableArray5 = org.apache.commons.lang3.Validate.notEmpty((java.io.Serializable[][][][]) objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test691");
        org.apache.commons.lang3.Validate[] validateArray4 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray5 = org.apache.commons.lang3.Validate.noNullElements(validateArray4);
        org.apache.commons.lang3.Validate.validState(true, "hi!", (java.lang.Object[]) validateArray5);
        org.apache.commons.lang3.Validate[] validateArray7 = org.apache.commons.lang3.Validate.notNull(validateArray5);
        org.apache.commons.lang3.Validate[] validateArray8 = org.apache.commons.lang3.Validate.notNull(validateArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "", "", (java.lang.Object[]) validateArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test692");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.Comparable<java.lang.String>[] strComparableArray7 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Comparable<java.lang.String>[]) strArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", (java.lang.Object[]) strComparableArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test693");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.Validate.notNull(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[][] strArray6 = org.apache.commons.lang3.Validate.notEmpty(strArray0, "", (java.lang.Object[]) strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test694");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray3 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray5 = new java.lang.reflect.Type[][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4 };
        java.lang.reflect.Type[][] typeArray6 = org.apache.commons.lang3.Validate.notEmpty(typeArray5);
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
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test695");
        org.apache.commons.lang3.Validate[] validateArray3 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray4 = org.apache.commons.lang3.Validate.noNullElements(validateArray3);
        org.apache.commons.lang3.Validate[] validateArray5 = org.apache.commons.lang3.Validate.notNull(validateArray4);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "hi!", "hi!", (java.lang.Object[]) validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test696");
        java.lang.CharSequence[] charSequenceArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[] charSequenceArray2 = org.apache.commons.lang3.Validate.validIndex(charSequenceArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated object is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test697");
        org.apache.commons.lang3.Validate[][] validateArray2 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray3 = org.apache.commons.lang3.Validate.noNullElements(validateArray2);
        org.apache.commons.lang3.Validate[][] validateArray4 = org.apache.commons.lang3.Validate.notNull(validateArray2);
        java.lang.String str5 = org.apache.commons.lang3.Validate.notEmpty("hi!", "hi!", (java.lang.Object[]) validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test698");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) (byte) 100);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test699");
        org.apache.commons.lang3.Validate[][] validateArray0 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray1 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][][] validateArray2 = new org.apache.commons.lang3.Validate[][][] { validateArray0, validateArray1 };
        org.apache.commons.lang3.Validate[][][] validateArray4 = org.apache.commons.lang3.Validate.validIndex(validateArray2, (int) (byte) 1);
        org.apache.commons.lang3.Validate[][][] validateArray5 = org.apache.commons.lang3.Validate.notNull(validateArray2);
        org.apache.commons.lang3.Validate[][][] validateArray6 = org.apache.commons.lang3.Validate.noNullElements(validateArray2);
        java.lang.Object[][][] objArray7 = org.apache.commons.lang3.Validate.notNull((java.lang.Object[][][]) validateArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test700");
        java.lang.Object[][][][][] objArray0 = new java.lang.Object[][][][][] {};
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Object[][][][][] objArray5 = org.apache.commons.lang3.Validate.noNullElements(objArray0, "", (java.lang.Object[]) strArray4);
        java.io.Serializable[][][][] serializableArray6 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][][][]) objArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][][][] objArray7 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[][][][]) serializableArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test701");
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] { typeArray2 };
        java.lang.reflect.Type[][] typeArray4 = org.apache.commons.lang3.Validate.noNullElements(typeArray3);
        java.lang.reflect.Type[][] typeArray5 = org.apache.commons.lang3.Validate.notNull(typeArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (java.lang.Object[]) typeArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test702");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) (short) 10);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test703");
        org.apache.commons.lang3.Validate[] validateArray2 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray3 = org.apache.commons.lang3.Validate.noNullElements(validateArray2);
        org.apache.commons.lang3.Validate[] validateArray4 = org.apache.commons.lang3.Validate.notNull(validateArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "hi!", (java.lang.Object[]) validateArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test704");
        org.apache.commons.lang3.Validate[] validateArray4 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray5 = org.apache.commons.lang3.Validate.noNullElements(validateArray4);
        org.apache.commons.lang3.Validate.validState(true, "hi!", (java.lang.Object[]) validateArray5);
        org.apache.commons.lang3.Validate[] validateArray7 = org.apache.commons.lang3.Validate.notNull(validateArray5);
        org.apache.commons.lang3.Validate.isTrue(true, "", (java.lang.Object[]) validateArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test705");
        org.apache.commons.lang3.Validate[][] validateArray4 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray5 = org.apache.commons.lang3.Validate.noNullElements(validateArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "hi!", "", (java.lang.Object[]) validateArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test706");
        java.io.Serializable[][][][] serializableArray0 = new java.io.Serializable[][][][] {};
        java.io.Serializable[][][][][] serializableArray1 = new java.io.Serializable[][][][][] { serializableArray0 };
        java.io.Serializable[][][][][] serializableArray2 = org.apache.commons.lang3.Validate.noNullElements(serializableArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][][][][] objArray4 = org.apache.commons.lang3.Validate.validIndex((java.lang.Object[][][][][]) serializableArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test707");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Object[][][] objArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[][][]) strComparableArray4);
        java.io.Serializable[][] serializableArray7 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][]) strComparableArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (java.lang.Object[]) serializableArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test708");
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray6 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray5);
        java.lang.String str7 = org.apache.commons.lang3.Validate.notEmpty("hi!", "hi!", (java.lang.Object[]) charSequenceArray5);
        java.lang.Object[][] objArray8 = org.apache.commons.lang3.Validate.notNull((java.lang.Object[][]) charSequenceArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "hi!", "hi!", (java.lang.Object[]) objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test709");
        java.lang.Object[][][][][][] objArray0 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray1 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray2 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray3 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray4 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray5 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][][] objArray6 = new java.lang.Object[][][][][][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        java.lang.Object[][][][][][][] objArray7 = org.apache.commons.lang3.Validate.notEmpty(objArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][][][][] objArray9 = org.apache.commons.lang3.Validate.validIndex((java.lang.Object[][][][][]) objArray6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test710");
        java.lang.Object[] objArray2 = null;
        java.lang.CharSequence charSequence3 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "hi!", objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "hi!" + "'", charSequence3.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test711");
        java.lang.Object[][][][][] objArray2 = new java.lang.Object[][][][][] {};
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.Object[][][][][] objArray7 = org.apache.commons.lang3.Validate.noNullElements(objArray2, "", (java.lang.Object[]) strArray6);
        java.io.Serializable[][][][] serializableArray8 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][][][]) objArray2);
        org.apache.commons.lang3.Validate.isTrue(true, "", (java.lang.Object[]) serializableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test712");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        org.apache.commons.lang3.Validate.validState(true, "hi!", (java.lang.Object[]) charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test713");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray0, genericDeclarationArray1, genericDeclarationArray2 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray4 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray3);
        java.lang.Class<?> wildcardClass5 = genericDeclarationArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test714");
        java.io.Serializable[][][][] serializableArray0 = new java.io.Serializable[][][][] {};
        java.io.Serializable[][][][][] serializableArray1 = new java.io.Serializable[][][][][] { serializableArray0 };
        java.io.Serializable[][][][][] serializableArray2 = org.apache.commons.lang3.Validate.noNullElements(serializableArray1);
        java.io.Serializable[][][][] serializableArray3 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][][][]) serializableArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[][][][][] serializableArray5 = org.apache.commons.lang3.Validate.validIndex(serializableArray1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test715");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) 1);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test716");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test717");
        java.lang.Object[][][][] objArray4 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray5 = org.apache.commons.lang3.Validate.noNullElements(objArray4);
        java.lang.String str6 = org.apache.commons.lang3.Validate.notEmpty("hi!", "", (java.lang.Object[]) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.Validate.notEmpty("", "", (java.lang.Object[]) objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test718");
        java.lang.Object[][][][][][] objArray0 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray1 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray2 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray3 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray4 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray5 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][][] objArray6 = new java.lang.Object[][][][][][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        java.lang.Object[][][][][][][] objArray7 = org.apache.commons.lang3.Validate.notEmpty(objArray6);
        java.io.Serializable[][][][] serializableArray8 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][][][]) objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test719");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.Validate.notEmpty(wildcardClassArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassArray2);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test720");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray6);
        java.lang.Class<?> wildcardClass8 = charSequenceArray7.getClass();
        java.lang.Class<?> wildcardClass9 = org.apache.commons.lang3.Validate.notNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test721");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test722");
        java.lang.Comparable[][][] comparableArray3 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray3;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray5 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray4);
        java.lang.Object[][][] objArray6 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[][][]) strComparableArray4);
        java.io.Serializable[][] serializableArray7 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][]) strComparableArray4);
        java.lang.String str8 = org.apache.commons.lang3.Validate.notEmpty("hi!", "", (java.lang.Object[]) serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test723");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray2, genericDeclarationArray3, genericDeclarationArray4 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray6 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray5);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray7 = org.apache.commons.lang3.Validate.notEmpty((java.lang.reflect.AnnotatedElement[][]) genericDeclarationArray5);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) genericDeclarationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test724");
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray4);
        java.lang.String str6 = org.apache.commons.lang3.Validate.notBlank("hi!", "hi!", (java.lang.Object[]) charSequenceArray5);
        java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) charSequenceArray5);
        java.lang.Class<?> wildcardClass8 = charSequence7.getClass();
        java.lang.Class<?> wildcardClass9 = org.apache.commons.lang3.Validate.notNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test725");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test726");
        org.apache.commons.lang3.Validate[] validateArray4 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray5 = org.apache.commons.lang3.Validate.noNullElements(validateArray4);
        org.apache.commons.lang3.Validate.isTrue(true, "", (java.lang.Object[]) validateArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "hi!", (java.lang.Object[]) validateArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test727");
        java.lang.Object[][][][][] objArray2 = new java.lang.Object[][][][][] {};
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.Object[][][][][] objArray7 = org.apache.commons.lang3.Validate.noNullElements(objArray2, "", (java.lang.Object[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.Validate.notBlank("hi!", "hi!", (java.lang.Object[]) objArray7);
        java.lang.Object[][][][] objArray9 = org.apache.commons.lang3.Validate.notNull((java.lang.Object[][][][]) objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test728");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray5 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray4);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray6 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray5);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray7 = org.apache.commons.lang3.Validate.notNull(annotatedElementArray5);
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (java.lang.Object[]) annotatedElementArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "", (java.lang.Object[]) annotatedElementArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test729");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence charSequence5 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.notEmpty(strArray4);
        java.lang.Comparable<java.lang.String>[] strComparableArray7 = org.apache.commons.lang3.Validate.notNull((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test730");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test731");
        java.lang.Comparable[][][][] comparableArray1 = new java.lang.Comparable[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String>[][][][] strComparableArray6 = org.apache.commons.lang3.Validate.validIndex(strComparableArray4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test732");
        java.lang.Object[][][][] objArray3 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray4 = org.apache.commons.lang3.Validate.noNullElements(objArray3);
        java.lang.Object[][][][] objArray5 = org.apache.commons.lang3.Validate.notNull(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "", "", (java.lang.Object[]) objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test733");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test734");
        java.lang.Object[][][][][][] objArray0 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray1 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray2 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray3 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray4 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray5 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][][] objArray6 = new java.lang.Object[][][][][][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        java.lang.Object[][][][][][][] objArray7 = org.apache.commons.lang3.Validate.notEmpty(objArray6);
        java.io.Serializable[][][][][][] serializableArray9 = org.apache.commons.lang3.Validate.validIndex((java.io.Serializable[][][][][][]) objArray6, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test735");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray3);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray5 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray4);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray6 = org.apache.commons.lang3.Validate.notNull(annotatedElementArray4);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray7 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "", "hi!", (java.lang.Object[]) annotatedElementArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test736");
        org.apache.commons.lang3.Validate[] validateArray0 = new org.apache.commons.lang3.Validate[] {};
        org.apache.commons.lang3.Validate[] validateArray1 = org.apache.commons.lang3.Validate.noNullElements(validateArray0);
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray4 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray3);
        org.apache.commons.lang3.Validate[] validateArray5 = org.apache.commons.lang3.Validate.notNull(validateArray0, "hi!", (java.lang.Object[]) charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test737");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.Object[] objArray4 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray5 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray2, "", objArray4);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray6 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray2);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray7 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray2);
        org.apache.commons.lang3.Validate.isTrue(true, "", (java.lang.Object[]) genericDeclarationArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test738");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test739");
        java.lang.Object[][][][] objArray5 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray6 = org.apache.commons.lang3.Validate.noNullElements(objArray5);
        java.lang.Object[][][][] objArray7 = org.apache.commons.lang3.Validate.notNull(objArray6);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "hi!", "", (java.lang.Object[]) objArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "", "hi!", (java.lang.Object[]) objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test740");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.Validate.notBlank("", "", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test741");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.Object[] objArray4 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray5 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray2, "", objArray4);
        org.apache.commons.lang3.Validate.isTrue(true, "", objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test742");
        org.apache.commons.lang3.Validate validate4 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate7 = org.apache.commons.lang3.Validate.notNull(validate4, "hi!", objArray6);
        java.lang.CharSequence charSequence8 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "", objArray6);
        java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "hi!", "hi!", objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test743");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.Validate.noNullElements(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] { wildcardClass3 };
        java.lang.reflect.Type[] typeArray5 = org.apache.commons.lang3.Validate.notEmpty(typeArray4);
        java.lang.Class<?> wildcardClass6 = typeArray5.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.AnnotatedElement) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test744");
        java.io.Serializable[][][][][][][] serializableArray0 = new java.io.Serializable[][][][][][][] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.Object[] objArray4 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray5 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray2, "", objArray4);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray6 = org.apache.commons.lang3.Validate.notNull(genericDeclarationArray5);
        java.io.Serializable[][][][][][][] serializableArray7 = org.apache.commons.lang3.Validate.noNullElements(serializableArray0, "", (java.lang.Object[]) genericDeclarationArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test745");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray3);
        java.lang.CharSequence charSequence5 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (byte) 1, "", (java.lang.Object[]) annotatedElementArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test746");
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "hi!", (java.lang.Comparable<java.lang.String>) "", "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test747");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray3);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray5 = org.apache.commons.lang3.Validate.noNullElements(annotatedElementArray4);
        java.lang.CharSequence charSequence6 = org.apache.commons.lang3.Validate.validIndex((java.lang.CharSequence) "hi!", (int) (short) 0, "hi!", (java.lang.Object[]) annotatedElementArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test748");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.Object[] objArray6 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray7 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray4, "", objArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.exclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "hi!", "hi!", (java.lang.Object[]) genericDeclarationArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test749");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test750");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray0, genericDeclarationArray1, genericDeclarationArray2 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray4 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray3);
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray5 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test751");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.Comparable[][] comparableArray3 = new java.lang.Comparable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray4 = (java.lang.Comparable<java.lang.String>[][]) comparableArray3;
        strComparableArray4[0] = strArray1;
        java.lang.Comparable<java.lang.String>[][] strComparableArray7 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray4);
        java.lang.Comparable<java.lang.String>[][] strComparableArray8 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray7);
        java.lang.Object[][] objArray9 = org.apache.commons.lang3.Validate.noNullElements((java.lang.Object[][]) strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test752");
        org.apache.commons.lang3.Validate validate0 = new org.apache.commons.lang3.Validate();
        java.lang.Class<?> wildcardClass1 = validate0.getClass();
        java.lang.Object obj2 = org.apache.commons.lang3.Validate.notNull((java.lang.Object) validate0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test753");
        java.lang.Object[][][][][][] objArray0 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray1 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray2 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray3 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray4 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][] objArray5 = new java.lang.Object[][][][][][] {};
        java.lang.Object[][][][][][][] objArray6 = new java.lang.Object[][][][][][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        java.lang.Object[][][][][][][] objArray7 = org.apache.commons.lang3.Validate.notEmpty(objArray6);
        java.io.Serializable[][][][][][] serializableArray8 = org.apache.commons.lang3.Validate.notEmpty((java.io.Serializable[][][][][][]) objArray6);
        java.lang.Object[][][][][][][] objArray9 = org.apache.commons.lang3.Validate.notEmpty(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test754");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.Validate.notEmpty("hi!", "", (java.lang.Object[]) charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test755");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) (byte) 0);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test756");
        org.apache.commons.lang3.Validate validate0 = new org.apache.commons.lang3.Validate();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.apache.commons.lang3.Validate validate3 = org.apache.commons.lang3.Validate.notNull(validate0, "hi!", objArray2);
        java.lang.Class<?> wildcardClass4 = validate0.getClass();
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.Validate.notNull(wildcardClass4);
        java.lang.reflect.AnnotatedElement annotatedElement6 = org.apache.commons.lang3.Validate.notNull((java.lang.reflect.AnnotatedElement) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = annotatedElement6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElement6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test757");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "", (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test758");
        org.apache.commons.lang3.Validate[][] validateArray0 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray1 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray2 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray3 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray4 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][][] validateArray5 = new org.apache.commons.lang3.Validate[][][] { validateArray0, validateArray1, validateArray2, validateArray3, validateArray4 };
        org.apache.commons.lang3.Validate[][][] validateArray6 = org.apache.commons.lang3.Validate.notEmpty(validateArray5);
        java.io.Serializable[][] serializableArray7 = org.apache.commons.lang3.Validate.notEmpty((java.io.Serializable[][]) validateArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test759");
        java.lang.Object[][][][][][][] objArray0 = null;
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] { charSequenceArray5 };
        java.lang.CharSequence[][] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray6);
        java.lang.CharSequence[][] charSequenceArray8 = org.apache.commons.lang3.Validate.notEmpty(charSequenceArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][][][][][][] objArray9 = org.apache.commons.lang3.Validate.notNull(objArray0, "", (java.lang.Object[]) charSequenceArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: ");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test760");
        java.io.Serializable[][] serializableArray2 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray3 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray4 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray5 = new java.io.Serializable[][] {};
        java.io.Serializable[][] serializableArray6 = new java.io.Serializable[][] {};
        java.io.Serializable[][][] serializableArray7 = new java.io.Serializable[][][] { serializableArray2, serializableArray3, serializableArray4, serializableArray5, serializableArray6 };
        java.io.Serializable[][][] serializableArray8 = org.apache.commons.lang3.Validate.noNullElements(serializableArray7);
        java.lang.CharSequence charSequence9 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "hi!", (java.lang.Object[]) serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test761");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern(charSequence0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test762");
        java.lang.Object[][][][] objArray3 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray4 = org.apache.commons.lang3.Validate.noNullElements(objArray3);
        java.lang.Object[][][][] objArray5 = org.apache.commons.lang3.Validate.notNull(objArray4);
        org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "hi!", "hi!", "hi!", (java.lang.Object[]) objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test763");
        org.apache.commons.lang3.Validate.isTrue(true, "", 1L);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test764");
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray4);
        java.lang.String str6 = org.apache.commons.lang3.Validate.notBlank("hi!", "hi!", (java.lang.Object[]) charSequenceArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (java.lang.Object[]) charSequenceArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test765");
        org.apache.commons.lang3.Validate.isTrue(true, "", (long) 0);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test766");
        java.io.Serializable[][][][][][][] serializableArray0 = new java.io.Serializable[][][][][][][] {};
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[][][][][][][] serializableArray2 = org.apache.commons.lang3.Validate.validIndex(serializableArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray0);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test767");
        java.lang.Comparable[][][][] comparableArray1 = new java.lang.Comparable[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray4 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray5 = org.apache.commons.lang3.Validate.notNull(strComparableArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String>[][][][] strComparableArray6 = org.apache.commons.lang3.Validate.notEmpty(strComparableArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test768");
        org.apache.commons.lang3.Validate[][] validateArray2 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray3 = org.apache.commons.lang3.Validate.noNullElements(validateArray2);
        org.apache.commons.lang3.Validate[][] validateArray4 = org.apache.commons.lang3.Validate.notNull(validateArray2);
        org.apache.commons.lang3.Validate[][] validateArray5 = org.apache.commons.lang3.Validate.notNull(validateArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.validState(false, "hi!", (java.lang.Object[]) validateArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test769");
        java.lang.Object[][][][] objArray6 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray7 = org.apache.commons.lang3.Validate.noNullElements(objArray6);
        java.lang.String str8 = org.apache.commons.lang3.Validate.notEmpty("hi!", "", (java.lang.Object[]) objArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "hi!", (java.lang.Comparable<java.lang.String>) "", "hi!", (java.lang.Object[]) objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test770");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Comparable<java.lang.String>[] strComparableArray5 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Comparable<java.lang.String>[]) strArray3);
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (java.lang.Object[]) strComparableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray5);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test771");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (double) 0);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test772");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.noNullElements(typeArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.Validate.notBlank("", "hi!", (java.lang.Object[]) typeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test773");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray1 = org.apache.commons.lang3.Validate.notEmpty(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The validated array is empty");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test774");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.CharSequence[] charSequenceArray5 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.notNull(strArray4);
        org.apache.commons.lang3.Validate.validState(true, "hi!", (java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test775");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] { charSequenceArray5 };
        java.lang.CharSequence[][] charSequenceArray7 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray6);
        java.lang.String str8 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test776");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.Object[] objArray4 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray5 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray2, "", objArray4);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray6 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray2);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray7 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray2);
        org.apache.commons.lang3.Validate.isTrue(true, "", (java.lang.Object[]) genericDeclarationArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test777");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray2, genericDeclarationArray3, genericDeclarationArray4 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray6 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray5);
        java.lang.CharSequence charSequence7 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) genericDeclarationArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test778");
        java.io.Serializable[][][][] serializableArray2 = new java.io.Serializable[][][][] {};
        java.io.Serializable[][][][][] serializableArray3 = new java.io.Serializable[][][][][] { serializableArray2 };
        java.io.Serializable[][][][][] serializableArray4 = org.apache.commons.lang3.Validate.noNullElements(serializableArray3);
        java.io.Serializable[][][][] serializableArray5 = org.apache.commons.lang3.Validate.noNullElements((java.io.Serializable[][][][]) serializableArray3);
        java.lang.CharSequence charSequence6 = org.apache.commons.lang3.Validate.notEmpty((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) serializableArray3);
        java.lang.Object[][] objArray7 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[][]) serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test779");
        java.lang.Comparable[][][][] comparableArray1 = new java.lang.Comparable[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][][]) comparableArray1;
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray3 = org.apache.commons.lang3.Validate.noNullElements(strComparableArray2);
        java.lang.Class<?> wildcardClass4 = strComparableArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(comparableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test780");
        org.apache.commons.lang3.Validate[][] validateArray2 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray3 = org.apache.commons.lang3.Validate.noNullElements(validateArray2);
        org.apache.commons.lang3.Validate.isTrue(true, "", (java.lang.Object[]) validateArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray3);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test781");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray6);
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (java.lang.Object[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.matchesPattern((java.lang.CharSequence) "", "hi!", "", (java.lang.Object[]) strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test782");
        java.lang.Object[][][][] objArray4 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray5 = org.apache.commons.lang3.Validate.noNullElements(objArray4);
        java.lang.Object[][][][] objArray6 = org.apache.commons.lang3.Validate.notNull(objArray5);
        java.lang.Object[][][] objArray7 = org.apache.commons.lang3.Validate.notNull((java.lang.Object[][][]) objArray6);
        org.apache.commons.lang3.Validate.inclusiveBetween("", "hi!", (java.lang.Comparable<java.lang.String>) "hi!", "", (java.lang.Object[]) objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test783");
        java.lang.Object[][][][][] objArray2 = new java.lang.Object[][][][][] {};
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray5);
        java.lang.Object[][][][][] objArray7 = org.apache.commons.lang3.Validate.noNullElements(objArray2, "", (java.lang.Object[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.Validate.notBlank("hi!", "hi!", (java.lang.Object[]) objArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[][][] serializableArray9 = org.apache.commons.lang3.Validate.notEmpty((java.io.Serializable[][][]) objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test784");
        org.apache.commons.lang3.Validate[][][] validateArray0 = new org.apache.commons.lang3.Validate[][][] {};
        org.apache.commons.lang3.Validate[][][] validateArray1 = new org.apache.commons.lang3.Validate[][][] {};
        org.apache.commons.lang3.Validate[][][] validateArray2 = new org.apache.commons.lang3.Validate[][][] {};
        org.apache.commons.lang3.Validate[][][][] validateArray3 = new org.apache.commons.lang3.Validate[][][][] { validateArray0, validateArray1, validateArray2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate[][][][] validateArray5 = org.apache.commons.lang3.Validate.validIndex(validateArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray3);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test785");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Object[] objArray6 = null;
        java.lang.String[] strArray7 = org.apache.commons.lang3.Validate.noNullElements(strArray3, "hi!", objArray6);
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (java.lang.Object[]) strArray7);
        java.lang.CharSequence[] charSequenceArray9 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test786");
        java.lang.Object[][][][][] objArray0 = new java.lang.Object[][][][][] {};
        java.lang.Object[][][][][] objArray1 = new java.lang.Object[][][][][] {};
        java.lang.Object[][][][][][] objArray2 = new java.lang.Object[][][][][][] { objArray0, objArray1 };
        java.lang.Object[][][][] objArray4 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray5 = org.apache.commons.lang3.Validate.noNullElements(objArray4);
        java.lang.Object[][][][][][] objArray6 = org.apache.commons.lang3.Validate.noNullElements(objArray2, "", (java.lang.Object[]) objArray4);
        java.lang.Object[][] objArray7 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[][]) objArray6);
        java.lang.Object[][][][][][] objArray8 = org.apache.commons.lang3.Validate.notEmpty(objArray6);
        java.lang.Object[][][][][][] objArray9 = org.apache.commons.lang3.Validate.notNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test787");
        java.io.Serializable[][][][] serializableArray4 = new java.io.Serializable[][][][] {};
        java.io.Serializable[][][][][] serializableArray5 = new java.io.Serializable[][][][][] { serializableArray4 };
        java.io.Serializable[][][][][] serializableArray6 = org.apache.commons.lang3.Validate.noNullElements(serializableArray5);
        java.io.Serializable[][][][][] serializableArray7 = org.apache.commons.lang3.Validate.noNullElements(serializableArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.inclusiveBetween("hi!", "", (java.lang.Comparable<java.lang.String>) "", "hi!", (java.lang.Object[]) serializableArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test788");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.Object[] objArray2 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray3 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray0, "", objArray2);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = org.apache.commons.lang3.Validate.noNullElements(genericDeclarationArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement[] annotatedElementArray5 = org.apache.commons.lang3.Validate.notEmpty((java.lang.reflect.AnnotatedElement[]) genericDeclarationArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test789");
        org.apache.commons.lang3.Validate[][] validateArray0 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray1 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray2 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray3 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray4 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][][] validateArray5 = new org.apache.commons.lang3.Validate[][][] { validateArray0, validateArray1, validateArray2, validateArray3, validateArray4 };
        org.apache.commons.lang3.Validate[][][] validateArray6 = org.apache.commons.lang3.Validate.notEmpty(validateArray5);
        org.apache.commons.lang3.Validate[][][] validateArray7 = org.apache.commons.lang3.Validate.notEmpty(validateArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[] serializableArray9 = org.apache.commons.lang3.Validate.validIndex((java.io.Serializable[]) validateArray7, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated array index is invalid: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray7);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test790");
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray3 = org.apache.commons.lang3.Validate.noNullElements(charSequenceArray2);
        java.lang.CharSequence charSequence4 = org.apache.commons.lang3.Validate.notBlank((java.lang.CharSequence) "hi!", "hi!", (java.lang.Object[]) charSequenceArray2);
        java.lang.Object[] objArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[][] charSequenceArray8 = org.apache.commons.lang3.Validate.validIndex(charSequenceArray2, (int) (short) 0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: hi!");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test791");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.lang.reflect.Type[] typeArray7 = org.apache.commons.lang3.Validate.notEmpty(typeArray6);
        java.lang.reflect.Type[] typeArray8 = org.apache.commons.lang3.Validate.notEmpty(typeArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (java.lang.Object[]) typeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test792");
        org.apache.commons.lang3.Validate.isTrue(true, "hi!", (long) (-1));
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test793");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.Validate.noNullElements(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.Validate.notBlank("hi!", "", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.Validate.noNullElements(strArray4);
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.Validate.notNull((java.lang.CharSequence[]) strArray6);
        java.lang.CharSequence[] charSequenceArray8 = org.apache.commons.lang3.Validate.noNullElements((java.lang.CharSequence[]) strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test794");
        java.lang.Object[][][][][] objArray0 = new java.lang.Object[][][][][] {};
        java.lang.Object[][][][][] objArray1 = new java.lang.Object[][][][][] {};
        java.lang.Object[][][][][][] objArray2 = new java.lang.Object[][][][][][] { objArray0, objArray1 };
        java.lang.Object[][][][] objArray4 = new java.lang.Object[][][][] {};
        java.lang.Object[][][][] objArray5 = org.apache.commons.lang3.Validate.noNullElements(objArray4);
        java.lang.Object[][][][][][] objArray6 = org.apache.commons.lang3.Validate.noNullElements(objArray2, "", (java.lang.Object[]) objArray4);
        java.lang.Object[][] objArray7 = org.apache.commons.lang3.Validate.notEmpty((java.lang.Object[][]) objArray6);
        java.lang.Object[][][][][][] objArray8 = org.apache.commons.lang3.Validate.notEmpty(objArray6);
        java.io.Serializable[][][] serializableArray9 = org.apache.commons.lang3.Validate.notEmpty((java.io.Serializable[][][]) objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test795");
        org.apache.commons.lang3.Validate.isTrue(true, "", (double) (short) 1);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test796");
        org.apache.commons.lang3.Validate[][] validateArray2 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray3 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray4 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray5 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray6 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][][] validateArray7 = new org.apache.commons.lang3.Validate[][][] { validateArray2, validateArray3, validateArray4, validateArray5, validateArray6 };
        org.apache.commons.lang3.Validate[][][] validateArray8 = org.apache.commons.lang3.Validate.notEmpty(validateArray7);
        org.apache.commons.lang3.Validate.validState(true, "", (java.lang.Object[]) validateArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray8);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test797");
        java.io.Serializable[][][][] serializableArray0 = new java.io.Serializable[][][][] {};
        java.io.Serializable[][][][] serializableArray1 = new java.io.Serializable[][][][] {};
        java.io.Serializable[][][][] serializableArray2 = new java.io.Serializable[][][][] {};
        java.io.Serializable[][][][][] serializableArray3 = new java.io.Serializable[][][][][] { serializableArray0, serializableArray1, serializableArray2 };
        org.apache.commons.lang3.Validate[][] validateArray5 = new org.apache.commons.lang3.Validate[][] {};
        org.apache.commons.lang3.Validate[][] validateArray6 = org.apache.commons.lang3.Validate.noNullElements(validateArray5);
        org.apache.commons.lang3.Validate[][] validateArray7 = org.apache.commons.lang3.Validate.notNull(validateArray5);
        java.io.Serializable[][][][][] serializableArray8 = org.apache.commons.lang3.Validate.notEmpty(serializableArray3, "", (java.lang.Object[]) validateArray5);
        java.io.Serializable[][][][][] serializableArray9 = org.apache.commons.lang3.Validate.noNullElements(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(validateArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableArray9);
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test798");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.Validate.isTrue(false, "hi!", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Validate() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Validate1.test799");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.Validate.validIndex("", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated character sequence index is invalid: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }
}

