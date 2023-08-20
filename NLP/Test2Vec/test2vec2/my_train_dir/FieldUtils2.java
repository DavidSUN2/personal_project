
package FieldUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FieldUtils2 {

    public static boolean debug = false;

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1001");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) false, (java.lang.Object) fieldUtils2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1002");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1003");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0d, (java.lang.Object) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1004");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) fieldUtils1, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1005");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 0, "hi!", (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1006");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100.0d, (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1007");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) wildcardClass1, "", obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1008");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1009");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1010");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "hi!", "hi!", (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1011");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 100, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1012");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1013");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1014");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100, "", (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1015");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0d, "", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1016");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100L, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1017");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '4', "hi!", (java.lang.Object) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1018");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1L, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1019");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1020");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 100, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1021");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) '4', "hi!", (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1022");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1023");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1024");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1), "hi!", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1025");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "", "hi!", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1026");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0f, "hi!", (java.lang.Object) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1027");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0d), (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1028");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) -1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1029");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) -1, "", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1030");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "", (java.lang.Object) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1031");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1032");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) wildcardClass2, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1033");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", (java.lang.Object) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1034");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1035");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1036");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1037");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10, "", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1038");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10, "", (java.lang.Object) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1039");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1040");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '#', "", (java.lang.Object) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1041");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1042");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10, "hi!", (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1043");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100.0d, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1044");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) fieldUtils1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1045");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1047");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1048");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0d), "hi!", (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1049");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1050");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1051");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) -1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1052");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) '#', "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1053");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100, "hi!", (java.lang.Object) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1054");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1055");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0L, "hi!", (java.lang.Object) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1056");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) -1, "hi!", (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1057");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1058");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0.0d, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1059");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) ' ', (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1060");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) '4', (java.lang.Object) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1061");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1062");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1063");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 10.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1064");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) ' ', "hi!", (java.lang.Object) "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1065");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "hi!", (java.lang.Object) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1066");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1.0f), "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1067");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "", "", (java.lang.Object) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1069");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1070");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 10, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1071");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 100, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1072");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 1, "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1073");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "hi!", (java.lang.Object) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1074");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1075");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0f, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1076");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(obj0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1078");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100L, "hi!", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1079");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1080");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1081");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1082");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1083");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0.0f, (java.lang.Object) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1084");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0d, obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1085");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0, "hi!", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1086");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) fieldUtils0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class org.apache.commons.lang3.reflect.FieldUtils");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1087");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1088");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) -1, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1089");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) -1, "hi!", (java.lang.Object) 10.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1090");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) wildcardClass1, "", (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1091");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) fieldUtils0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1092");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0f), (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1093");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1094");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '#', "hi!", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1095");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1), "", (java.lang.Object) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1096");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) "", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1097");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1098");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1), (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1099");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10L, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1100");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) ' ', "hi!", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1101");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 1, "", (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1102");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '4', "hi!", (java.lang.Object) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1103");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) wildcardClass2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1104");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1L, (java.lang.Object) "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1105");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0f, "", (java.lang.Object) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1106");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0d, "hi!", (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1107");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 10, "hi!", obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1108");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) -1, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1109");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) -1, "", (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1110");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 1, "hi!", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1111");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0f), "", (java.lang.Object) 0L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1112");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0f, "", (java.lang.Object) fieldUtils2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1113");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 100, "", (java.lang.Object) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1114");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1115");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1L), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1116");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(obj0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Object");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1117");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1L), "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1118");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1119");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) wildcardClass2, (java.lang.Object) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1120");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 1, "hi!", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1121");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1), "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1122");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 10, "hi!", (java.lang.Object) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1123");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) wildcardClass1, "hi!", (java.lang.Object) 10.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1124");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0f, "", (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1125");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1126");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) fieldUtils1, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1127");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) -1, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1128");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0f, (java.lang.Object) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1129");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) -1, "", (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1130");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) '4', (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1131");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0f, "", (java.lang.Object) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1132");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 1, "hi!", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1133");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0d, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1134");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) ' ', "hi!", (java.lang.Object) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1135");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1136");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 10, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1137");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 0, "", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1138");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0L, (java.lang.Object) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1139");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1L, obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1140");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1.0f), "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1141");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1.0f), "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1142");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0L, "", (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1143");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0d, "", (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1144");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1145");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0d, "hi!", (java.lang.Object) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1146");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) '#', "", (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1147");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0f, "hi!", (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1148");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0d, "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1149");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 100, "hi!", (java.lang.Object) 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1150");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) -1, "", (java.lang.Object) 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1151");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 1, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1152");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1153");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0d, (java.lang.Object) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1154");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0d), "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1155");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0f, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1156");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100, "hi!", (java.lang.Object) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1157");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 1, "hi!", (java.lang.Object) 10.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1158");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100L, "hi!", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1159");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0, (java.lang.Object) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1160");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0.0d, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1161");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0f), "", (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1162");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1163");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1L), (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1164");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1L), "", (java.lang.Object) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1165");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1166");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 'a', "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1167");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) wildcardClass1, "", (java.lang.Object) (-1L), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1168");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1169");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10L, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1171");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 1, "", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1172");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0d, "hi!", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1173");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "hi!", (java.lang.Object) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1174");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10L, "", (java.lang.Object) "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1175");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1.0d), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1176");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1.0f, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1177");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0d, "", (java.lang.Object) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1178");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1.0f), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1179");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0d, (java.lang.Object) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1180");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1), "", (java.lang.Object) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1181");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 0, "hi!", (java.lang.Object) 10.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1182");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "", (java.lang.Object) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1183");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 0, "", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1184");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0d, "hi!", (java.lang.Object) 0L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1185");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0d), "", (java.lang.Object) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1186");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1187");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) ' ', "", (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1188");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) wildcardClass2, (java.lang.Object) 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1189");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) true, "hi!", (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1190");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1191");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1192");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) -1, (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1193");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10, (java.lang.Object) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1194");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 'a', "", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1195");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0L, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1196");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1, "", (java.lang.Object) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1197");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0, "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1199");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) wildcardClass1, "", (java.lang.Object) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1200");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1201");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 10, "hi!", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1202");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1203");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1204");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) -1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1205");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1206");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1.0f, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1207");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) fieldUtils0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class org.apache.commons.lang3.reflect.FieldUtils");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1208");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0d, "", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1209");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) ' ', "hi!", (java.lang.Object) (-1L), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1210");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0.0d, (java.lang.Object) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1211");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0d, "", (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1212");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1, "", (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1213");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1214");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0f), (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1215");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) fieldUtils0, "", (java.lang.Object) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1216");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1217");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1L), "hi!", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1218");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1219");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1220");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1221");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "hi!", (java.lang.Object) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1222");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, obj1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1223");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 1, "", (java.lang.Object) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1224");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0f, obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1225");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) -1, "hi!", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1226");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1.0f, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1227");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1228");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) wildcardClass1, "hi!", (java.lang.Object) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1229");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 0, (java.lang.Object) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1230");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) '#', "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1231");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0f, "hi!", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1232");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0f, "", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1233");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100L, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1234");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1235");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100.0d, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1236");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 10, "hi!", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1237");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) ' ', (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1238");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) '4', "", (java.lang.Object) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1239");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(obj0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1240");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0.0f, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1241");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "hi!", "", (java.lang.Object) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1242");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) -1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1243");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1L, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1244");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) -1, "hi!", (java.lang.Object) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1245");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0, "", (java.lang.Object) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1246");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0L, "hi!", (java.lang.Object) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1247");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 1, "hi!", (java.lang.Object) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1248");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1249");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "hi!", "", (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1250");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.FieldUtils.readField(obj0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Object");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1251");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1252");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0f, "", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1253");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 100, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1254");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1255");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 'a', "", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1256");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0d, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1257");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) "", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1258");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 'a', (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1259");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1260");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1L, (java.lang.Object) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1261");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1262");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) fieldUtils1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1263");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) true, "hi!", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1264");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "hi!", "", (java.lang.Object) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1265");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 0, "hi!", (java.lang.Object) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1266");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1267");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1268");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0d, "hi!", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1269");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1270");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) false, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1271");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1L, "hi!", (java.lang.Object) (-1L), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1272");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 'a', "", (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1273");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0d, "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1274");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "", (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1275");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) wildcardClass1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1276");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 10, "", (java.lang.Object) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1277");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0.0f, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1278");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1279");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100, "hi!", (java.lang.Object) "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1280");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1, "hi!", (java.lang.Object) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1281");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0d), "", (java.lang.Object) wildcardClass3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1282");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0, "hi!", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1283");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '4', "hi!", (java.lang.Object) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1284");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", (java.lang.Object) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1285");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) false, "", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1286");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100.0d, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1287");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0f), (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1288");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100.0f, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1289");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) fieldUtils0, "hi!", (java.lang.Object) 10.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1290");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1291");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1292");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "", "hi!", (java.lang.Object) "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1293");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "", (java.lang.Object) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1294");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0L, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1295");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1296");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) wildcardClass1, "hi!", (java.lang.Object) 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1297");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) -1, "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1298");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0d), (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1299");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1300");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1, "", (java.lang.Object) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1301");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0.0d, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1302");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0f, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1303");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1304");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "", (java.lang.Object) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1305");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, obj1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1306");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "hi!", "", (java.lang.Object) "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1307");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1), (java.lang.Object) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1308");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) '#', "hi!", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1309");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 1, "hi!", (java.lang.Object) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1310");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1L, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1311");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0d, "hi!", (java.lang.Object) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1312");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) ' ', "", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1313");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0d, "", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1314");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 10, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1315");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 100, "hi!", (java.lang.Object) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1316");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 0, (java.lang.Object) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1317");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) false, "", (java.lang.Object) wildcardClass3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1318");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100.0f, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1319");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) -1, "", (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1320");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1), "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1321");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "", "hi!", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1322");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0d, "hi!", (java.lang.Object) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1323");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "hi!", (java.lang.Object) "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1324");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0f, "hi!", (java.lang.Object) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1325");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 1, "", (java.lang.Object) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1326");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1327");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1, "hi!", (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1328");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10, "", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1329");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0d, "hi!", (java.lang.Object) (-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1330");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 10, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1331");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1332");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1333");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) -1, (java.lang.Object) wildcardClass3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1334");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0, "hi!", (java.lang.Object) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1335");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "", "", (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1336");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1337");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0, "hi!", (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1338");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) false, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1339");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 0, "hi!", (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1340");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "hi!", (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1341");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1342");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1343");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1344");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1, (java.lang.Object) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1345");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1346");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 10, "", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1347");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0f), "", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1348");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0d, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1349");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1), "", (java.lang.Object) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1350");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10, "", (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1351");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1352");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1.0d), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1353");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1L), (java.lang.Object) 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1354");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0d, "hi!", (java.lang.Object) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1355");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0d, "", (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1356");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1357");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0.0f, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1358");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0d, "", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1359");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 0, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1360");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1), "hi!", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1361");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10L, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1362");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) false, "hi!", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1363");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1364");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "", (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1365");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0d), "", (java.lang.Object) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1366");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "", (java.lang.Object) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1367");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) -1, "hi!", (java.lang.Object) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1368");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0f, "hi!", (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1369");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) false, (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1370");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1371");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0, "", (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1372");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0f), (java.lang.Object) (-1.0d), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1373");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", (java.lang.Object) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1374");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) '#', "", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1376");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1377");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0, (java.lang.Object) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1378");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 1, "hi!", (java.lang.Object) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1379");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1380");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1381");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0d, "", (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1382");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1383");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100L, (java.lang.Object) "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1384");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) fieldUtils0, "hi!", (java.lang.Object) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1385");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0.0d, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1386");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 10, "", (java.lang.Object) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1387");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 1, "hi!", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1388");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0d, "hi!", (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1389");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "hi!", "hi!", (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1390");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10, "", (java.lang.Object) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1391");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1392");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1393");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1394");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0d), "hi!", (java.lang.Object) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1395");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1396");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0f, "", (java.lang.Object) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1397");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) wildcardClass1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1398");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 10, (java.lang.Object) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1399");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1.0d, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1400");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0L, "", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1401");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1402");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "", "", (java.lang.Object) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1403");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1404");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 0, "", (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1405");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) '#', "hi!", (java.lang.Object) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1406");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0, "hi!", obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1407");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "hi!", "", (java.lang.Object) (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1408");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(obj0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1409");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "hi!", "", (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1410");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0d, "hi!", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1411");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1L), (java.lang.Object) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1412");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1413");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "hi!", (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1414");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0f), "", (java.lang.Object) fieldUtils2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1415");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 1, "", (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1416");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100.0d, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1417");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 1, (java.lang.Object) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1418");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) '#', (java.lang.Object) fieldUtils2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1419");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) -1, (java.lang.Object) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1420");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) wildcardClass2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1421");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) fieldUtils0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1422");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100, (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1423");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) true, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1424");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0L, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1425");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) fieldUtils0, "hi!", (java.lang.Object) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1426");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) '#', (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1427");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 'a', "", (java.lang.Object) 10.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1428");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '4', "hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1429");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) fieldUtils0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class org.apache.commons.lang3.reflect.FieldUtils");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1430");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 0, (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1431");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1, "hi!", (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1432");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1433");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1L, (java.lang.Object) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1434");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) wildcardClass1, "hi!", (java.lang.Object) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1435");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0, "", (java.lang.Object) 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1436");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100L, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1437");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1438");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) ' ', "", (java.lang.Object) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1439");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0.0f, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1440");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) '4', (java.lang.Object) 10.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1441");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1, "hi!", (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1442");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1L), "", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1443");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1444");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100, "", (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1445");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 10.0f, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1446");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) -1, "hi!", (java.lang.Object) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1447");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0.0f, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1448");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1449");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1450");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100.0f, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1451");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0f, "hi!", (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1452");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '#', "", (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1453");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0d, "hi!", (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1454");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0d, obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1455");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1456");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0d, "", (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1457");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1, "hi!", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1458");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) -1, "hi!", (java.lang.Object) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1459");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1460");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0d, "", (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1461");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0, "hi!", (java.lang.Object) (-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1462");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0d, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1463");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "", (java.lang.Object) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1464");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 100, "", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1465");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1L), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1466");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0L, "", (java.lang.Object) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1467");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "hi!", "", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1468");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1469");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100.0d, (java.lang.Object) wildcardClass3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1470");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) '4', "", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1471");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) wildcardClass1, "", (java.lang.Object) (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1472");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10L, (java.lang.Object) (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1473");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 1, "", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1474");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0d, "", (java.lang.Object) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1475");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0d, "", (java.lang.Object) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1476");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 1, (java.lang.Object) fieldUtils2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1477");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 1, "", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1478");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 100, "hi!", (java.lang.Object) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1479");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) -1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1480");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "hi!", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1481");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1482");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) false, "hi!", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1483");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0L, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1484");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 1, "hi!", (java.lang.Object) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1485");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '4', "hi!", (java.lang.Object) "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1486");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1487");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0d, "hi!", (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1488");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1), "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1489");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1490");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1L), "", (java.lang.Object) false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1491");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0f, "hi!", (java.lang.Object) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1492");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0f, (java.lang.Object) fieldUtils2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1493");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) false, "hi!", (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1494");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1495");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1496");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1497");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) fieldUtils0, "hi!", (java.lang.Object) 10.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1498");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0d, (java.lang.Object) "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1499");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) -1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.test1500");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0d, "", (java.lang.Object) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

