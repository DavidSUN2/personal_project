package FieldUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FieldUtils2 {

    public static boolean debug = false;

    @Test
    public void FieldUtils1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1001");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) false, (java.lang.Object) fieldUtils2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1002");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1003");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0d, (java.lang.Object) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1004");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1005");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 0, "hi!", (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1006");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100.0d, (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1007");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1008");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1009");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1010");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "hi!", "hi!", (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1011");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 100, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1012");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1013");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1014");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1015");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0d, "", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1016");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1017");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '4', "hi!", (java.lang.Object) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1018");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1L, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1019");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1020");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 100, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1021");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) '4', "hi!", (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1022");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1023");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1024");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1), "hi!", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1025");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "", "hi!", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1026");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0f, "hi!", (java.lang.Object) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1027");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0d), (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1028");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) -1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1029");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) -1, "", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1030");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "", (java.lang.Object) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1031");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1032");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1033");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", (java.lang.Object) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1034");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1035");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1036");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1037");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10, "", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1038");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10, "", (java.lang.Object) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1039");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1040");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '#', "", (java.lang.Object) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1041");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1042");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10, "hi!", (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1043");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100.0d, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1044");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1045");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1046");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1047");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1048");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0d), "hi!", (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1049");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1050");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1051");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) -1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1052");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) '#', "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1053");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100, "hi!", (java.lang.Object) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1054");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1055");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0L, "hi!", (java.lang.Object) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1056");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) -1, "hi!", (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1057");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1058");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0.0d, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1059");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) ' ', (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1060");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) '4', (java.lang.Object) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1061");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1062");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1063");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 10.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1064");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) ' ', "hi!", (java.lang.Object) "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1065");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "hi!", (java.lang.Object) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1066");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1.0f), "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1067");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "", "", (java.lang.Object) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1068");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1069");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1070");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 10, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1071");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 100, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1072");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 1, "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1073");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "hi!", (java.lang.Object) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1074");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1075");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0f, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1076");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(obj0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1077");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1078");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100L, "hi!", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1079");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1080");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1081");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1082");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1083");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0.0f, (java.lang.Object) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1084");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0d, obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1085");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0, "hi!", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1086");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) fieldUtils0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class org.apache.commons.lang3.reflect.FieldUtils");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1087");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1088");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) -1, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1089");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) -1, "hi!", (java.lang.Object) 10.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1090");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1091");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1092");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0f), (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1093");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1094");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '#', "hi!", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1095");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1), "", (java.lang.Object) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1096");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) "", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1097");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1098");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1), (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1099");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10L, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1100");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) ' ', "hi!", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1101");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 1, "", (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1102");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '4', "hi!", (java.lang.Object) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1103");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1104");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1L, (java.lang.Object) "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1105");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0f, "", (java.lang.Object) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1106");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0d, "hi!", (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1107");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 10, "hi!", obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1108");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) -1, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1109");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) -1, "", (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1110");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 1, "hi!", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1111");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0f), "", (java.lang.Object) 0L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1112");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0f, "", (java.lang.Object) fieldUtils2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1113");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 100, "", (java.lang.Object) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1114");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1115");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1L), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1116");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(obj0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Object");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1117");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1L), "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1118");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1119");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1120");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 1, "hi!", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1121");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1), "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1122");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 10, "hi!", (java.lang.Object) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1123");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1124");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0f, "", (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1125");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1126");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) fieldUtils1, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1127");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) -1, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1128");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0f, (java.lang.Object) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1129");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) -1, "", (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1130");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) '4', (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1131");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0f, "", (java.lang.Object) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1132");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 1, "hi!", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1133");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0d, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1134");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) ' ', "hi!", (java.lang.Object) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1135");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1136");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 10, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1137");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 0, "", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1138");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0L, (java.lang.Object) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1139");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1L, obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1140");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1.0f), "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1141");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1.0f), "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1142");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0L, "", (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1143");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0d, "", (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1144");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1145");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0d, "hi!", (java.lang.Object) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1146");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) '#', "", (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1147");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0f, "hi!", (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1148");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0d, "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1149");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 100, "hi!", (java.lang.Object) 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1150");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) -1, "", (java.lang.Object) 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1151");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 1, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1152");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1153");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0d, (java.lang.Object) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1154");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0d), "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1155");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1156");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100, "hi!", (java.lang.Object) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1157");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 1, "hi!", (java.lang.Object) 10.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1158");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100L, "hi!", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1159");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0, (java.lang.Object) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1160");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0.0d, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1161");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0f), "", (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1162");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1163");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1L), (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1164");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1L), "", (java.lang.Object) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1165");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1166");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 'a', "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1167");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1168");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1169");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1170");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10L, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1171");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 1, "", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1172");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0d, "hi!", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1173");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "hi!", (java.lang.Object) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1174");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10L, "", (java.lang.Object) "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1175");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1.0d), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1176");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1.0f, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1177");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0d, "", (java.lang.Object) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1178");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1.0f), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1179");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0d, (java.lang.Object) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1180");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1), "", (java.lang.Object) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1181");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 0, "hi!", (java.lang.Object) 10.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1182");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "", (java.lang.Object) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1183");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 0, "", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1184");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0d, "hi!", (java.lang.Object) 0L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1185");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0d), "", (java.lang.Object) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1186");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1187");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) ' ', "", (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1188");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1189");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) true, "hi!", (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1190");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1191");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1192");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) -1, (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1193");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10, (java.lang.Object) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1194");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 'a', "", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1195");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0L, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1196");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1, "", (java.lang.Object) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1197");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1198");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1199");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1200");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1201");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 10, "hi!", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1202");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1203");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1204");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) -1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1205");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1206");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1.0f, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1207");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1208");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0d, "", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1209");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) ' ', "hi!", (java.lang.Object) (-1L), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1210");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0.0d, (java.lang.Object) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1211");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0d, "", (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1212");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1, "", (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1213");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1214");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0f), (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1215");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) fieldUtils0, "", (java.lang.Object) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1216");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1217");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1L), "hi!", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1218");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1219");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1220");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1221");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1222");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1223");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 1, "", (java.lang.Object) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1224");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0f, obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1225");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) -1, "hi!", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1226");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1.0f, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1227");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1228");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1229");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 0, (java.lang.Object) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1230");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) '#', "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1231");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0f, "hi!", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1232");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0f, "", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1233");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100L, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1234");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1235");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100.0d, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1236");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 10, "hi!", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1237");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) ' ', (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1238");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) '4', "", (java.lang.Object) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1239");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(obj0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1240");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0.0f, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1241");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "hi!", "", (java.lang.Object) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1242");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) -1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1243");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1L, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1244");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) -1, "hi!", (java.lang.Object) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1245");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0, "", (java.lang.Object) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1246");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0L, "hi!", (java.lang.Object) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1247");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 1, "hi!", (java.lang.Object) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1248");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1249");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "hi!", "", (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1250");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1251");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1252");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0f, "", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1253");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 100, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1254");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1255");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 'a', "", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1256");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0d, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1257");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) "", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1258");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 'a', (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1259");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1260");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1L, (java.lang.Object) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1261");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1262");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1263");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) true, "hi!", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1264");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "hi!", "", (java.lang.Object) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1265");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 0, "hi!", (java.lang.Object) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1266");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1267");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1268");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0d, "hi!", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1269");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1270");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) false, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1271");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1L, "hi!", (java.lang.Object) (-1L), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1272");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 'a', "", (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1273");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0d, "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1274");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1275");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1276");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 10, "", (java.lang.Object) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1277");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0.0f, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1278");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1279");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100, "hi!", (java.lang.Object) "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1280");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1, "hi!", (java.lang.Object) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1281");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1282");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0, "hi!", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1283");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '4', "hi!", (java.lang.Object) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1284");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", (java.lang.Object) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1285");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) false, "", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1286");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100.0d, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1287");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0f), (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1288");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100.0f, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1289");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) fieldUtils0, "hi!", (java.lang.Object) 10.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1290");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1291");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1292");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "", "hi!", (java.lang.Object) "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1293");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1294");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0L, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1295");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1296");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1297");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) -1, "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1298");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0d), (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1299");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1300");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1, "", (java.lang.Object) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1301");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0.0d, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1302");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0f, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1303");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1304");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "", (java.lang.Object) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1305");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1306");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "hi!", "", (java.lang.Object) "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1307");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1), (java.lang.Object) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1308");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) '#', "hi!", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1309");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 1, "hi!", (java.lang.Object) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1310");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1L, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1311");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0d, "hi!", (java.lang.Object) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1312");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) ' ', "", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1313");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0d, "", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1314");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 10, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1315");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 100, "hi!", (java.lang.Object) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1316");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 0, (java.lang.Object) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1317");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1318");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100.0f, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1319");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) -1, "", (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1320");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1), "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1321");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "", "hi!", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1322");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0d, "hi!", (java.lang.Object) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1323");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "hi!", (java.lang.Object) "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1324");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0f, "hi!", (java.lang.Object) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1325");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 1, "", (java.lang.Object) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1326");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1327");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1, "hi!", (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1328");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10, "", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1329");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0d, "hi!", (java.lang.Object) (-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1330");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1331");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1332");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1333");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1334");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0, "hi!", (java.lang.Object) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1335");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "", "", (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1336");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1337");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0, "hi!", (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1338");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) false, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1339");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 0, "hi!", (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1340");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "hi!", (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1341");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1342");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1343");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1344");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1, (java.lang.Object) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1345");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1346");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 10, "", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1347");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0f), "", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1348");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0d, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1349");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1), "", (java.lang.Object) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1350");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1351");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1352");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1.0d), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1353");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1L), (java.lang.Object) 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1354");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0d, "hi!", (java.lang.Object) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1355");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0d, "", (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1356");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1357");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0.0f, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1358");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0d, "", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1359");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 0, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1360");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1), "hi!", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1361");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10L, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1362");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) false, "hi!", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1363");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1364");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "", (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1365");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0d), "", (java.lang.Object) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1366");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "", (java.lang.Object) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1367");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) -1, "hi!", (java.lang.Object) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1368");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0f, "hi!", (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1369");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) false, (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1370");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1371");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0, "", (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1372");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0f), (java.lang.Object) (-1.0d), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1373");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", (java.lang.Object) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1374");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) '#', "", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1375");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1376");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1377");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0, (java.lang.Object) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1378");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 1, "hi!", (java.lang.Object) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1379");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1380");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1381");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0d, "", (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1382");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1383");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100L, (java.lang.Object) "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1384");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1385");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0.0d, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1386");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 10, "", (java.lang.Object) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1387");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 1, "hi!", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1388");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0d, "hi!", (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1389");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "hi!", "hi!", (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1390");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10, "", (java.lang.Object) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1391");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1392");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1393");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1394");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0d), "hi!", (java.lang.Object) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1395");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1396");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0f, "", (java.lang.Object) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1397");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1398");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 10, (java.lang.Object) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1399");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1.0d, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1400");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0L, "", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1401");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1402");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "", "", (java.lang.Object) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1403");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1404");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 0, "", (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1405");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) '#', "hi!", (java.lang.Object) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1406");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0, "hi!", obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1407");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "hi!", "", (java.lang.Object) (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1408");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(obj0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1409");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "hi!", "", (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1410");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0d, "hi!", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1411");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1L), (java.lang.Object) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1412");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1413");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1414");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1415");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 1, "", (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1416");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100.0d, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1417");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 1, (java.lang.Object) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1418");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1419");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) -1, (java.lang.Object) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1420");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1421");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) fieldUtils0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1422");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1423");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) true, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1424");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0L, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1425");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1426");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) '#', (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1427");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 'a', "", (java.lang.Object) 10.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1428");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '4', "hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1429");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1430");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 0, (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1431");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1, "hi!", (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1432");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1433");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1L, (java.lang.Object) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1434");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1435");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0, "", (java.lang.Object) 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1436");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100L, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1437");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1438");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) ' ', "", (java.lang.Object) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1439");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0.0f, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1440");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) '4', (java.lang.Object) 10.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1441");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1442");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1L), "", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1443");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1444");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100, "", (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1445");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 10.0f, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1446");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) -1, "hi!", (java.lang.Object) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1447");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0.0f, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1448");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1449");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1450");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100.0f, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1451");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0f, "hi!", (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1452");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '#', "", (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1453");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0d, "hi!", (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1454");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0d, obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1455");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1456");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0d, "", (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1457");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1, "hi!", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1458");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) -1, "hi!", (java.lang.Object) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1459");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1460");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0d, "", (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1461");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0, "hi!", (java.lang.Object) (-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1462");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0d, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1463");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "", (java.lang.Object) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1464");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 100, "", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1465");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1L), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1466");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0L, "", (java.lang.Object) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1467");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "hi!", "", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1468");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1469");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1470");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) '4', "", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1471");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1472");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10L, (java.lang.Object) (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1473");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 1, "", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1474");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0d, "", (java.lang.Object) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1475");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0d, "", (java.lang.Object) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1476");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 1, (java.lang.Object) fieldUtils2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1477");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 1, "", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1478");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 100, "hi!", (java.lang.Object) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1479");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) -1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1480");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "hi!", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1481");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1482");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) false, "hi!", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1483");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0L, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1484");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 1, "hi!", (java.lang.Object) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1485");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '4', "hi!", (java.lang.Object) "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1486");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1487");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0d, "hi!", (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1488");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1), "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1489");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1490");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1L), "", (java.lang.Object) false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1491");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0f, "hi!", (java.lang.Object) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1492");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1493");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) false, "hi!", (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1494");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1495");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1496");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1497");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) fieldUtils0, "hi!", (java.lang.Object) 10.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1498");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0d, (java.lang.Object) "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1499");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) -1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils2.FieldUtils1500");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0d, "", (java.lang.Object) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

