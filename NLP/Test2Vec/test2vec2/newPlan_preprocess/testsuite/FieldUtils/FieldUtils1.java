package FieldUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FieldUtils1 {

    public static boolean debug = false;

    @Test
    public void FieldUtils0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0501");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 1, "", (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0502");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, obj1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0503");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0504");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0d, (java.lang.Object) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0505");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 1.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0506");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) wildcardClass1, "", (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0507");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) false, (java.lang.Object) wildcardClass3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0508");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 1, "", (java.lang.Object) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0509");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1.0f), "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0510");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) fieldUtils1, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void FieldUtils0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0511");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10L, "", (java.lang.Object) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0512");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0d, "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0513");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 10.0d, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0514");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100L, "hi!", (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0515");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0516");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 'a', obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0517");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) '4', "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0518");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100.0d, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0519");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0d, "hi!", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0520");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100.0f, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0521");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0522");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 10, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0523");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0.0d, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0524");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 10.0f, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0525");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) wildcardClass1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0526");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) -1, "hi!", (java.lang.Object) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0527");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0528");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 1, "hi!", (java.lang.Object) wildcardClass3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0529");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0530");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0531");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 'a', "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0532");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 'a', (java.lang.Object) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0533");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0534");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0.0d, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0535");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0536");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10.0d, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0537");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "hi!", "hi!", (java.lang.Object) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0538");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "hi!", (java.lang.Object) (-1L), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0539");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "", (java.lang.Object) (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0540");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 10, "hi!", (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0541");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0542");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 10, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0543");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0d, "", (java.lang.Object) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0544");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1.0f, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0545");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0546");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0547");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0548");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0d, "hi!", (java.lang.Object) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0549");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10L, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0550");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1, "", (java.lang.Object) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0551");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0552");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0553");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "hi!", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0554");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0555");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 10, (java.lang.Object) 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0556");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0557");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0558");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) ' ', "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0559");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 0, (java.lang.Object) "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0560");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0561");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 0, "", (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0562");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(obj0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0563");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 10, "", (java.lang.Object) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0564");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0f, "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0565");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1L), (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0566");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0d, "hi!", (java.lang.Object) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0567");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 100, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0568");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0, "hi!", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0569");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0570");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) "", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0571");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1L), "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0572");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0573");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1), "hi!", (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0574");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1.0f), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0575");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0d, "", (java.lang.Object) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0576");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10, "", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0577");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) false, (java.lang.Object) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0578");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0.0d, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0579");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 0, "", (java.lang.Object) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0580");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10L, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0581");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) wildcardClass2, (java.lang.Object) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0582");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 'a', "", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0583");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0584");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0d, "hi!", (java.lang.Object) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0585");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 100, (java.lang.Object) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0586");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) wildcardClass1, "", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0587");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10.0f, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0588");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) -1, (java.lang.Object) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0589");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 100, "hi!", (java.lang.Object) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0590");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0.0f, (java.lang.Object) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0591");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1.0d, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0592");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0593");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0d), (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0594");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 0.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0595");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) fieldUtils1, (java.lang.Object) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0596");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 10.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0597");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) '4', "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0598");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0599");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0d, "hi!", (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0600");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) true, "", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0601");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0.0f, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0602");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 'a', (java.lang.Object) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0603");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "", "hi!", (java.lang.Object) 10.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0604");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) true, "", (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0605");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) wildcardClass1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0606");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0d, "", (java.lang.Object) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0607");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) ' ', "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0608");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 100, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0609");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0610");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0f), (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0611");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0d, "hi!", obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0612");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0613");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1L, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0614");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1L), "", (java.lang.Object) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0615");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0616");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 10.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0617");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1L, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0618");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 10, "", (java.lang.Object) 0L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0619");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0620");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100.0f, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0621");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100.0f, (java.lang.Object) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0622");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0623");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0624");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0625");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) ' ', "hi!", (java.lang.Object) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0626");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 1.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0627");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "hi!", "", (java.lang.Object) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0628");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100L, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0629");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10L, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0630");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) wildcardClass2, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0631");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0632");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0633");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "", "hi!", (java.lang.Object) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0634");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0d), (java.lang.Object) "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0635");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "", (java.lang.Object) 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0636");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1L), "", (java.lang.Object) (-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0637");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 10, "hi!", (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0638");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100.0f, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0639");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 10, "hi!", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0640");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 1, "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0641");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0642");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 10, "", (java.lang.Object) "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0643");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0.0f, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0644");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0, (java.lang.Object) 100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0645");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0646");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0647");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 'a', "hi!", obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0648");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "hi!", (java.lang.Object) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0649");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0650");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0d), "", (java.lang.Object) "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0651");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0d, "hi!", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0652");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 'a', "hi!", (java.lang.Object) true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0653");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) '4', "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0654");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) -1, "", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0655");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0656");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) fieldUtils1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0657");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0658");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 'a', "", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0659");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0660");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 100, "", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0661");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1.0d, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0662");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0663");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1), "hi!", (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0664");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) fieldUtils0, "hi!", (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0665");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0666");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0d), "hi!", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0667");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0668");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0669");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) -1, "", (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0670");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1L, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0671");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1), "hi!", (java.lang.Object) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0672");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) fieldUtils1, (java.lang.Object) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0673");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 0L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0674");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) '4', (java.lang.Object) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0675");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1), "hi!", (java.lang.Object) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0676");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0f, "hi!", (java.lang.Object) wildcardClass3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0677");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 10, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0678");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1), "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0679");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, obj1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0680");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1L, "hi!", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0681");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100, "", (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0682");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0683");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0684");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 10, "", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0685");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 100, (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0686");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100.0f, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0687");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0688");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 1, (java.lang.Object) fieldUtils2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0689");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "hi!", "hi!", (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0690");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(obj0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Object");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0691");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0692");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) ' ', "hi!", (java.lang.Object) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0693");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1L), "hi!", (java.lang.Object) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0694");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0695");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0f, "hi!", (java.lang.Object) 0L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0696");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100L, "hi!", (java.lang.Object) (-1.0d), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0697");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0698");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10, (java.lang.Object) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0699");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1L), (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0700");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0701");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 0, "hi!", (java.lang.Object) "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0702");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "hi!", (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0703");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10L, "hi!", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0704");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100.0f, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0705");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1), "hi!", (java.lang.Object) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0706");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0707");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0708");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0L, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0709");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0710");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0711");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0712");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) wildcardClass2, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0713");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10L, "", (java.lang.Object) 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0714");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0715");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1L, "", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0716");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "hi!", (java.lang.Object) 10.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0717");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) fieldUtils0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class org.apache.commons.lang3.reflect.FieldUtils");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0718");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0719");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0720");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "", "", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0721");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) '4', "", (java.lang.Object) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0722");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0723");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) -1, "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0724");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(obj0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0725");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) true, "hi!", (java.lang.Object) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0726");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 10, "", (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0727");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100.0d, (java.lang.Object) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0728");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0729");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0.0f, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0730");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0731");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(obj0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0732");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) false, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0733");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0734");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100.0f, (java.lang.Object) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0735");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) wildcardClass3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0736");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0d, "hi!", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0737");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0.0d, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0738");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) fieldUtils0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0739");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) false, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0740");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(obj0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0741");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) fieldUtils0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0742");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0d, "", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0743");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) wildcardClass3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0744");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0745");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0746");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(obj0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0747");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0.0d, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0748");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 0, "hi!", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0749");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0L, "", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0750");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0.0f, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0751");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0L, "hi!", (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0752");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "", (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0753");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) -1, "hi!", (java.lang.Object) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0754");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 0, "", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0755");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1L), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0756");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 1, (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0757");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0758");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0759");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0f), "", (java.lang.Object) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0760");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0L, "hi!", (java.lang.Object) 10.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0761");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0L, "hi!", (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0762");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0763");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0764");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0765");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0f, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0766");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0767");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) ' ', "", (java.lang.Object) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0768");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) wildcardClass1, "", (java.lang.Object) 10.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0769");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1), (java.lang.Object) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0770");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0771");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0772");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) wildcardClass1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0773");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) '4', (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0774");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", (java.lang.Object) true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0775");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0776");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0d, "hi!", (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0777");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10, "", (java.lang.Object) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0778");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 0L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0779");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 0, "", (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0780");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0f), (java.lang.Object) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0781");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) fieldUtils0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class org.apache.commons.lang3.reflect.FieldUtils");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0782");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0783");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100.0f, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0784");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 0, "", (java.lang.Object) 100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0785");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0786");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, obj1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0787");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0788");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) ' ', "hi!", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0789");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1, "", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0790");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0791");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 100.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0792");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", (java.lang.Object) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0793");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0, (java.lang.Object) false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0794");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0795");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0d, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0796");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) false, "hi!", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0797");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0f, "", (java.lang.Object) fieldUtils2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0798");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0799");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10L, "hi!", (java.lang.Object) 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0800");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100L, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0801");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) -1, "", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0802");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0803");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0804");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) '#', "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0805");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 0L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0806");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(obj0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0807");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1L), "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0808");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0809");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 10.0d, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0810");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0811");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0812");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0813");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 0, "", (java.lang.Object) 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0814");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) true, "", (java.lang.Object) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0815");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0816");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1L), "hi!", (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0817");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 0, "", (java.lang.Object) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0818");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, obj1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0819");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) fieldUtils0, "hi!", (java.lang.Object) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0820");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 1, "hi!", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0821");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 1, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0822");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) fieldUtils1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0823");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0824");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 1, "hi!", (java.lang.Object) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0825");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0f), "hi!", (java.lang.Object) 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0826");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) ' ', "hi!", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0827");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) wildcardClass1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0828");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0d, (java.lang.Object) 100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0829");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1L, "", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0830");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (-1L), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0831");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1L, "hi!", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0832");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0f, "hi!", (java.lang.Object) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0833");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0834");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0d, "hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0835");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0836");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0837");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) fieldUtils1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0838");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100.0d, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0839");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0840");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1, (java.lang.Object) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0841");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "hi!", "", (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0842");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) wildcardClass2, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0843");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) true, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0844");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0845");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0, "hi!", (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0846");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0847");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) fieldUtils0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0848");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100L, "", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0849");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0d), (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0850");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0851");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0852");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0853");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 100, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0854");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0855");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) fieldUtils1, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0856");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0d, "hi!", (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0857");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) ' ', "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0858");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0f, "", (java.lang.Object) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0859");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 0, (java.lang.Object) 100.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0860");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 'a', "hi!", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0861");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) ' ', "", (java.lang.Object) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0862");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0, "hi!", (java.lang.Object) "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0863");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1.0f, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0864");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0865");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1.0d, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0866");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1, "hi!", (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0867");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0868");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0869");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0d, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0870");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100.0f, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0871");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0d, "", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0872");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) fieldUtils1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0873");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1L, "", (java.lang.Object) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0874");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "", (java.lang.Object) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0875");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 10, "", (java.lang.Object) 100.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0876");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0877");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) -1, "hi!", (java.lang.Object) 0L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0878");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0f, "", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0879");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10.0d, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0880");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 100, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0881");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100L, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0882");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '4', "hi!", (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0883");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 10, "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0884");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0885");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) false, "hi!", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0886");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0887");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0888");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0889");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '4', "hi!", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0890");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 10, "", (java.lang.Object) "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0891");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0892");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 100, "", (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0893");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "hi!", (java.lang.Object) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0894");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0895");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0896");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1), "hi!", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0897");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10, "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0898");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "hi!", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0899");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0900");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0901");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 0, obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0902");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10.0d, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0903");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(obj0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0904");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0L, "", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0905");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 100, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0906");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0907");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0f, (java.lang.Object) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0908");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0909");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0f, "", (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0910");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1.0d, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0911");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0912");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 0, "hi!", (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0913");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) wildcardClass1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0914");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(obj0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0915");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0.0f, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0916");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0.0d, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0917");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) -1, "hi!", (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0918");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 100, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0919");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 10L, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0920");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) fieldUtils0, "hi!", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0921");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 100, "", (java.lang.Object) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0922");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) '#', obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0923");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1), (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0924");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100.0f, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0925");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0926");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 0, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0927");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0928");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0929");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10L, "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0930");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 0, "", (java.lang.Object) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0931");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10, "", (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0932");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0933");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) -1, "hi!", (java.lang.Object) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0934");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) fieldUtils2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0935");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10L, "hi!", (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0936");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "", "hi!", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0937");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) wildcardClass1, "", (java.lang.Object) (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0938");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0f, "", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0939");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0940");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1.0d, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0941");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 0, "hi!", (java.lang.Object) (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0942");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0943");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1L, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0944");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) ' ', "", (java.lang.Object) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0945");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "", "hi!", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0946");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1L, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0947");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0d, "", obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0948");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1L), (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0949");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0950");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0f, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0951");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '#', "", (java.lang.Object) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0952");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) fieldUtils0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0953");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0d, "", (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0954");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) fieldUtils0, "", (java.lang.Object) wildcardClass3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0955");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10.0f, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0956");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0d, "", (java.lang.Object) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0957");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1L), (java.lang.Object) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0958");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1L, "hi!", (java.lang.Object) (-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0959");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0960");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0961");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0.0d, (java.lang.Object) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0962");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 10.0f, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0963");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0964");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0965");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) -1, "hi!", (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0966");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1L, (java.lang.Object) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0967");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 1, (java.lang.Object) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0968");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0969");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 0, "", (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0970");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 10, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0971");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1L, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0972");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) -1, "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0973");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0974");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1.0d), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0975");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0f, "", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0976");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0977");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0978");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0979");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) true, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0980");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0f), "", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0981");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils3 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass4 = fieldUtils3.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) fieldUtils1, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void FieldUtils0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0982");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) 100.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0983");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0984");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0f, "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0985");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) true, "", (java.lang.Object) true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0986");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 100, "hi!", (java.lang.Object) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0987");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0f, "hi!", (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0988");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 1, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0989");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0L, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0990");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0d, "", (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0991");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0, "hi!", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0992");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "hi!", "hi!", (java.lang.Object) "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0993");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0994");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) fieldUtils0, "", (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0995");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 10, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0996");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10.0d, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0997");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0d, "", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0998");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils0999");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 100, "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils1.FieldUtils1000");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

