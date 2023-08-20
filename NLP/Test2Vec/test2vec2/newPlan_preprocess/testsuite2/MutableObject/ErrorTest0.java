package MutableObject;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass2 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass2);
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject0, annotatedElementMutableObject3, and strMutableObject0.", !(strMutableObject0.equals(annotatedElementMutableObject3) && annotatedElementMutableObject3.equals(strMutableObject0)) || strMutableObject0.equals(strMutableObject0));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 10.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) strMutableObject4);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass5 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass5);
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject0, annotatedElementMutableObject6, and strMutableObject0.", !(strMutableObject0.equals(annotatedElementMutableObject6) && annotatedElementMutableObject6.equals(strMutableObject0)) || strMutableObject0.equals(strMutableObject0));
    }
}

