package FieldUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FieldUtils0 {

    public static boolean debug = false;

    @Test
    public void FieldUtils0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0001");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0d, "", (java.lang.Object) 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0002");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0003");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readStaticField(field0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0004");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, obj1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0005");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 0, "", (java.lang.Object) 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0006");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0, "", (java.lang.Object) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0007");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100.0d, (java.lang.Object) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0008");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 10, (java.lang.Object) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0009");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1L, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0010");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0011");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0012");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) -1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0013");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0014");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0015");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) false, "hi!", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0016");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) 1.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0017");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0018");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readStaticField(field0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0019");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0020");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1.0f, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0021");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj1 = org.apache.commons.lang3.reflect.FieldUtils.readStaticField(field0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0022");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0023");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0024");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0f, "", (java.lang.Object) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0025");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0.0f, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0026");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 10, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0027");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) false, "", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0028");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 'a', "hi!", (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0029");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0030");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0031");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) ' ', (java.lang.Object) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0032");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1.0d), "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0033");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) fieldUtils1, (java.lang.Object) (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0034");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100L, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0035");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 0, "", (java.lang.Object) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0036");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0037");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 1, "", (java.lang.Object) (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0038");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0f, "", (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0039");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1L, "", (java.lang.Object) (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0040");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) -1, "", (java.lang.Object) 10.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0041");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0042");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0043");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) true, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0044");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) fieldUtils1, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0045");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0046");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 10, "", (java.lang.Object) fieldUtils2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0047");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0048");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0049");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "", (java.lang.Object) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0050");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0051");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", obj3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0052");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10, "", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0053");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0054");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0055");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0056");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100.0d, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0057");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0058");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0f), "hi!", (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0059");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0060");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10L, "", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0061");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0062");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "hi!", "hi!", (java.lang.Object) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0063");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) -1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0064");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0065");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1.0f), "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0066");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0067");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 'a', "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0068");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1), (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0069");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 10.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0070");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(obj0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0071");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0072");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) true, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0073");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0074");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100.0d, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0075");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 'a', "", (java.lang.Object) (-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0076");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 10.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0077");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0078");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) fieldUtils0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0079");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0080");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 100, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0081");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0082");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1.0f, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0083");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0084");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0L, (java.lang.Object) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0085");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1.0f, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0086");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "hi!", (java.lang.Object) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0087");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) fieldUtils0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class org.apache.commons.lang3.reflect.FieldUtils");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0088");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0089");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0090");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 100, "hi!", (java.lang.Object) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0091");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0092");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 10, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0093");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0094");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100L, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0095");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0096");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 100.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0097");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100, "hi!", (java.lang.Object) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0098");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0L, "", (java.lang.Object) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0099");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0100");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0101");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0102");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0103");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0104");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0105");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 0, "hi!", (java.lang.Object) 10.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0106");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0107");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0108");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0d, "hi!", (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0109");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) fieldUtils1, (java.lang.Object) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0110");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1), obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0111");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0f, "", (java.lang.Object) "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0112");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
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
    public void FieldUtils0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0113");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1.0f), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0114");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0115");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) false, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0116");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0117");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0118");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) wildcardClass1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0119");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) true, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0120");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) wildcardClass3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0121");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0122");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0d, "hi!", (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0123");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) false, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0124");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "", "", (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0125");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 100, (java.lang.Object) (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0126");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0127");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) wildcardClass2, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0128");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 0, (java.lang.Object) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0129");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 100, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0130");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0f, "", (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0131");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0132");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 100, "", (java.lang.Object) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0133");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0134");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) fieldUtils1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0135");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 10, "", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0136");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0f), "hi!", (java.lang.Object) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0137");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1L), (java.lang.Object) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0138");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0139");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1), obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0140");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 100, "hi!", (java.lang.Object) 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0141");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0142");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0f, "hi!", (java.lang.Object) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0143");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "hi!", "hi!", (java.lang.Object) (-1.0d), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0144");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100L, (java.lang.Object) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0145");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) fieldUtils1, (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0146");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100.0f, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0147");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0d, "", (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0148");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 10, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0149");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0150");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0151");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0152");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0153");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0d), (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0154");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 0, "hi!", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0155");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 0, "", (java.lang.Object) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0156");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100, "", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0157");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) -1, "", (java.lang.Object) (-1L), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0158");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) fieldUtils1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0159");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0160");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0161");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0162");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 0.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0163");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0f, "hi!", (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0164");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0165");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0f, "hi!", (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0166");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10.0f, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0167");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0, obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0168");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) ' ', (java.lang.Object) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0169");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "hi!", (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0170");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0f), "", (java.lang.Object) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0171");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0172");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0f, "hi!", (java.lang.Object) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0173");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10, "hi!", (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0174");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, obj1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0175");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0176");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 10, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0177");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) fieldUtils0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0178");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0179");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0180");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) wildcardClass1, "hi!", (java.lang.Object) 100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0181");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) "", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0182");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0.0f, (java.lang.Object) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0183");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 10, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0184");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0185");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0186");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0187");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1.0f, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0188");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) ' ', "", (java.lang.Object) fieldUtils2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0189");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1L), "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0190");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '#', "hi!", (java.lang.Object) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0191");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0192");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0f, (java.lang.Object) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0193");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) wildcardClass2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0194");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 10.0d, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0195");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0196");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1), "", (java.lang.Object) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0197");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1L, "", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0198");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0199");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(obj0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0200");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 100, (java.lang.Object) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0201");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0f), "hi!", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0202");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) false, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0203");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0d), "hi!", (java.lang.Object) 10.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0204");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(obj0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Object");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0205");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0, (java.lang.Object) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0206");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0d, "hi!", (java.lang.Object) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0207");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0208");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0209");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0210");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0211");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (-1.0d), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0212");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0213");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0214");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 0, (java.lang.Object) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0215");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0d, "hi!", (java.lang.Object) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0216");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0217");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0218");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10, "", (java.lang.Object) "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0219");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) fieldUtils0, "hi!", (java.lang.Object) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0220");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 10, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0221");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0222");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0223");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(obj0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Object");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0224");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
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
    public void FieldUtils0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0225");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0226");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
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
    public void FieldUtils0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0227");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) -1, "hi!", (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0228");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1.0d, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0229");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0230");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0231");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0d, "", (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0232");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) wildcardClass1, "hi!", (java.lang.Object) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0233");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0d, "hi!", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0234");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0d, "hi!", (java.lang.Object) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0235");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10L, (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0236");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0237");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(obj0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0238");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0239");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0240");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 10, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0241");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 0, (java.lang.Object) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0242");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0243");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1, "hi!", (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0244");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) fieldUtils0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class org.apache.commons.lang3.reflect.FieldUtils");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0245");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0246");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0.0f, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0247");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0f, "hi!", (java.lang.Object) true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0248");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0249");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0250");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0f), (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0251");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) wildcardClass3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0252");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (-1.0d), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0253");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "hi!", (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0254");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) -1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0255");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0256");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, obj1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0257");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(obj0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0258");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) wildcardClass2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0259");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0260");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) wildcardClass2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0261");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0262");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10L, "hi!", (java.lang.Object) true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0263");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 100, "hi!", (java.lang.Object) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0264");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0265");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 100, "hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0266");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0f, "hi!", (java.lang.Object) 1.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0267");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
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
    public void FieldUtils0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0268");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) "hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0269");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0270");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0271");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0272");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) wildcardClass2, (java.lang.Object) "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0273");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) -1, "", (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0274");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100.0d, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0275");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1.0d, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0276");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0277");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0278");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0f, "", (java.lang.Object) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0279");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils3 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) fieldUtils1, (java.lang.Object) fieldUtils3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0280");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0f, "hi!", (java.lang.Object) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0281");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100L, (java.lang.Object) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0282");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0f, "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0283");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0284");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0f, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0285");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0d), "", (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0286");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0287");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0288");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0289");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1), (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0290");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0291");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0f, "hi!", (java.lang.Object) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0292");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0.0d, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0293");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1L, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0294");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0295");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) false, "", (java.lang.Object) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0296");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0297");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0298");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0299");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, obj1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0300");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) false, "hi!", (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0301");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 10.0f, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0302");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 10, (java.lang.Object) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0303");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0304");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0L, (java.lang.Object) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0305");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0306");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0307");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) fieldUtils0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0308");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 0, "hi!", (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0309");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100.0d, (java.lang.Object) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0310");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1L), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0311");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 0, "hi!", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0312");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0.0f, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0313");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) wildcardClass1, "hi!", (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0314");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0315");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) false, "", (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0316");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0317");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1L), "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0318");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) ' ', "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0319");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0320");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
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
    public void FieldUtils0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0321");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1), "hi!", (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0322");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0323");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) wildcardClass1, "", (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0324");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 'a', (java.lang.Object) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0325");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0326");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 10, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0327");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(obj0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Object");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0328");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10L, (java.lang.Object) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0329");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) fieldUtils0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0330");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0d, (java.lang.Object) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0331");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) ' ', "", (java.lang.Object) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0332");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 10, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0333");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) fieldUtils1, (java.lang.Object) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0334");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0335");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 0, "", (java.lang.Object) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0336");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0.0d, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0337");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0338");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0339");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 1, "hi!", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0340");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) -1, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0341");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) false, "hi!", (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0342");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0d), (java.lang.Object) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0343");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 0, "", (java.lang.Object) 0.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0344");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 'a', "", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0345");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0346");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0d, "", (java.lang.Object) fieldUtils2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0347");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0348");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0349");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100L, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0350");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1.0f), "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0351");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0352");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 0, (java.lang.Object) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0353");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100.0f, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0354");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 10, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0355");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "", "hi!", (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0356");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 100, "", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0357");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0358");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0L, "hi!", (java.lang.Object) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0359");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0360");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) -1, "", (java.lang.Object) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0361");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 0, "", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0362");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0363");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 1, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0364");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 1, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0365");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 100, "", (java.lang.Object) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0366");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0367");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 1, "hi!", obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0368");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "hi!", (java.lang.Object) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0369");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0370");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0371");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0372");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0373");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 'a', (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0374");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10, "", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0375");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (byte) 10, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0376");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0.0d, (java.lang.Object) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0377");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10.0d, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0378");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 1, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0379");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0380");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 10, "hi!", (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0381");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0382");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '#', "", (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0383");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100.0d, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0384");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0385");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0386");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1.0d), "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0387");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 1, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0388");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0f, "hi!", (java.lang.Object) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0389");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0L, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0390");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0f, "hi!", (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0391");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "", "", (java.lang.Object) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0392");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0393");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1L, "", (java.lang.Object) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0394");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0395");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100.0d, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0396");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0397");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) true, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0398");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0399");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0400");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0401");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 1, "", (java.lang.Object) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0402");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) wildcardClass1, "", (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0403");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1, "", (java.lang.Object) false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0404");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 0, "", (java.lang.Object) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0405");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100L, "hi!", (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0406");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0f), (java.lang.Object) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0407");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1L), "", (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0408");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1), "hi!", obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0409");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0, "", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0410");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 10, "hi!", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0411");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 0, "hi!", (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0412");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100.0d, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0413");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) fieldUtils1, obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0414");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0.0f, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0415");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 0, (java.lang.Object) "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0416");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "", "hi!", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0417");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100.0f, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0418");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0d, "", (java.lang.Object) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0419");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0420");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 10, "", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0421");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1.0d), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0422");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 10, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0423");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1L, "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0424");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 0L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0425");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0426");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 10, "hi!", (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0427");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0428");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0d, "", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0429");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) -1, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0430");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "", (java.lang.Object) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0431");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0d, "hi!", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0432");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0433");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) "hi!", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0434");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 100, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0435");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 0, (java.lang.Object) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0436");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0437");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0f, "hi!", (java.lang.Object) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0438");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0f, "hi!", (java.lang.Object) wildcardClass3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0439");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0f), "", (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0440");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0f), "", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0441");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0f, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0442");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", (java.lang.Object) 100.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0443");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) false, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0444");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1), "", (java.lang.Object) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0445");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0d), (java.lang.Object) false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0446");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "hi!", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0447");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) true, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0448");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0449");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 1, "", (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0450");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 10.0d, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0451");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0452");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10, (java.lang.Object) (-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0453");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0454");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 0, "", (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0455");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0d, "", obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0456");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 10, "hi!", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0457");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) true, "", (java.lang.Object) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0458");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0459");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) '#', (java.lang.Object) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0460");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0d, "hi!", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0461");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) '4', (java.lang.Object) 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0462");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 0, (java.lang.Object) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0463");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) -1, "hi!", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0464");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0465");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(obj0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Object");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0466");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0f, "", (java.lang.Object) "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0467");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0468");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) '4', "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0469");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 10, "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0470");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0471");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) -1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0472");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0f, "", (java.lang.Object) false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0473");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 10, "", (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0474");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10L, "hi!", (java.lang.Object) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0475");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100, "hi!", (java.lang.Object) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0476");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0477");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0478");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0d), "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0479");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 1, "", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0480");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) 100, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0481");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 10, (java.lang.Object) (-1.0d), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0482");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0483");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 0, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0484");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(obj0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0485");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1, "hi!", (java.lang.Object) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0486");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) '#', "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0487");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0488");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0489");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0490");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0.0d, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0491");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 10.0d, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0492");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0493");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 100, "hi!", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0494");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 10, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0495");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0496");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0497");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1, "hi!", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0498");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) wildcardClass2, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FieldUtils0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0499");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 100, "", (java.lang.Object) fieldUtils2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils0.FieldUtils0500");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1.0d), "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

