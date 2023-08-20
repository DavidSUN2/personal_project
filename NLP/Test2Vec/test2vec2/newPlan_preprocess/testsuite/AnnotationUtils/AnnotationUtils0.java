package AnnotationUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnnotationUtils0 {

    public static boolean debug = false;

    @Test
    public void AnnotationUtils1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AnnotationUtils0.AnnotationUtils1");
        java.lang.annotation.Annotation annotation0 = null;
        // The following exception was thrown during execution in AnnotationUtils generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.AnnotationUtils.toString(annotation0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void AnnotationUtils2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AnnotationUtils0.AnnotationUtils2");
        org.apache.commons.lang3.AnnotationUtils annotationUtils0 = new org.apache.commons.lang3.AnnotationUtils();
        java.lang.Class<?> wildcardClass1 = annotationUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void AnnotationUtils3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AnnotationUtils0.AnnotationUtils3");
        java.lang.annotation.Annotation annotation0 = null;
        java.lang.annotation.Annotation annotation1 = null;
        boolean boolean2 = org.apache.commons.lang3.AnnotationUtils.equals(annotation0, annotation1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void AnnotationUtils4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AnnotationUtils0.AnnotationUtils4");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

