package ConstructorUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ConstructorUtils0 {

    public static boolean debug = false;

    @Test
    public void ConstructorUtils1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstructorUtils0.ConstructorUtils1");
        org.apache.commons.lang3.reflect.ConstructorUtils constructorUtils0 = new org.apache.commons.lang3.reflect.ConstructorUtils();
        java.lang.Class<?> wildcardClass1 = constructorUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void ConstructorUtils2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstructorUtils0.ConstructorUtils2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

