package MutableObject;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void MutableObject01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject01");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.String str3 = strMutableObject1.getValue();
        // during MutableObject generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) strMutableObject1);
    }

    @Test
    public void MutableObject02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject02");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject5 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean7 = strMutableObject5.equals((java.lang.Object) 100.0d);
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) 100.0d);
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject5, strMutableObject0, and strMutableObject5.", !(strMutableObject5.equals(strMutableObject0) && strMutableObject0.equals(strMutableObject5)) || strMutableObject5.equals(strMutableObject5));
    }

    @Test
    public void MutableObject03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject03");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) false);
        java.lang.Class<?> wildcardClass7 = objMutableObject6.getClass();
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) wildcardClass7);
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject0, objMutableObject6, and objMutableObject6.", !(strMutableObject0.equals(objMutableObject6) && objMutableObject6.equals(objMutableObject6)) || strMutableObject0.equals(objMutableObject6));
    }

    @Test
    public void MutableObject04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject04");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass2 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type> typeMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass2);
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject0, typeMutableObject3, and strMutableObject0.", !(strMutableObject0.equals(typeMutableObject3) && typeMutableObject3.equals(strMutableObject0)) || strMutableObject0.equals(strMutableObject0));
    }

    @Test
    public void MutableObject05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject05");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>();
        // during MutableObject generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) serializableMutableObject3);
    }

    @Test
    public void MutableObject06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject06");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>> strComparableMutableObject5 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>>();
        // during MutableObject generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) strComparableMutableObject5);
    }

    @Test
    public void MutableObject07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject07");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject5 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject5.setValue("hi!");
        java.lang.String str8 = strMutableObject5.toString();
        boolean boolean9 = strMutableObject0.equals((java.lang.Object) str8);
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject0, strMutableObject5, and strMutableObject5.", !(strMutableObject0.equals(strMutableObject5) && strMutableObject5.equals(strMutableObject5)) || strMutableObject0.equals(strMutableObject5));
    }

    @Test
    public void MutableObject08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject08");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject3.setValue("hi!");
        java.lang.String str6 = strMutableObject3.toString();
        // during MutableObject generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) strMutableObject3);
    }

    @Test
    public void MutableObject09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject09");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.String str2 = strMutableObject1.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>();
        boolean boolean4 = strMutableObject1.equals((java.lang.Object) genericDeclarationMutableObject3);
        java.lang.String str5 = strMutableObject1.getValue();
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on genericDeclarationMutableObject3, strMutableObject1, and genericDeclarationMutableObject3.", !(genericDeclarationMutableObject3.equals(strMutableObject1) && strMutableObject1.equals(genericDeclarationMutableObject3)) || genericDeclarationMutableObject3.equals(genericDeclarationMutableObject3));
    }

    @Test
    public void MutableObject10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject10");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) "null");
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject0, strMutableObject1, and strMutableObject1.", !(strMutableObject0.equals(strMutableObject1) && strMutableObject1.equals(strMutableObject1)) || strMutableObject0.equals(strMutableObject1));
    }

    @Test
    public void MutableObject11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject11");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>> strComparableMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>>();
        java.lang.Class<?> wildcardClass1 = strComparableMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject2 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass1);
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strComparableMutableObject0, genericDeclarationMutableObject2, and strComparableMutableObject0.", !(strComparableMutableObject0.equals(genericDeclarationMutableObject2) && genericDeclarationMutableObject2.equals(strComparableMutableObject0)) || strComparableMutableObject0.equals(strComparableMutableObject0));
    }

    @Test
    public void MutableObject12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject12");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 0.0d);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence> charSequenceMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        boolean boolean9 = strMutableObject0.equals((java.lang.Object) "hi!");
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject0, charSequenceMutableObject8, and charSequenceMutableObject8.", !(strMutableObject0.equals(charSequenceMutableObject8) && charSequenceMutableObject8.equals(charSequenceMutableObject8)) || strMutableObject0.equals(charSequenceMutableObject8));
    }

    @Test
    public void MutableObject13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject13");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>();
        java.lang.Class<?> wildcardClass1 = genericDeclarationMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject2 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass1);
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on genericDeclarationMutableObject0, genericDeclarationMutableObject2, and genericDeclarationMutableObject0.", !(genericDeclarationMutableObject0.equals(genericDeclarationMutableObject2) && genericDeclarationMutableObject2.equals(genericDeclarationMutableObject0)) || genericDeclarationMutableObject0.equals(genericDeclarationMutableObject0));
    }

    @Test
    public void MutableObject14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject14");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass3 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass3);
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject0, annotatedElementMutableObject4, and strMutableObject0.", !(strMutableObject0.equals(annotatedElementMutableObject4) && annotatedElementMutableObject4.equals(strMutableObject0)) || strMutableObject0.equals(strMutableObject0));
    }

    @Test
    public void MutableObject15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject15");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject5 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) (short) 1);
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject0, strMutableMutableObject5, and strMutableMutableObject5.", !(strMutableObject0.equals(strMutableMutableObject5) && strMutableMutableObject5.equals(strMutableMutableObject5)) || strMutableObject0.equals(strMutableMutableObject5));
    }

    @Test
    public void MutableObject16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject16");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>> strComparableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "null");
        java.lang.Class<?> wildcardClass8 = strComparableMutableObject7.getClass();
        // during MutableObject generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = strMutableObject0.equals((java.lang.Object) strComparableMutableObject7);
    }

    @Test
    public void MutableObject17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject17");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>((java.io.Serializable) str3);
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject0, serializableMutableObject4, and strMutableObject0.", !(strMutableObject0.equals(serializableMutableObject4) && serializableMutableObject4.equals(strMutableObject0)) || strMutableObject0.equals(strMutableObject0));
    }

    @Test
    public void MutableObject18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject18");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject5 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        java.lang.Class<?> wildcardClass6 = strMutableMutableObject5.getClass();
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject0, strMutableMutableObject5, and strMutableObject0.", !(strMutableObject0.equals(strMutableMutableObject5) && strMutableMutableObject5.equals(strMutableObject0)) || strMutableObject0.equals(strMutableObject0));
    }

    @Test
    public void MutableObject19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject19");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass2 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass2);
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject0, annotatedElementMutableObject3, and strMutableObject0.", !(strMutableObject0.equals(annotatedElementMutableObject3) && annotatedElementMutableObject3.equals(strMutableObject0)) || strMutableObject0.equals(strMutableObject0));
    }

    @Test
    public void MutableObject20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject20");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean6 = strMutableObject4.equals((java.lang.Object) 100.0d);
        java.lang.String str7 = strMutableObject4.toString();
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) strMutableObject4);
        java.lang.String str9 = strMutableObject0.getValue();
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject4, strMutableObject0, and strMutableObject4.", !(strMutableObject4.equals(strMutableObject0) && strMutableObject0.equals(strMutableObject4)) || strMutableObject4.equals(strMutableObject4));
    }

    @Test
    public void MutableObject21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject21");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        strMutableObject1.setValue("");
        java.lang.String str6 = strMutableObject1.toString();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Class<?>> wildcardClassMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Class<?>>();
        boolean boolean8 = strMutableObject1.equals((java.lang.Object) wildcardClassMutableObject7);
        java.lang.Class<?> wildcardClass9 = strMutableObject1.getClass();
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on wildcardClassMutableObject7, strMutableObject1, and wildcardClassMutableObject7.", !(wildcardClassMutableObject7.equals(strMutableObject1) && strMutableObject1.equals(wildcardClassMutableObject7)) || wildcardClassMutableObject7.equals(wildcardClassMutableObject7));
    }

    @Test
    public void MutableObject22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject22");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        java.lang.Class<?> wildcardClass5 = strMutableMutableObject4.getClass();
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject0, strMutableMutableObject4, and strMutableObject0.", !(strMutableObject0.equals(strMutableMutableObject4) && strMutableMutableObject4.equals(strMutableObject0)) || strMutableObject0.equals(strMutableObject0));
    }

    @Test
    public void MutableObject23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject23");
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

    @Test
    public void MutableObject24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject24");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>();
        java.lang.Class<?> wildcardClass1 = genericDeclarationMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject2 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass1);
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on genericDeclarationMutableObject0, annotatedElementMutableObject2, and genericDeclarationMutableObject0.", !(genericDeclarationMutableObject0.equals(annotatedElementMutableObject2) && annotatedElementMutableObject2.equals(genericDeclarationMutableObject0)) || genericDeclarationMutableObject0.equals(genericDeclarationMutableObject0));
    }

    @Test
    public void MutableObject25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject25");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        strMutableObject1.setValue("");
        java.lang.String str6 = strMutableObject1.toString();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Class<?>> wildcardClassMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Class<?>>();
        boolean boolean8 = strMutableObject1.equals((java.lang.Object) wildcardClassMutableObject7);
        java.lang.Class<?> wildcardClass9 = wildcardClassMutableObject7.getClass();
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on wildcardClassMutableObject7, strMutableObject1, and strMutableObject1.", !(wildcardClassMutableObject7.equals(strMutableObject1) && strMutableObject1.equals(strMutableObject1)) || wildcardClassMutableObject7.equals(strMutableObject1));
    }

    @Test
    public void MutableObject26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject26");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 0.0d);
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject9 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass8);
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject0, genericDeclarationMutableObject9, and strMutableObject0.", !(strMutableObject0.equals(genericDeclarationMutableObject9) && genericDeclarationMutableObject9.equals(strMutableObject0)) || strMutableObject0.equals(strMutableObject0));
    }

    @Test
    public void MutableObject27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject27");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean6 = strMutableObject4.equals((java.lang.Object) 100.0d);
        java.lang.String str7 = strMutableObject4.toString();
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) strMutableObject4);
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject4, strMutableObject0, and strMutableObject4.", !(strMutableObject4.equals(strMutableObject0) && strMutableObject0.equals(strMutableObject4)) || strMutableObject4.equals(strMutableObject4));
    }

    @Test
    public void MutableObject28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject28");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass2 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass2);
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject0, annotatedElementMutableObject3, and strMutableObject0.", !(strMutableObject0.equals(annotatedElementMutableObject3) && annotatedElementMutableObject3.equals(strMutableObject0)) || strMutableObject0.equals(strMutableObject0));
    }

    @Test
    public void MutableObject29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject29");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>> strComparableMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>>();
        java.lang.Class<?> wildcardClass1 = strComparableMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject2 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass1);
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strComparableMutableObject0, annotatedElementMutableObject2, and strComparableMutableObject0.", !(strComparableMutableObject0.equals(annotatedElementMutableObject2) && annotatedElementMutableObject2.equals(strComparableMutableObject0)) || strComparableMutableObject0.equals(strComparableMutableObject0));
    }

    @Test
    public void MutableObject30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject30");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass4 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject5 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass4);
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject0, genericDeclarationMutableObject5, and strMutableObject0.", !(strMutableObject0.equals(genericDeclarationMutableObject5) && genericDeclarationMutableObject5.equals(strMutableObject0)) || strMutableObject0.equals(strMutableObject0));
    }

    @Test
    public void MutableObject31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.MutableObject31");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass4 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject5 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass4);
        // This assertion (transitivity of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on strMutableObject0, genericDeclarationMutableObject5, and strMutableObject0.", !(strMutableObject0.equals(genericDeclarationMutableObject5) && genericDeclarationMutableObject5.equals(strMutableObject0)) || strMutableObject0.equals(strMutableObject0));
    }
}

