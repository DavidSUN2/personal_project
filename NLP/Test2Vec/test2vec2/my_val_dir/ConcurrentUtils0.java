
package ConcurrentUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ConcurrentUtils0 {

    public static boolean debug = false;

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test01");
        java.util.concurrent.ExecutionException executionException0 = null;
        org.apache.commons.lang3.concurrent.ConcurrentUtils.handleCauseUnchecked(executionException0);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test02");
        java.util.concurrent.ExecutionException executionException0 = null;
        org.apache.commons.lang3.concurrent.ConcurrentUtils.handleCause(executionException0);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test03");
        java.util.concurrent.ExecutionException executionException0 = null;
        org.apache.commons.lang3.concurrent.ConcurrentException concurrentException1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.extractCause(executionException0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(concurrentException1);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test04");
        java.util.concurrent.ExecutionException executionException0 = null;
        org.apache.commons.lang3.concurrent.ConcurrentRuntimeException concurrentRuntimeException1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.extractCauseUnchecked(executionException0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(concurrentRuntimeException1);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test05");
        java.util.concurrent.Future<java.lang.String> strFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture("hi!");
        java.lang.Class<?> wildcardClass2 = strFuture1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test06");
        java.util.concurrent.Future<java.lang.Comparable<java.lang.String>> strComparableFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass2 = strComparableFuture1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test07");
        java.util.concurrent.Future<java.io.Serializable> serializableFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.io.Serializable) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableFuture1);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test08");
        java.util.concurrent.Future<java.lang.Comparable<java.lang.String>> strComparableFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.Comparable<java.lang.String>) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableFuture1);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test09");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture0 = null;
        java.util.concurrent.Future<java.util.concurrent.Future<java.lang.CharSequence>> charSequenceFutureFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(charSequenceFuture0);
        java.lang.Class<?> wildcardClass2 = charSequenceFutureFuture1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFutureFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test10");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass2 = charSequenceFuture1.getClass();
        java.util.concurrent.Future<java.lang.Class<?>> wildcardClassFuture3 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = wildcardClassFuture3.getClass();
        java.util.concurrent.Future<java.lang.reflect.Type> typeFuture5 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.Type) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = typeFuture5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test11");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.CharSequence) "hi!");
        java.util.concurrent.Future<java.util.concurrent.Future<java.lang.CharSequence>> charSequenceFutureFuture2 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(charSequenceFuture1);
        java.lang.Class<?> wildcardClass3 = charSequenceFuture1.getClass();
        java.util.concurrent.Future<java.lang.Class<?>> wildcardClassFuture4 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(wildcardClass3);
        java.util.concurrent.Future<java.lang.reflect.AnnotatedElement> annotatedElementFuture5 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.AnnotatedElement) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = annotatedElementFuture5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFutureFuture2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassFuture4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test12");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.CharSequence) "hi!");
        java.util.concurrent.Future<java.util.concurrent.Future<java.lang.CharSequence>> charSequenceFutureFuture2 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(charSequenceFuture1);
        java.lang.Class<?> wildcardClass3 = charSequenceFuture1.getClass();
        java.util.concurrent.Future<java.lang.Class<?>> wildcardClassFuture4 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(wildcardClass3);
        java.lang.Class<?> wildcardClass5 = wildcardClassFuture4.getClass();
        java.util.concurrent.Future<java.lang.reflect.AnnotatedElement> annotatedElementFuture6 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.AnnotatedElement) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFutureFuture2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassFuture4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementFuture6);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test13");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass2 = charSequenceFuture1.getClass();
        java.util.concurrent.Future<java.lang.Class<?>> wildcardClassFuture3 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = wildcardClassFuture3.getClass();
        java.util.concurrent.Future<java.lang.reflect.GenericDeclaration> genericDeclarationFuture5 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = genericDeclarationFuture5.getClass();
        java.util.concurrent.Future<java.lang.reflect.AnnotatedElement> annotatedElementFuture7 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.AnnotatedElement) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = annotatedElementFuture7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementFuture7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test14");
        java.util.concurrent.Future<java.io.Serializable> serializableFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.io.Serializable) 1.0d);
        java.util.concurrent.Future<java.lang.Object> objFuture2 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.Object) serializableFuture1);
        java.lang.Class<?> wildcardClass3 = serializableFuture1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objFuture2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test15");
        java.util.concurrent.Future<java.lang.String> strFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture("");
        java.lang.Class<?> wildcardClass2 = strFuture1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test16");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.CharSequence) "hi!");
        java.util.concurrent.Future<java.util.concurrent.Future<java.lang.CharSequence>> charSequenceFutureFuture2 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(charSequenceFuture1);
        java.lang.Class<?> wildcardClass3 = charSequenceFuture1.getClass();
        java.util.concurrent.Future<java.lang.Class<?>> wildcardClassFuture4 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(wildcardClass3);
        java.util.concurrent.Future<java.lang.reflect.AnnotatedElement> annotatedElementFuture5 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.AnnotatedElement) wildcardClass3);
        java.util.concurrent.Future<java.lang.reflect.GenericDeclaration> genericDeclarationFuture6 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.GenericDeclaration) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFutureFuture2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassFuture4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationFuture6);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test17");
        java.lang.Class<?> wildcardClass0 = null;
        java.util.concurrent.Future<java.lang.Class<?>> wildcardClassFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(wildcardClass0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassFuture1);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test18");
        java.util.concurrent.Future<java.io.Serializable> serializableFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.io.Serializable) (byte) -1);
        java.lang.Class<?> wildcardClass2 = serializableFuture1.getClass();
        java.util.concurrent.Future<java.lang.reflect.Type> typeFuture3 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.Type) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = typeFuture3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test19");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.CharSequence) "hi!");
        java.util.concurrent.Future<java.util.concurrent.Future<java.lang.CharSequence>> charSequenceFutureFuture2 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(charSequenceFuture1);
        java.lang.Class<?> wildcardClass3 = charSequenceFutureFuture2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFutureFuture2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test20");
        java.util.concurrent.Future<java.io.Serializable> serializableFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.io.Serializable) 1.0d);
        java.lang.Class<?> wildcardClass2 = serializableFuture1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test21");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass2 = charSequenceFuture1.getClass();
        java.util.concurrent.Future<java.lang.Class<?>> wildcardClassFuture3 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = wildcardClassFuture3.getClass();
        java.util.concurrent.Future<java.lang.reflect.GenericDeclaration> genericDeclarationFuture5 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.util.concurrent.Future<java.lang.reflect.GenericDeclaration> genericDeclarationFuture6 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.GenericDeclaration) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationFuture6);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test22");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass2 = charSequenceFuture1.getClass();
        java.util.concurrent.Future<java.lang.Class<?>> wildcardClassFuture3 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = wildcardClassFuture3.getClass();
        java.util.concurrent.Future<java.lang.reflect.GenericDeclaration> genericDeclarationFuture5 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = genericDeclarationFuture5.getClass();
        java.util.concurrent.Future<java.lang.reflect.Type> typeFuture7 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.Type) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeFuture7);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test23");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass2 = charSequenceFuture1.getClass();
        java.util.concurrent.Future<java.lang.Class<?>> wildcardClassFuture3 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = wildcardClassFuture3.getClass();
        java.util.concurrent.Future<java.lang.reflect.GenericDeclaration> genericDeclarationFuture5 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.util.concurrent.Future<java.lang.reflect.AnnotatedElement> annotatedElementFuture6 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.AnnotatedElement) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = annotatedElementFuture6.getClass();
        java.util.concurrent.Future<java.lang.reflect.Type> typeFuture8 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.Type) wildcardClass7);
        java.util.concurrent.Future<java.io.Serializable> serializableFuture9 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.io.Serializable) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementFuture6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeFuture8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableFuture9);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test24");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass2 = charSequenceFuture1.getClass();
        java.util.concurrent.Future<java.lang.Class<?>> wildcardClassFuture3 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = wildcardClassFuture3.getClass();
        java.util.concurrent.Future<java.lang.reflect.GenericDeclaration> genericDeclarationFuture5 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = genericDeclarationFuture5.getClass();
        java.util.concurrent.Future<java.io.Serializable> serializableFuture7 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.io.Serializable) wildcardClass6);
        java.util.concurrent.Future<java.io.Serializable> serializableFuture8 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.io.Serializable) wildcardClass6);
        java.util.concurrent.Future<java.lang.reflect.AnnotatedElement> annotatedElementFuture9 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.AnnotatedElement) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableFuture7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableFuture8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementFuture9);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test25");
        java.lang.reflect.Type type0 = null;
        java.util.concurrent.Future<java.lang.reflect.Type> typeFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(type0);
        java.lang.Class<?> wildcardClass2 = typeFuture1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test26");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.CharSequence) "");
        java.util.concurrent.Future<java.util.concurrent.Future<java.lang.CharSequence>> charSequenceFutureFuture2 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(charSequenceFuture1);
        java.util.concurrent.Future<java.util.concurrent.Future<java.lang.CharSequence>> charSequenceFutureFuture3 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(charSequenceFuture1);
        java.lang.Class<?> wildcardClass4 = charSequenceFuture1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFutureFuture2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFutureFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test27");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.CharSequence) "hi!");
        java.util.concurrent.Future<java.util.concurrent.Future<java.lang.CharSequence>> charSequenceFutureFuture2 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(charSequenceFuture1);
        java.util.concurrent.Future<java.util.concurrent.Future<java.lang.CharSequence>> charSequenceFutureFuture3 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFutureFuture2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFutureFuture3);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test28");
        java.lang.CharSequence charSequence0 = null;
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(charSequence0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test29");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.CharSequence) "");
        java.util.concurrent.Future<java.util.concurrent.Future<java.lang.CharSequence>> charSequenceFutureFuture2 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(charSequenceFuture1);
        java.util.concurrent.Future<java.util.concurrent.Future<java.lang.CharSequence>> charSequenceFutureFuture3 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(charSequenceFuture1);
        java.lang.Class<?> wildcardClass4 = charSequenceFutureFuture3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFutureFuture2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFutureFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test30");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass2 = charSequenceFuture1.getClass();
        java.util.concurrent.Future<java.lang.Class<?>> wildcardClassFuture3 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = wildcardClassFuture3.getClass();
        java.util.concurrent.Future<java.lang.Object> objFuture5 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.Object) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objFuture5);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test31");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass2 = charSequenceFuture1.getClass();
        java.util.concurrent.Future<java.lang.Class<?>> wildcardClassFuture3 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = wildcardClassFuture3.getClass();
        java.util.concurrent.Future<java.lang.reflect.GenericDeclaration> genericDeclarationFuture5 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = genericDeclarationFuture5.getClass();
        java.util.concurrent.Future<java.io.Serializable> serializableFuture7 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.io.Serializable) wildcardClass6);
        java.util.concurrent.Future<java.io.Serializable> serializableFuture8 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.io.Serializable) wildcardClass6);
        java.lang.Class<?> wildcardClass9 = serializableFuture8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableFuture7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableFuture8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test32");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass2 = charSequenceFuture1.getClass();
        java.util.concurrent.Future<java.lang.Class<?>> wildcardClassFuture3 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(wildcardClass2);
        java.lang.Class<?> wildcardClass4 = wildcardClassFuture3.getClass();
        java.util.concurrent.Future<java.lang.Class<?>> wildcardClassFuture5 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(wildcardClass4);
        java.lang.Class<?> wildcardClass6 = wildcardClassFuture5.getClass();
        java.util.concurrent.Future<java.lang.reflect.GenericDeclaration> genericDeclarationFuture7 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.GenericDeclaration) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationFuture7);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test33");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.util.concurrent.Future<java.lang.reflect.GenericDeclaration> genericDeclarationFuture2 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.util.concurrent.Future<java.lang.reflect.Type> typeFuture3 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.Type) wildcardClass1);
        java.lang.Class<?> wildcardClass4 = typeFuture3.getClass();
        java.util.concurrent.Future<java.lang.reflect.Type> typeFuture5 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.Type) wildcardClass4);
        java.util.concurrent.Future<java.lang.Class<?>> wildcardClassFuture6 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationFuture2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassFuture6);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test34");
        java.util.concurrent.Future<java.io.Serializable> serializableFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.io.Serializable) (byte) -1);
        java.util.concurrent.Future<java.lang.Object> objFuture2 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass3 = objFuture2.getClass();
        java.util.concurrent.Future<java.lang.reflect.AnnotatedElement> annotatedElementFuture4 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.AnnotatedElement) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = annotatedElementFuture4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objFuture2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementFuture4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test35");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass2 = charSequenceFuture1.getClass();
        java.util.concurrent.Future<java.lang.reflect.AnnotatedElement> annotatedElementFuture3 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.AnnotatedElement) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementFuture3);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test36");
        java.util.concurrent.Future<java.io.Serializable> serializableFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.io.Serializable) (byte) -1);
        java.lang.Class<?> wildcardClass2 = serializableFuture1.getClass();
        java.util.concurrent.Future<java.lang.reflect.GenericDeclaration> genericDeclarationFuture3 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.GenericDeclaration) wildcardClass2);
        java.util.concurrent.Future<java.lang.Class<?>> wildcardClassFuture4 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassFuture4);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test37");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.CharSequence) "");
        java.util.concurrent.Future<java.util.concurrent.Future<java.lang.CharSequence>> charSequenceFutureFuture2 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(charSequenceFuture1);
        java.util.concurrent.Future<java.util.concurrent.Future<java.lang.CharSequence>> charSequenceFutureFuture3 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(charSequenceFuture1);
        java.util.concurrent.Future<java.util.concurrent.Future<java.lang.CharSequence>> charSequenceFutureFuture4 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFutureFuture2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFutureFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFutureFuture4);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test38");
        java.util.concurrent.Future<java.lang.CharSequence> charSequenceFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.CharSequence) "");
        java.util.concurrent.Future<java.util.concurrent.Future<java.lang.CharSequence>> charSequenceFutureFuture2 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(charSequenceFuture1);
        java.lang.Class<?> wildcardClass3 = charSequenceFuture1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceFutureFuture2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test39");
        java.util.concurrent.Future<java.lang.Object> objFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.Object) 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objFuture1);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test40");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.util.concurrent.Future<java.lang.reflect.GenericDeclaration> genericDeclarationFuture2 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.lang.Class<?> wildcardClass3 = genericDeclarationFuture2.getClass();
        java.util.concurrent.Future<java.lang.reflect.AnnotatedElement> annotatedElementFuture4 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.AnnotatedElement) wildcardClass3);
        java.util.concurrent.Future<java.lang.Class<?>> wildcardClassFuture5 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationFuture2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementFuture4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassFuture5);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test41");
        java.util.concurrent.Future<java.lang.Object> objFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass2 = objFuture1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConcurrentUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConcurrentUtils0.test42");
        java.util.concurrent.Future<java.io.Serializable> serializableFuture1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.io.Serializable) (byte) -1);
        java.lang.Class<?> wildcardClass2 = serializableFuture1.getClass();
        java.util.concurrent.Future<java.lang.reflect.Type> typeFuture3 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.Type) wildcardClass2);
        java.util.concurrent.Future<java.lang.reflect.GenericDeclaration> genericDeclarationFuture4 = org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture((java.lang.reflect.GenericDeclaration) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableFuture1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationFuture4);
    }
}

